package com.latam.alura.tienda.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import com.latam.alura.tienda.modelo.Producto;

public class ProductoDAO {
	
	private EntityManager em;

	public ProductoDAO(EntityManager em) {
		this.em = em;
	}
	
	public void guardar(Producto producto) {
		this.em.persist(producto);
	}
	
	public Producto consultaPorID (Long id) {
		return em.find(Producto.class, id);
	}
	
	public List<Producto> consultarTodos() {
		String jpql = "Select P From Producto As P";
		return em.createQuery(jpql, Producto.class).getResultList();
	}
 	
	public List<Producto> consultarPorNombre(String nombre) {
		String jpql = "Select P From Producto As P Where P.nombre=:nombre";
		return em.createQuery(jpql, Producto.class).setParameter("nombre", nombre).getResultList();
	}
	
	public List<Producto> consultarPorNombreDeCategoria(String nombre) {
		String jpql = "Select P From Producto As P Where P.categoria.nombre=:nombre";
		return em.createQuery(jpql, Producto.class).setParameter("nombre", nombre).getResultList();
	}
	
	public BigDecimal consultaPrecioPorNombreDeProducto(String nombre) {
		String jpql = "Select P.precio From Producto As P Where P.nombre=:nombre";
		return em.createQuery(jpql, BigDecimal.class).setParameter("nombre", nombre).getSingleResult();
	}
}
