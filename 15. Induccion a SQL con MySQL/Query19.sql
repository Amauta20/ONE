ALTER TABLE vendedores ADD COLUMN (FechaAdmision DATE, Vacaciones bit);

SELECT * FROM vendedores;

UPDATE Vendedores SET FechaAdmision = '2014-08-15', Vacaciones = 0
WHERE Matricula = '00235';

UPDATE Vendedores SET PorcentajeComision = 0.08, FechaAdmision = '2013-09-17', Vacaciones = 1
WHERE Matricula = '00236';

ALTER TABLE vendedores ADD PRIMARY KEY (Matricula);

INSERT INTO vendedores (Matricula, Nombre, PorcentajeComision, FechaAdmision, Vacaciones)
VALUES ('00237', 'Roberta Martins', 0.11, '2017-03-18', 1);

INSERT INTO vendedores (Matricula, Nombre, PorcentajeComision, FechaAdmision, Vacaciones)
VALUES ('00238', 'Péricles Alves', 0.11, '2016-08-21', 0);