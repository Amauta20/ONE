SELECT * FROM clientes
WHERE FechaNacimiento = '1995-01-11';

SELECT * FROM clientes
WHERE FechaNacimiento > '1995-01-11';

SELECT * FROM clientes
WHERE FechaNacimiento <= '1995-01-11';

SELECT * FROM clientes
WHERE year(FechaNacimiento) = '1995';

SELECT * FROM clientes
WHERE day(FechaNacimiento) = '20';