package com.latam.alura.tienda.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.latam.alura.tienda.modelo.Clientes;

public class ClienteDAO {
	
	private EntityManager em;

	public ClienteDAO(EntityManager em) {
		this.em = em;
	}
	
	public void guardar(Clientes cliente) {
		this.em.persist(cliente);
	}
	
	public Clientes consultaPorID (Long id) {
		return em.find(Clientes.class, id);
	}
	
	public List<Clientes> consultarTodos() {
		String jpql = "Select P From Clientes As P";
		return em.createQuery(jpql, Clientes.class).getResultList();
	}
 	
	
	

}
