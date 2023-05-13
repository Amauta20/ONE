USE jugos;

DROP TABLE clientes;

DROP TABLE productos;

CREATE TABLE clientes
(DNI VARCHAR (11) ,
Nombre VARCHAR (100) ,
Direccion1 VARCHAR (150) ,
Direccion2 VARCHAR (150) ,
Barrio VARCHAR (50) ,
Ciudad VARCHAR (50) ,
Estado VARCHAR (4) ,
CP VARCHAR (8) ,
FechaNacimiento DATE,
Edad SMALLINT,
Sexo VARCHAR (1) ,
LimiteCredito FLOAT ,
VolumenCompra FLOAT ,
PrimeraCompra BIT );

ALTER TABLE clientes ADD PRIMARY KEY (DNI);

CREATE TABLE productos
(Producto VARCHAR (20) ,
Nombre VARCHAR (150) ,
Envase VARCHAR (50) ,
Tamano VARCHAR (50) ,
Sabor VARCHAR (50) ,
PrecioLista FLOAT);

ALTER TABLE productos ADD PRIMARY KEY (Producto);

INSERT INTO clientes (DNI, Nombre, Direccion1, Direccion2, Barrio, Ciudad, Estado, CP, FechaNacimiento, Edad, Sexo, LimiteCredito, VolumenCompra, PrimeraCompra) VALUES ('9283760794', 'Edson Calisaya', 'Sta Úrsula Xitla', '', 'Barrio del Niño Jesús', 'Ciudad de México', 'CDMX', '22002002', '1995-01-07', 25, 'M', 150000, 250000, 1);
INSERT INTO clientes (DNI, Nombre, Direccion1, Direccion2, Barrio, Ciudad, Estado, CP, FechaNacimiento, Edad, Sexo, LimiteCredito, VolumenCompra, PrimeraCompra) VALUES ('7771579779', 'Marcelo Perez', 'F.C. de Cuernavaca 13', '', 'Carola', 'Ciudad de México', 'CDMX', '88202912', '1992-01-25', 29, 'M', 120000, 200000, 1);
INSERT INTO clientes (DNI, Nombre, Direccion1, Direccion2, Barrio, Ciudad, Estado, CP, FechaNacimiento, Edad, Sexo, LimiteCredito, VolumenCompra, PrimeraCompra) VALUES ('5576228758', 'Pedro Olivera', 'Pachuca 75', '', 'Condesa', 'Ciudad de México', 'CDMX', '88192029', '1995-01-14', 25, 'F', 70000, 160000, 1);
INSERT INTO clientes (DNI, Nombre, Direccion1, Direccion2, Barrio, Ciudad, Estado, CP, FechaNacimiento, Edad, Sexo, LimiteCredito, VolumenCompra, PrimeraCompra) VALUES ('8502682733', 'Luis Silva', 'Prol. 16 de Septiembre 1156', '', 'Contadero', 'Ciudad de México', 'CDMX', '82122020', '1995-01-07', 25, 'M', 110000, 190000, 0);
INSERT INTO clientes (DNI, Nombre, Direccion1, Direccion2, Barrio, Ciudad, Estado, CP, FechaNacimiento, Edad, Sexo, LimiteCredito, VolumenCompra, PrimeraCompra) VALUES ('1471156710', 'Erica Carvajo', 'Heriberto Frías 1107', '', 'Del Valle', 'Ciudad de México', 'CDMX', '80012212', '1990-01-01', 30, 'F', 170000, 245000, 0);
INSERT INTO clientes (DNI, Nombre, Direccion1, Direccion2, Barrio, Ciudad, Estado, CP, FechaNacimiento, Edad, Sexo, LimiteCredito, VolumenCompra, PrimeraCompra) VALUES ('3623344710', 'Marcos Rosas', 'Av. Universidad', '', 'Del Valle', 'Ciudad de México', 'CDMX', '22002012', '1995-01-13', 26, 'M', 110000, 220000, 1);
INSERT INTO clientes (DNI, Nombre, Direccion1, Direccion2, Barrio, Ciudad, Estado, CP, FechaNacimiento, Edad, Sexo, LimiteCredito, VolumenCompra, PrimeraCompra) VALUES ('50534475787', 'Abel Pintos', 'Carr. México-Toluca 1499', '', 'Cuajimalpa', 'Ciudad de México', 'CDMX', '22000212', '1995-01-11', 25, 'M', 170000, 260000, 0);
INSERT INTO clientes (DNI, Nombre, Direccion1, Direccion2, Barrio, Ciudad, Estado, CP, FechaNacimiento, Edad, Sexo, LimiteCredito, VolumenCompra, PrimeraCompra) VALUES ('5840119709', 'Gabriel Roca', 'Eje Central Lázaro Cárdenas 911', '', 'Del Valle', 'Ciudad de México', 'CDMX', '80010221', '1985-01-16', 36, 'M', 140000, 210000, 1);
INSERT INTO clientes (DNI, Nombre, Direccion1, Direccion2, Barrio, Ciudad, Estado, CP, FechaNacimiento, Edad, Sexo, LimiteCredito, VolumenCompra, PrimeraCompra) VALUES ('94387575700', 'Walter Soruco', 'Calz. de Tlalpan 2980', '', 'Ex Hacienda Coapa', 'Ciudad de México', 'CDMX', '22000201', '1989-01-20', 31, 'M', 60000, 120000, 1);
INSERT INTO clientes (DNI, Nombre, Direccion1, Direccion2, Barrio, Ciudad, Estado, CP, FechaNacimiento, Edad, Sexo, LimiteCredito, VolumenCompra, PrimeraCompra) VALUES ('8719655770', 'Carlos Santivañez', 'Calz. del Hueso 363', '', 'Floresta Coyoacán', 'Ciudad de México', 'CDMX', '81192002', '1983-01-20', 37, 'M', 200000, 240000, 0);
INSERT INTO clientes (DNI, Nombre, Direccion1, Direccion2, Barrio, Ciudad, Estado, CP, FechaNacimiento, Edad, Sexo, LimiteCredito, VolumenCompra, PrimeraCompra) VALUES ('5648641702', 'Paolo Mendez', 'Martires de Tacubaya 65', '', 'Héroes de Padierna', 'Ciudad de México', 'CDMX', '21002020', '1991-01-30', 29, 'M', 120000, 220000, 0);
INSERT INTO clientes (DNI, Nombre, Direccion1, Direccion2, Barrio, Ciudad, Estado, CP, FechaNacimiento, Edad, Sexo, LimiteCredito, VolumenCompra, PrimeraCompra) VALUES ('492472718', 'Jorge Castro', 'Federal México-Toluca 5690', '', 'Locaxco', 'Ciudad de México', 'CDMX', '22012002', '1994-01-19', 26, 'M', 75000, 95000, 1);

