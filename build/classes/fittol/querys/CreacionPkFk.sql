/**
 * Hecho con <3 por:
 * @author GarciHard
 * 09-oct-2016
 */

--Conexion como usuario FITTOL_DB para la creacion de las PK & FK
CONNECT fittol_db/fittolpwd;

----------------------------------PRIMARY KEY----------------------------------
--CREACION DE PK PARA LA TABLA fittol_db.empleados
ALTER TABLE fittol_db.empleados
ADD CONSTRAINT emp_id_pk PRIMARY KEY (emp_id);

--CREACION DE PK PARA LA TABLA fittol_db.cargos
ALTER TABLE fittol_db.cargos
ADD CONSTRAINT car_id_pk PRIMARY KEY (car_id);

--CREACION DE PK PARA LA TABLA fittol_db.horarios
ALTER TABLE fittol_db.horarios
ADD CONSTRAINT hor_id_pk PRIMARY KEY (hor_id);

--CREACION DE PK PARA LA TABLA fittol_db.clientes
ALTER TABLE fittol_db.clientes
ADD CONSTRAINT cte_id_pk PRIMARY KEY (cte_id);

--CREACION DE PK PARA LA TABLA fittol_db.rutinas
ALTER TABLE fittol_db.rutinas
ADD CONSTRAINT rut_id_pk PRIMARY KEY (rut_id);

--CREACION DE PK PARA LA TABLA fittol_db.dietas
ALTER TABLE fittol_db.dietas
ADD CONSTRAINT die_id_pk PRIMARY KEY (die_id);

--CREACION DE PK PARA LA TABLA fittol_db.membresias
ALTER TABLE fittol_db.membresias
ADD CONSTRAINT mem_id_pk PRIMARY KEY (mem_id);

--CREACION DE PK PARA LA TABLA fittol_db.ventas
ALTER TABLE fittol_db.ventas
ADD CONSTRAINT ven_id_pk PRIMARY KEY (ven_id);

--CREACION DE PK PARA LA TABLA fitto_db.clienteMembresia
ALTER TABLE fittol_db.clienteMembresia
ADD CONSTRAINT cteMem_id_pk PRIMARY KEY (cteMem_id);

----------------------------------FOREIGN KEY----------------------------------
--CREACION DE FK PARA LA TABLA fittol_db.usuarios SOBRE fittol_db.empleados
ALTER TABLE fittol_db.usuarios
ADD CONSTRAINT usr_emp_id_fk FOREIGN KEY (emp_id)
REFERENCES fittol_db.empleados (emp_id);

--CREACION DE FK PARA LA TABLA fittol_db.cargos SOBRE fittol_db.horarios
ALTER TABLE fittol_db.cargos
ADD CONSTRAINT car_hor_id_fk FOREIGN KEY (hor_id)
REFERENCES fittol_db.horarios (hor_id);

--CREACION DE FK PARA LA TABLA fittol_db.empleados SOBRE fittol_db.cargos
ALTER TABLE fittol_db.empleados
ADD CONSTRAINT emp_car_id_fk FOREIGN KEY (car_id)
REFERENCES fittol_db.cargos (car_id);

--CREACION DE FK PARA LA TABLA fittol_db.clienteDisciplina SOBRE fittol_db.clientes
ALTER TABLE fittol_db.clienteDisciplina
ADD CONSTRAINT cteDis_cte_id_fk FOREIGN KEY (cte_id)
REFERENCES fittol_db.clientes (cte_id);

--CREACION DE FK PARA LA TABLA fittol_db.clienteDisciplina SOBRE fittol_db.rutinas
ALTER TABLE fittol_db.clienteDisciplina
ADD CONSTRAINT cteDis_rut_id_fk FOREIGN KEY (rut_id)
REFERENCES fittol_db.rutinas (rut_id);

--CREACION DE FK PARA LA TABLA fittol_db.clienteDisciplina SOBRE fittol_db.dietas
ALTER TABLE fittol_db.clienteDisciplina
ADD CONSTRAINT cteDis_die_id_fk FOREIGN KEY (die_id)
REFERENCES fittol_db.dietas (die_id);

--CREACION DE FK PARA LA TABLA fittol_db.ventas SOBRE fittol_db.empleados
ALTER TABLE fittol_db.ventas
ADD CONSTRAINT ven_emp_id_fk FOREIGN KEY (emp_id)
REFERENCES fittol_db.empleados (emp_id);

--CREACION DE FK PARA LA TABLA fittol_db.ventas SOBRE fittol_db.clienteMembresia
ALTER TABLE fittol_db.ventas
ADD CONSTRAINT ven_cteMem_id_fk FOREIGN KEY (cteMem_id)
REFERENCES fittol_db.clienteMembresia (cteMem_id);

--CREACION DE FK PARA LA TABLA fittol_db.clienteMembresia SOBRE fittol_db.clientes
ALTER TABLE fittol_db.clienteMembresia
ADD CONSTRAINT cteMem_cte_id_fk FOREIGN KEY (cte_id)
REFERENCES fittol_db.clientes (cte_id);

--CREACION DE FK PARA LA TABLA fittol_db.clienteMembresia SOBRE fittol_db.membresias
ALTER TABLE fittol_db.clienteMembresia
ADD CONSTRAINT cteMem_mem_id_fk FOREIGN KEY (mem_id)
REFERENCES fittol_db.membresias (mem_id);

--CREACION DE FK PARA LA TABLA fittol_db.asistenciaClientes SOBRE fittol_db.clientes
ALTER TABLE fittol_db.asistenciaClientes
ADD CONSTRAINT asisCte_cte_id_fk FOREIGN KEY (cte_id)
REFERENCES fittol_db.clientes (cte_id);
--------------------------------------------------------------------------------
