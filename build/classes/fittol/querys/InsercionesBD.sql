/**
 * Hecho con <3 por:
 * @author GarciHard
 * 09-oct-2016
 */

----------------INSERCION DE DATOS EN LA TABLA fittol_db.horarios----------------
INSERT INTO fittol_db.HORARIOS
VALUES('HOR1', '06:00 - 10:00', '-', '06:00 - 10:00', '-', '06:00 - 10:00', '-');

INSERT INTO fittol_db.HORARIOS
VALUES('HOR2', '-', '06:00 - 10:00', '-', '06:00 - 10:00', '-', '06:00 - 10:00');

INSERT INTO fittol_db.HORARIOS
VALUES('HOR3', '10:00 - 14:00', '-', '10:00 - 14:00', '-', '10:00 - 14:00', '-');

INSERT INTO fittol_db.HORARIOS
VALUES('HOR4', '-', '10:00 - 14:00', '-', '10:00 - 14:00', '-', '10:00 - 14:00');

INSERT INTO fittol_db.HORARIOS
VALUES('HOR5', '15:00 - 19:00', '-', '15:00 - 19:00', '-', '15:00 - 19:00', '-');

INSERT INTO fittol_db.HORARIOS
VALUES('HOR6', '-', '15:00 - 19:00', '-', '15:00 - 19:00', '-', '15:00 - 19:00');

INSERT INTO fittol_db.HORARIOS
VALUES('HOR7', '19:00 - 23:00', '-', '19:00 - 23:00', '-', '19:00 - 23:00', '-');

INSERT INTO fittol_db.HORARIOS
VALUES('HOR8', '-', '19:00 - 23:00', '-', '19:00 - 23:00', '-', '19:00 - 23:00');

INSERT INTO fittol_db.HORARIOS
VALUES('HOR9', '06:00 - 14:00', '-', '06:00 - 14:00', '-', '06:00 - 14:00', '-');

INSERT INTO fittol_db.HORARIOS
VALUES('HOR10', '-', '06:00 - 14:00', '-', '06:00 - 14:00', '-', '06:00 - 14:00');

INSERT INTO fittol_db.HORARIOS
VALUES('HOR11', '15:00 - 23:00', '-', '15:00 - 23:00', '-', '15:00 - 23:00', '-');

INSERT INTO fittol_db.HORARIOS
VALUES('HOR12', '-', '15:00 - 23:00', '-', '15:00 - 23:00', '-', '15:00 - 23:00');

INSERT INTO fittol_db.HORARIOS
VALUES('HOR13', '09:00 - 17:00', '09:00 - 17:00', '09:00 - 17:00', '09:00 - 17:00', '09:00 - 17:00','-');

-----------------INSERCION DE DATOS EN LA TABLA fittol_db.cargos-----------------
INSERT INTO fittol_db.CARGOS
VALUES('CAR1', 'Gerente', 9000, 'HOR13');

INSERT INTO fittol_db.CARGOS
VALUES('CAR2', 'Instructor Mat1', 2500, 'HOR1');

INSERT INTO fittol_db.CARGOS
VALUES('CAR3', 'Instructor Mat2', 2500, 'HOR2');

INSERT INTO fittol_db.CARGOS
VALUES('CAR4', 'Instructor Mat3', 2500, 'HOR3');

INSERT INTO fittol_db.CARGOS
VALUES('CAR5', 'Instructor Mat4', 2500, 'HOR4');

INSERT INTO fittol_db.CARGOS
VALUES('CAR6', 'Instructor Mat5', 2500, 'HOR5');

INSERT INTO fittol_db.CARGOS
VALUES('CAR7', 'Instructor Mat6', 2500, 'HOR6');

INSERT INTO fittol_db.CARGOS
VALUES('CAR8', 'Instructor Mat7', 2500, 'HOR7');

INSERT INTO fittol_db.CARGOS
VALUES('CAR9', 'Instructor Mat8', 2500, 'HOR8');

INSERT INTO fittol_db.CARGOS
VALUES('CAR10', 'Recepcionista Mat1', 3500, 'HOR9');

INSERT INTO fittol_db.CARGOS
VALUES('CAR11', 'Recepcionista Mat2', 3500, 'HOR10');

INSERT INTO fittol_db.CARGOS
VALUES('CAR12', 'Recepcionista Ves1', 3500, 'HOR11');

INSERT INTO fittol_db.CARGOS
VALUES('CAR13', 'Recepcionista Ves2', 3500, 'HOR12');

-----------------INSERCION DE DATOS EN LA TABLA fittol_db.membresias-----------------
INSERT INTO fittol_db.MEMBRESIAS
VALUES('MEM1', 'Visita', 1, 100);

INSERT INTO fittol_db.MEMBRESIAS
VALUES('MEM2', 'Membresia Mensual', 30, 450);

INSERT INTO fittol_db.MEMBRESIAS
VALUES('MEM3', 'Membresia Anual', 365, 4500);

------------------INSERCION DE DATOS  PARA REALIZAR DIVERSAS PRUEBAS------------------
INSERT INTO fittol_db.USUARIOS
VALUES(10000, 'Ulix', '1994Diaz');