INSERT INTO productos (Producto, Nombre, Tamano, Sabor, Envase, PrecioLista) VALUES ('773912', 'Clean', '1 Litro', 'Naranja', 'Botella PET', 8.01);
INSERT INTO productos (Producto, Nombre, Tamano, Sabor, Envase, PrecioLista) VALUES ('838819', 'Clean', '1,5 Litros', 'Naranja', 'Botella PET', 12.01);
INSERT INTO productos (Producto, Nombre, Tamano, Sabor, Envase, PrecioLista) VALUES ('1037797', 'Clean', '2 Litros', 'Naranja', 'Botella PET', 16.01);
INSERT INTO productos (Producto, Nombre, Tamano, Sabor, Envase, PrecioLista) VALUES ('812829', 'Clean', '350 ml', 'Naranja', 'Lata', 2.81);
INSERT INTO productos (Producto, Nombre, Tamano, Sabor, Envase, PrecioLista) VALUES ('479745', 'Clean', '470 ml', 'Naranja', 'Botella de Vidrio', 3.77);
INSERT INTO productos (Producto, Nombre, Tamano, Sabor, Envase, PrecioLista) VALUES ('695594', 'Festival de Sabores', '1,5 Litros', 'Asaí', 'Botella PET', 28.51);
INSERT INTO productos (Producto, Nombre, Tamano, Sabor, Envase, PrecioLista) VALUES ('243083', 'Festival de Sabores', '1,5 Litros', 'Maracuyá', 'Botella PET', 10.51);
INSERT INTO productos (Producto, Nombre, Tamano, Sabor, Envase, PrecioLista) VALUES ('1022450', 'Festival de Sabores', '2 Litros', 'Asái', 'Botella PET', 38.01);
INSERT INTO productos (Producto, Nombre, Tamano, Sabor, Envase, PrecioLista) VALUES ('231776', 'Festival de Sabores', '700 ml', 'Asaí', 'Botella de Vidrio', 13.31);
INSERT INTO productos (Producto, Nombre, Tamano, Sabor, Envase, PrecioLista) VALUES ('723457', 'Festival de Sabores', '700 ml', 'Maracuyá', 'Botella de Vidrio', 4.91);
INSERT INTO productos (Producto, Nombre, Tamano, Sabor, Envase, PrecioLista) VALUES ('746596', 'Light', '1,5 Litros', 'Sandía', 'Botella PET', 19.51);
INSERT INTO productos (Producto, Nombre, Tamano, Sabor, Envase, PrecioLista) VALUES ('1040107', 'Light', '350 ml', 'Sandía', 'Lata', 4.56);
INSERT INTO productos (Producto, Nombre, Tamano, Sabor, Envase, PrecioLista) VALUES ('1002334', 'Línea Citrus', '1 Litro', 'Lima/Limón', 'Botella PET', 7);
INSERT INTO productos (Producto, Nombre, Tamano, Sabor, Envase, PrecioLista) VALUES ('1088126', 'Línea Citrus', '1 Litro', 'Limón', 'Botella PET', 7);
INSERT INTO productos (Producto, Nombre, Tamano, Sabor, Envase, PrecioLista) VALUES ('1041119', 'Línea Citrus', '700 ml', 'Lima/Limón', 'Botella de Vidrio', 4.9);
INSERT INTO productos (Producto, Nombre, Tamano, Sabor, Envase, PrecioLista) VALUES ('1042712', 'Línea Citrus', '700 ml', 'Limón', 'Botella de Vidrio', 4.9);
INSERT INTO productos (Producto, Nombre, Tamano, Sabor, Envase, PrecioLista) VALUES ('520380', 'Pedazos de Frutas', '1 Litro', 'Manzana', 'Botella PET', 12.01);
INSERT INTO productos (Producto, Nombre, Tamano, Sabor, Envase, PrecioLista) VALUES ('788975', 'Pedazos de Frutas', '1,5 Litros', 'Manzana', 'Botella PET', 18.01);
INSERT INTO productos (Producto, Nombre, Tamano, Sabor, Envase, PrecioLista) VALUES ('229900', 'Pedazos de Frutas', '350 ml', 'Manzana', 'Lata', 4.21);
INSERT INTO productos (Producto, Nombre, Tamano, Sabor, Envase, PrecioLista) VALUES ('1101035', 'Refrescante', '1 Litro', 'Frutilla/Limón', 'Botella PET', 9.01);
INSERT INTO productos (Producto, Nombre, Tamano, Sabor, Envase, PrecioLista) VALUES ('1086543', 'Refrescante', '1 Litro', 'Mango', 'Botella PET', 11.01);
INSERT INTO productos (Producto, Nombre, Tamano, Sabor, Envase, PrecioLista) VALUES ('326779', 'Refrescante', '1,5 Litros', 'Mango', 'Botella PET', 16.51);
INSERT INTO productos (Producto, Nombre, Tamano, Sabor, Envase, PrecioLista) VALUES ('826490', 'Refrescante', '700 ml', 'Frutilla/Limón', 'Botella de Vidrio', 6.31);
INSERT INTO productos (Producto, Nombre, Tamano, Sabor, Envase, PrecioLista) VALUES ('1096818', 'Refrescante', '700 ml', 'Mango', 'Botella de Vidrio', 7.71);
INSERT INTO productos (Producto, Nombre, Tamano, Sabor, Envase, PrecioLista) VALUES ('394479', 'Sabor da Montaña', '700 ml', 'Cereza', 'Botella de Vidrio', 8.41);
INSERT INTO productos (Producto, Nombre, Tamano, Sabor, Envase, PrecioLista) VALUES ('783663', 'Sabor da Montaña', '700 ml', 'Frutilla', 'Botella de Vidrio', 7.71);
INSERT INTO productos (Producto, Nombre, Tamano, Sabor, Envase, PrecioLista) VALUES ('1000889', 'Sabor da Montaña', '700 ml', 'Uva', 'Botella de Vidrio', 6.31);
INSERT INTO productos (Producto, Nombre, Tamano, Sabor, Envase, PrecioLista) VALUES ('544931', 'Verano', '350 ml', 'Limón', 'Lata', 2.46);
INSERT INTO productos (Producto, Nombre, Tamano, Sabor, Envase, PrecioLista) VALUES ('235653', 'Verano', '350 ml', 'Mango', 'Lata', 3.86);
INSERT INTO productos (Producto, Nombre, Tamano, Sabor, Envase, PrecioLista) VALUES ('1051518', 'Verano', '470 ml', 'Limón', 'Botella de Vidrio', 3.3);
INSERT INTO productos (Producto, Nombre, Tamano, Sabor, Envase, PrecioLista) VALUES ('1078680', 'Verano', '470 ml', 'Mango', 'Botella de Vidrio', 5.18);
INSERT INTO productos (Producto, Nombre, Tamano, Sabor, Envase, PrecioLista) VALUES ('1004327', 'Vida del Campo', '1,5 Litros', 'Sandía', 'Botella PET', 19.51);
INSERT INTO productos (Producto, Nombre, Tamano, Sabor, Envase, PrecioLista) VALUES ('1013793', 'Vida del Campo', '2 Litros', 'Cereza/Manzana', 'Botella PET', 24.01);
INSERT INTO productos (Producto, Nombre, Tamano, Sabor, Envase, PrecioLista) VALUES ('290478', 'Vida del Campo', '350 ml', 'Sandía', 'Lata', 4.56);
INSERT INTO productos (Producto, Nombre, Tamano, Sabor, Envase, PrecioLista) VALUES ('1002767', 'Vida del Campo', '700 ml', 'Cereza/Manzana', 'Botella de Vidrio', 8.41);

