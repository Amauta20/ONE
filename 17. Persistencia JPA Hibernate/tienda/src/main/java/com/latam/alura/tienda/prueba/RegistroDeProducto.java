package com.latam.alura.tienda.prueba;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import com.latam.alura.tienda.dao.ProductoDAO;
import com.latam.alura.tienda.dao.CategoriaDAO;
import com.latam.alura.tienda.modelo.Categoria;
import com.latam.alura.tienda.modelo.Producto;
import com.latam.alura.tienda.utils.JPAUtils;

public class RegistroDeProducto {

	public static void main(String[] args) {
		
		RegistrarProducto();
		EntityManager em = JPAUtils.getEntityManager();
	    ProductoDAO productoDAO = new ProductoDAO(em);
	    
	    Producto producto = productoDAO.consultaPorID(3l);
	    System.out.println(producto.getNombre());
	    
	    List<Producto> productos01 = productoDAO.consultarTodos();
	    productos01.forEach(prod -> System.out.println(prod.getDescripcion()));
	    
	    List<Producto> productos02 = productoDAO.consultarPorNombreDeCategoria("MUEBLES");
	    productos02.forEach(prod -> System.out.println(prod.getNombre()));
	    
	    BigDecimal precio = productoDAO.consultaPrecioPorNombreDeProducto("Xiaomi 12 Ultra");
	    System.out.println(precio);
	}

	public static void RegistrarProducto() {
		Categoria celulares = new Categoria("CELULARES");
		Categoria muebles = new Categoria("MUEBLES");
				
		Producto celular01 = new Producto("Samsung S20", "Telefono celular", new BigDecimal("1000"), celulares);
		Producto celular02 = new Producto("Samsung S21", "Telefono usado", new BigDecimal("1200"), celulares);
		Producto celular03 = new Producto("Xiaomi 12 Ultra", "Telefono nuevo", new BigDecimal("1500"), celulares);
		Producto mueble01 = new Producto("Cama Paraiso", "Cama de 2 plazas", new BigDecimal("1500"), muebles);

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