package com.latam.alura.tienda.prueba;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import com.latam.alura.tienda.dao.ProductoDAO;
import com.latam.alura.tienda.dao.CategoriaDAO;
import com.latam.alura.tienda.modelo.Categoria;
import com.latam.alura.tienda.modelo.Productos;
import com.latam.alura.tienda.utils.JPAUtils;

public class RegistroDeProducto {

	public static void main(String[] args) {
		
		RegistrarProducto();
	}

	public static void RegistrarProducto() {
		Categoria celulares = new Categoria("CELULARES");
		Categoria muebles = new Categoria("MUEBLES");
				
		Productos celular01 = new Productos("Samsung S20", "Telefono celular", new BigDecimal("1000"), celulares);
		Productos celular02 = new Productos("Samsung S21", "Telefono usado", new BigDecimal("1200"), celulares);
		Productos celular03 = new Productos("Xiaomi 12 Ultra", "Telefono nuevo", new BigDecimal("1500"), celulares);
		Productos mueble01 = new Productos("Cama Paraiso", "Cama de 2 plazas", new BigDecimal("1500"), muebles);

	    EntityManager em = JPAUtils.getEntityManager();
	    ProductoDAO productoDAO = new ProductoDAO(em);
	    CategoriaDAO categoriaDAO = new CategoriaDAO(em);
	    
	    em.getTransaction().begin();
	    
	    categoriaDAO.guardar(celulares);
	    categoriaDAO.guardar(muebles);
	    productoDAO.guardar(celular01);
	    productoDAO.guardar(celular02);
	    productoDAO.guardar(celular03);
	    productoDAO.guardar(mueble01);
	    
	    em.getTransaction().commit();
	    em.close();
	}

}