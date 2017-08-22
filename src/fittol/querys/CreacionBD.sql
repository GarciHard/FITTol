/**
 * Hecho con <3 por:
 * @author GarciHard
 * 09-oct-2016
 */

-- Conexion al usuario SYSTEM y creacion del usuario FITTOL_DB
CONNECT system/system;

CREATE USER fittol_db IDENTIFIED BY fittolpwd;
--GRANT ALL PRIVILEGES TO fittol_db;
GRANT CREATE SESSION, CREATE TABLE, CREATE PROCEDURE,
CREATE SEQUENCE, CREATE TRIGGER, CREATE VIEW TO fittol_db;

DISCONNECT;

--Conexion como usuario FITTOL_DB para la creacion de las tablas
CONNECT fittol_db/fittolpwd;

--------------------------------------------------------------------------------
--CREACION DE LA TABLA fittol_db.usuarios
CREATE TABLE fittol_db.usuarios(
  emp_id VARCHAR2(5),
  usr_usuario VARCHAR2(25),
  usr_passwd VARCHAR2(15)
);

--CREACION DE LA TABLA fittol_db.empleados
CREATE TABLE fittol_db.empleados(
  emp_id VARCHAR2(5),
  emp_nombre VARCHAR2(30),
  emp_apPaterno VARCHAR2(20),
  emp_apMaterno VARCHAR2(20),
  emp_calle VARCHAR2(50),
  emp_numExt NUMBER(5),
  emp_colonia VARCHAR2(30),
  emp_municipio VARCHAR2(30),
  emp_estado VARCHAR2(20),
  emp_telefono VARCHAR2(10),
  emp_foto BLOB,
  emp_fechaInicio DATE,
  emp_status NUMBER(1),
  car_id VARCHAR2(5)
);

--CREACION DE LA TABLA fittol_db.cargos
CREATE TABLE fittol_db.cargos(
  car_id VARCHAR2(5),
  car_nombre VARCHAR2(20),
  car_salario NUMBER(5),
  hor_id VARCHAR2(5)
);

--CREACION DE LA TABLA fittol_db.horarios
CREATE TABLE fittol_db.horarios(
  hor_id VARCHAR2(5),
  hor_lunes VARCHAR2(15),
  hor_martes VARCHAR2(15),
  hor_miercoles VARCHAR2(15),
  hor_jueves VARCHAR2(15),
  hor_viernes VARCHAR2(15),
  hor_sabados VARCHAR2(15)
);

--CREACION DE LA TABLA fittol_db.clientes
CREATE TABLE fittol_db.clientes(
  cte_id VARCHAR2(5),
  cte_nombre VARCHAR2(30),
  cte_apPaterno VARCHAR2(20),
  cte_apMaterno VARCHAR2(20),
  cte_fechaNacimiento DATE,
  cte_sexo VARCHAR2(1),
  cte_telefono VARCHAR2(10),
  cte_fechaInscripcion date,
  cte_status NUMBER(1),
  cte_foto BLOB
);

--CREACION DE LA TABLA fittol_db.rutinas
CREATE TABLE fittol_db.rutinas(
  rut_id VARCHAR2(5),
  rut_tipo VARCHAR2(20),
  rut_descripcion VARCHAR2(500)
);

--CREACION DE LA TABLA fittol_db.dietas
CREATE TABLE fittol_db.dietas(
  die_id VARCHAR2(5),
  die_tipo VARCHAR2(20),
  die_descripcion VARCHAR2(500)
);

--CREACION DE LA TABLA fittol_db.membresias
CREATE TABLE fittol_db.membresias(
  mem_id VARCHAR2(5),
  mem_nombre VARCHAR2(30),
  mem_duracion NUMBER(3),
  mem_costo NUMBER(4)
);

--CREACION DE LA TABLA fittol_db.ventas
CREATE TABLE fittol_db.ventas(
  ven_id VARCHAR2(5),
  ven_fecha DATE,
  emp_id VARCHAR2(5),
  cteMem_id VARCHAR2(5),
  ven_cantidad NUMBER(2),
  ven_total NUMBER(5)
);

--CREACION DE LA TABLA fittol_db.clienteMembresia
CREATE TABLE fittol_db.clienteMembresia(
  cteMem_id VARCHAR2(5),
  cte_id VARCHAR2(5),
  mem_id VARCHAR2(5),
  cteMem_fechaIni date,
  cteMem_fechaFin date
);

--CREACION DE LA TABLA fittol_db.clienteDisciplina
CREATE TABLE fittol_db.clienteDisciplina(
  cte_id VARCHAR2(5),
  rut_id VARCHAR2(5),
  die_id VARCHAR2(5)
);

--CREACION DE LA TABLA fittol_db.asistenciaClientes
CREATE TABLE fittol_db.asistenciaClientes(
  cte_id VARCHAR2(5),
  asisCte_fecha DATE,
  asisCte_hora VARCHAR2(8)
);
--------------------------------------------------------------------------------
