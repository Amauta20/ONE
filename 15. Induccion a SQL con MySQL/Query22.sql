SELECT * FROM productos;

SELECT * FROM productos WHERE Sabor = 'Maracuyá';

SELECT * FROM productos WHERE Tamano = 'Botella de Vidrio'; 

SET SQL_SAFE_UPDATES = 0;

UPDATE productos SET Sabor = 'Cítrico' WHERE Sabor = 'Limón';

SELECT * FROM productos WHERE Sabor = 'Cítrico';