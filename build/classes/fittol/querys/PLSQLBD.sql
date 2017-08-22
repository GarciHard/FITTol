/**
 * Hecho con <3 por:
 * @author GarciHard
 * 09-oct-2016
 */

--FUNCION PARA VERIFICAR QUE EXISTA EL USUARIO EN LA BD, ASI COMO SU CARGO Y
--EL STATUS ACTUAL DEL MISMO, EN CASO DE TENER UN STATUS VALOR 0 SIGNIFICA QUE
--YA NO ES UN EMPLEADO(USUARIO), DEVUELVE DIFERENTES VALORES PARA DETERMINAR
--EL CARGO QUE OCUPA DENTRO DEL GYM >>10 = GERENTE ; 20 = RECEPCIONISTA<<
CREATE OR REPLACE FUNCTION empCargoActivo(empUsr VARCHAR2, empPwd VARCHAR2)
RETURN NUMBER IS

  v_empCargo fittol_db.cargos.car_nombre%TYPE;
  v_empStatus NUMBER;
  v_empActivo NUMBER;
  
BEGIN 
  SELECT car_nombre, emp_status
  INTO v_empCargo, v_empStatus
  FROM fittol_db.cargos c
  JOIN fittol_db.empleados e
  ON   c.car_id = e.car_id
  JOIN fittol_db.usuarios u
  ON   e.emp_id = u.emp_id
  WHERE lower(usr_usuario) LIKE empUsr
  AND lower(usr_passwd) LIKE empPwd;
    
  IF lower(v_empCargo) like '%ger%' THEN
    IF v_empStatus = 1 THEN
      v_empActivo := 10;
    ELSE
      v_empActivo := 0;
    END IF;
  ELSIF lower(v_empCargo) like '%rec%' THEN
    IF v_empStatus = 1 THEN
      v_empActivo := 20;
    ELSE
      v_empActivo := 0;
    END IF;
  ELSE 
    v_empActivo := 0;
  END IF;
  
  RETURN v_empActivo;
  
  EXCEPTION
  WHEN NO_DATA_FOUND THEN
    v_empActivo := 0;
    
  RETURN v_empActivo;
END;
/


-- PROCEDIMIENTO ALMACENADO PARA INGRESAR SOCIOS A LA BD
CREATE OR REPLACE PROCEDURE createSociosSP (nombreSocio IN VARCHAR,
                                            apPateSocio IN VARCHAR,
                                            apMateSocio IN VARCHAR,
                                            fechaNSocio IN DATE,
                                            sexoSocio   IN VARCHAR,
                                            numTelSocio IN VARCHAR,
                                            fotoSocio   IN BLOB)
IS
BEGIN
  INSERT INTO fittol_db.clientes
  VALUES (fittol_db.clientes_seq.nextval, nombreSocio, apPateSocio, apMateSocio,
          fechaNSocio, sexoSocio, numTelSocio, to_date(sysdate, 'DD/MM/YYYY'),
          0, fotoSocio);
END createSociosSP;

-- FUNCION PARA SABER EL ESTADO DE MEMBRESIA DE UN SOCIO
-- EN CASO DE EXISTIR ALGUN MENSAJE DEVUELVE UN VALOR
-- EJECUTA UN STORED PROCEDURE DONDE SE QUEDA REGISTRADA LA ASISTENCIA
CREATE OR REPLACE FUNCTION registrarAsistenciaFN(numSocio VARCHAR2)
RETURN VARCHAR IS

  v_cteStatus NUMBER;
  v_cteMsg NUMBER;
  v_socioID NUMBER := numSocio;
BEGIN

  SELECT cte_status
  INTO v_cteStatus
  FROM fittol_db.clientes
  WHERE cte_id like v_socioID;
  
  IF v_cteStatus = 0 THEN
    v_cteMsg := 10;
  ELSE
    SELECT (ctemem_fechafin - ctemem_fechaini)
    INTO v_cteMsg
    FROM fittol_db.clientemembresia
    WHERE cte_id like v_socioID;
  END IF;

  RETURN v_cteMsg;
  
  EXCEPTION
  WHEN NO_DATA_FOUND THEN
    v_cteMsg := 0;
    
  RETURN v_cteMsg;

END;
/

-- FUNCION ACTUALIZADA PARA SABER EL ESTADO DE LA MEMBRESIA
-- ASI COMO LOS DIAS RESTANTES PARA FINALIZAR LA MEMBRESIA
CREATE OR REPLACE FUNCTION registrarAsistenciaFN_2(numSocio VARCHAR2)
RETURN NUMBER IS
  
  v_socioID NUMBER := numSocio;
  v_fechamem DATE;
  v_dias NUMBER;
BEGIN
  SELECT (ctemem_fechaini + (ctemem_fechafin - ctemem_fechaini))
  INTO v_fechamem
  FROM fittol_db.clientemembresia
  WHERE cte_id LIKE v_socioID;

  IF TO_DATE(SYSDATE, 'DD/MM/YYYY') >= v_fechamem THEN
  v_dias := 0;
  ELSE
    SELECT ctemem_fechafin - TO_DATE(SYSDATE, 'DD/MM/YYYY')
    INTO v_dias
    FROM fittol_db.clientemembresia
    WHERE cte_id LIKE v_socioID;
END IF;
  RETURN v_dias;
END;
/
--------------------------------------------------------------------------------

CREATE OR REPLACE PROCEDURE registrarAsistenciaSP(numSocio IN VARCHAR2)
IS
BEGIN
  INSERT INTO fittol_db.asistenciaclientes
  VALUES(numSocio, to_date(sysdate, 'DD/MM/YYYY'), to_char(sysdate, 'HH24:MI:SS'));
END registrarAsistenciaSP;

-- STORED PROCEDURE PARA REGISTAR UNA VENTA INDIVIDUAL AL SOCIO
CREATE OR REPLACE PROCEDURE ventaMembresiaSP(cteID IN VARCHAR2,
                                           memID IN VARCHAR2,
                                           empID IN VARCHAR2)
IS
  v_memDuracion NUMBER;
  v_memCosto NUMBER;
  v_cteMemID NUMBER; 
BEGIN
  SELECT mem_duracion, mem_costo
  INTO v_memDuracion, v_memCosto
  FROM fittol_db.membresias
  WHERE mem_id like memID;
  
  INSERT INTO fittol_db.clientemembresia
  VALUES(fittol_db.cteMem_seq.nextval,
         cteID,
         memID,
         to_date(sysdate, 'DD/MM/YYYY'),
         to_date(sysdate, 'DD/MM/YYYY') + v_memDuracion
  );
  
  SELECT max(ctemem_id)
  INTO v_cteMemID
  FROM fittol_db.clientemembresia;
  
  INSERT INTO fittol_db.ventas
  VALUES(fittol_db.ventas_seq.nextval,
         to_date(sysdate, 'DD/MM/YYYY'),
         empID,
         v_cteMemID,
         1, v_memCosto      
  );
  
  UPDATE fittol_db.clientes
  SET cte_status = 1
  WHERE cte_id like cteID;
END ventaMembresiaSP;