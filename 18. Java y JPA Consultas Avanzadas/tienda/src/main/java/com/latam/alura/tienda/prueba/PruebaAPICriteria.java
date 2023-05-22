package com.latam.alura.tienda.prueba;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import com.latam.alura.tienda.dao.CategoriaDAO;
import com.latam.alura.tienda.dao.ProductoDAO;
import com.latam.alura.tienda.modelo.Categoria;
import com.latam.alura.tienda.modelo.Productos;
import com.latam.alura.tienda.utils.JPAUtils;

public class PruebaAPICriteria {
	public static void main(String[] args) {
		cargarBancoDeDatos();
		
		
		EntityManager em = JPAUtils.getEntityManager();
		ProductoDAO ProductoDAO =new ProductoDAO(em);
		
		List<Productos> resultado = ProductoDAO.consultarPorParametrosConAPICriteria("X", null, null);
		
		System.out.println(resultado.get(0).getDescripcion());
	}
	private static void cargarBancoDeDatos() {
		Categoria celulares = new Categoria("CELULARES");
		Categoria videoJuegos = new Categoria("VIDEO_JUEGOS");
		Categoria electronicos = new Categoria("ELECTRONICOS");
		
		Productos celular = new Productos("X","Productos nuevo",new BigDecimal(10000),celulares);
		Productos videoJuego = new Productos("FIFA","2000",new BigDecimal(10000),videoJuegos);
		Productos memoria = new Productos("memoria ram","30 GB",new BigDecimal(10000),electronicos);
		
		EntityManager em = JPAUtils.getEntityManager();
		ProductoDAO ProductoDAO = new ProductoDAO(em);
		CategoriaDAO categoriaDao = new CategoriaDAO(em);
		
		em.getTransaction().begin();
		
		categoriaDao.guardar(celulares);
		categoriaDao.guardar(videoJuegos);
		categoriaDao.guardar(electronicos);
		
		ProductoDAO.guardar(celular);
		ProductoDAO.guardar(videoJuego);
		ProductoDAO.guardar(memoria);
		
		em.getTransaction().commit();
		em.close();
	}
}
