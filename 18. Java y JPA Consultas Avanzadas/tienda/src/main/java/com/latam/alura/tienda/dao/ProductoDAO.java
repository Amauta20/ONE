package com.latam.alura.tienda.dao;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.latam.alura.tienda.modelo.Productos;

public class ProductoDAO {
	
	private EntityManager em;

	public ProductoDAO(EntityManager em) {
		this.em = em;
	}
	
	public void guardar(Productos productos) {
		this.em.persist(productos);
	}
	
	public Productos consultaPorID (Long id) {
		return em.find(Productos.class, id);
	}
	
	public List<Productos> consultarTodos() {
		String jpql = "Select P From Productos As P";
		return em.createQuery(jpql, Productos.class).getResultList();
	}
 	
	public List<Productos> consultarPorNombre(String nombre) {
		String jpql = "Select P From Productos As P Where P.nombre=:nombre";
		return em.createQuery(jpql, Productos.class).setParameter("nombre", nombre).getResultList();
	}
	
	public List<Productos> consultarPorNombreDeCategoria(String nombre) {
		String jpql = "Select P From Productos As P Where P.categoria.nombre=:nombre";
		return em.createQuery(jpql, Productos.class).setParameter("nombre", nombre).getResultList();
	}
	
	public BigDecimal consultaPrecioPorNombreDeProducto(String nombre) {
		String jpql = "Select P.precio From Productos As P Where P.nombre=:nombre";
		return em.createQuery(jpql, BigDecimal.class).setParameter("nombre", nombre).getSingleResult();
	}
	
	public BigDecimal consultaPrecioNombre(String nombre) {
		return em.createNamedQuery("Productos.ConsultarPrecio", BigDecimal.class).setParameter("nombre", nombre).getSingleResult();
	}
	
	public List<Productos> consultarPorParametros(String nombre, BigDecimal precio,LocalDate fecha){
		StringBuilder jpql=new StringBuilder("SELECT p FROM Producto p WHERE 1=1 ");
		
		if(nombre!=null && !nombre.trim().isEmpty()) {
			jpql.append("AND p.nombre=:nombre ");
		}
		if(precio!=null && !precio.equals(new BigDecimal(0))) {
			jpql.append("AND p.precio=:precio ");
		}
		if(fecha!=null) {
			jpql.append("AND p.fechaDeRegistro=:fecha");
		}
		TypedQuery<Productos> query = em.createQuery(jpql.toString(),Productos.class);
		if(nombre!=null && !nombre.trim().isEmpty()) {
			query.setParameter("nombre", nombre);
		}
		if(precio!=null && !precio.equals(new BigDecimal(0))) {
			query.setParameter("precio", precio);
		}
		if(fecha!=null) {
			query.setParameter("fechaDeRegistro", fecha);
		}

		return query.getResultList();		
	}
	

	public List<Productos> consultarPorParametrosConAPICriteria(String nombre, BigDecimal precio,LocalDate fecha){
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Productos> query = builder.createQuery(Productos.class);
		Root<Productos> from = query.from(Productos.class);
		
		
		Predicate filtro = builder.and();
		if(nombre!=null && !nombre.trim().isEmpty()) {
			filtro=builder.and(filtro,builder.equal(from.get("nombre"), nombre));
		}
		if(precio!=null && !precio.equals(new BigDecimal(0))) {
			filtro=builder.and(filtro,builder.equal(from.get("precio"), precio));
		}
		if(fecha!=null) {
			filtro=builder.and(filtro,builder.equal(from.get("fechaDeRegistro"), fecha));
		}
		
		query=query.where(filtro);
		return em.createQuery(query).getResultList();

	
	}
	
}
