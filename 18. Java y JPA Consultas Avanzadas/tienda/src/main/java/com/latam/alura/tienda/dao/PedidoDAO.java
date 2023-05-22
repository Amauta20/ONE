package com.latam.alura.tienda.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import com.latam.alura.tienda.modelo.Pedidos;
import com.latam.alura.tienda.vo.relatorioDeVentas;

public class PedidoDAO {
	
	private EntityManager em;

	public PedidoDAO(EntityManager em) {
		this.em = em;
	}
	
	public void guardar(Pedidos pedido) {
		this.em.persist(pedido);
	}
	
	public Pedidos consultaPorID (Long id) {
		return em.find(Pedidos.class, id);
	}
	
	public List<Pedidos> consultarTodos() {
		String jpql = "Select P From Pedidos As P";
		return em.createQuery(jpql, Pedidos.class).getResultList();
	}
 	
	public BigDecimal valorTotalVendido() {
		String jpql = "Select SUM(p.valorTotal) From Pedidos as p";
		return em.createQuery(jpql, BigDecimal.class).getSingleResult();
	}
	
	public BigDecimal valorMaximoVendido() {
		String jpql = "Select MAX(p.valorTotal) From Pedidos as p";
		return em.createQuery(jpql, BigDecimal.class).getSingleResult();
	}
	
	public Double valorPromedioVendido() {
		String jpql = "Select AVG(p.valorTotal) From Pedidos as p";
		return em.createQuery(jpql, Double.class).getSingleResult();
	}
	
	public List<Object[]> relatorioDeVentas(){
		String jpql="SELECT pr.nombre, "
				+ "SUM(it.cantidad), "
				+ "MAX(pe.fecha) "
				+ "FROM Pedidos pe "
				+ "JOIN pe.items it "
				+ "JOIN it.producto pr "
				+ "GROUP BY pr.nombre ";
		return em.createQuery(jpql,Object[].class).getResultList();
	}
	
	public List<relatorioDeVentas> relatorioDeVentasVO(){
		String jpql="SELECT new com.latam.alura.tienda.vo.relatorioDeVentas (pr.nombre, "
				+ "SUM(it.cantidad), "
				+ "MAX(pe.fecha)) "
				+ "FROM Pedidos pe "
				+ "JOIN pe.items it "
				+ "JOIN it.producto pr "
				+ "GROUP BY pr.nombre ";
		return em.createQuery(jpql,relatorioDeVentas.class).getResultList();
	}
	
	public Pedidos consultarPedidoConCliente(Long id) {
		String jpql="SELECT p FROM Pedido p JOIN FETCH p.cliente WHERE p.id=:id";
		return em.createQuery(jpql,Pedidos.class).setParameter("id", id).getSingleResult();
	}
	
}
