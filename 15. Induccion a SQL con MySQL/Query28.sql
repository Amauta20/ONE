Use jugos;

SELECT * FROM productos 
WHERE PrecioLista BETWEEN 28.50 AND 28.52;

SELECT * FROM productos 
WHERE PrecioLista > 28.50 AND PrecioLista <= 28.52;

SELECT * FROM productos 
WHERE Envase = 'Lata' OR Envase = 'Botella PET';

SELECT * FROM productos 
WHERE PrecioLista >= 15 AND PrecioLista <= 25;

SELECT * FROM productos 
WHERE (PrecioLista >= 15 AND PrecioLista <= 25) OR (Envase = 'Lata' OR Envase = 'Botella PET');

SELECT * FROM productos 
WHERE (PrecioLista >= 15 AND Tamano = '1 Litro') OR (Envase = 'Lata' OR Envase = 'Botella PET');

SELECT * FROM productos 
WHERE (PrecioLista >= 15 AND PrecioLista <= 25) AND (Envase = 'Lata' OR Envase = 'Botella PET');