USE jugos;

ALTER TABLE clientes ADD PRIMARY KEY (DNI);

ALTER TABLE clientes ADD COLUMN(FechaNacimiento DATE);

INSERT INTO clientes
(DNI, Nombre, Direccion1, Direccion2, Barrio, Ciudad, Estadio, CP, Edad, Sexo, LimiteCredito, VolumenCompra, PrimeraCompra, FechaNacimiento)
VALUES
('456789548', 'Pedro el Escamoso', 'Calle del Sol, 25', '', 'Los Laureles', 'CDMX', 'México', '65784', 50, 'M', 1000000, 2000, 0, '1973-05-25');

SELECT * FROM clientes;