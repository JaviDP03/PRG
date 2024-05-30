-- ALUMNO (ID, Nombre, Apellidos)
INSERT INTO ALUMNO VALUES (11, 'Antonio', 'Lopez', 'MAÑANA');
INSERT INTO ALUMNO VALUES (12, 'Sara', 'Lozano', 'MAÑANA');
INSERT INTO ALUMNO VALUES (13, 'Carmen', 'Marquez', 'MAÑANA');
INSERT INTO ALUMNO VALUES (14, 'Susana', 'Fontanilla', 'TARDE');
INSERT INTO ALUMNO VALUES (15, 'Tomas', 'Ruiz', 'TARDE');

-- PROFESOR (ID, Nombre, Apellidos, Especialidad)
INSERT INTO PROFESOR VALUES (21, 'Fernando', 'Alonso', 'coche');
INSERT INTO PROFESOR VALUES (22, 'Carlos', 'Sainz', 'coche');
INSERT INTO PROFESOR VALUES (23, 'Sebastian', 'Vettel', 'coche');
INSERT INTO PROFESOR VALUES (24, 'Marc', 'Marquez', 'moto');
INSERT INTO PROFESOR VALUES (25, 'Valentino', 'Rossi', 'moto');

-- CLASE (ID, Fecha, Duracion, Precio, Pagada, ID_Alumno, ID_Profesor)
INSERT INTO CLASE VALUES (1, '21-05-2024', 30, 18.0, true, 11, 21);
INSERT INTO CLASE VALUES (2, '22-05-2024', 30, 18.0, false, 11, 21);
INSERT INTO CLASE VALUES (3, '24-05-2024', 30, 18.0, true, 12, 21);
INSERT INTO CLASE VALUES (4, '24-05-2024', 30, 18.0, false, 12, 22);
INSERT INTO CLASE VALUES (5, '24-05-2024', 30, 18.0, true, 13, 23);
INSERT INTO CLASE VALUES (6, '24-05-2024', 60, 36.0, false, 13, 23);
INSERT INTO CLASE VALUES (7, '24-05-2024', 20, 15.0, true, 14, 24);
INSERT INTO CLASE VALUES (8, '24-05-2024', 20, 15.0, false, 14, 24);
INSERT INTO CLASE VALUES (9, '24-05-2024', 20, 15.0, false, 14, 25);
INSERT INTO CLASE VALUES (10, '24-05-2024', 20, 15.0, true, 15, 25);
INSERT INTO CLASE VALUES (11, '24-05-2024', 20, 15.0, false, 15, 25);


COMMIT;

