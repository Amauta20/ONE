INSERT INTO categorias (nombrecategorias) VALUES ('Muebles'), ('Cocina'), ('Tecnologia');

SELECT * FROM categorias

productosALTER TABLE productos ADD COLUMN categoriaID INT;

SELECT * FROM productos;

ALTER TABLE productos ADD FOREIGN KEY (categoriaID) REFERENCES categorias(id);
 