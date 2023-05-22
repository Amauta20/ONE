package com.latam.alura.tienda.prueba;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import com.latam.alura.tienda.dao.ProductoDAO;
import com.latam.alura.tienda.utils.JPAUtils;

public class NuevasConsultas {

	public static void main(String[] args) {
		
		EntityManager em = JPAUtils.getEntityManager();
		
	    ProductoDAO productoDAO = new ProductoDAO(em);
		
		System.out.println("Consulta precio por nombre");
	    BigDecimal precio = productoDAO.consultaPrecioNombre("Xiaomi 12 Ultra");
	    System.out.println(precio);
	    System.out.println("");

	}

}
