USE jugos;

CREATE TABLE Clientes (
DNI VARCHAR(10),
Nombre VARCHAR(150),
Direccion1 VARCHAR(150),
Direccion2 VARCHAR(150),
Barrio VARCHAR(50),
Ciudad VARCHAR(50),
Estadio VARCHAR(50),
CP VARCHAR(10),
Edad SMALLINT,
Sexo VARCHAR(1),
LimiteCredito FLOAT,
VolumenCompra FLOAT,
PrimeraCompra BIT(1));