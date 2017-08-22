/**
 * Hecho con <3 por:
 * @author GarciHard
 * 09-oct-2016
 */

-----------------SECUENCIA PARA LA TABLA fittol_db.empleados-----------------
CREATE SEQUENCE fittol_db.empleados_seq
START WITH 10000
INCREMENT BY 1
MAXVALUE 19999
NOCACHE
NOCYCLE;

-----------------SECUENCIA PARA LA TABLA fittol_db.clientes-----------------
CREATE SEQUENCE fittol_db.clientes_seq
START WITH 20000
INCREMENT BY 1
MAXVALUE 39999
NOCACHE
NOCYCLE;

-----------------SECUENCIA PARA LA TABLA fittol_db.ventas-----------------
CREATE SEQUENCE fittol_db.ventas_seq
START WITH 40000
INCREMENT BY 1
MAXVALUE 59999
NOCACHE
NOCYCLE;

-----------------SECUENCIA PARA LA TABLA fittol_db.ventas-----------------
CREATE SEQUENCE fittol_db.cteMem_seq
START WITH 60000
INCREMENT BY 1
MAXVALUE 79999
NOCACHE
NOCYCLE;
