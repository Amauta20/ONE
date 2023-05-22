package com.latam.alura.tienda.prueba;

import java.io.FileNotFoundException;
import java.math.BigDecimal;

import javax.persistence.EntityManager;

import com.latam.alura.tienda.dao.CategoriaDAO;
import com.latam.alura.tienda.dao.ClienteDAO;
import com.latam.alura.tienda.dao.PedidoDAO;
import com.latam.alura.tienda.dao.ProductoDAO;
import com.latam.alura.tienda.modelo.Categoria;
import com.latam.alura.tienda.modelo.Clientes;
import com.latam.alura.tienda.modelo.ItemsPedido;
import com.latam.alura.tienda.modelo.Pedidos;
import com.latam.alura.tienda.modelo.Productos;
import com.latam.alura.tienda.utils.JPAUtils;

public class RegistroDePedido {

	public static void main(String[] args) throws FileNotFoundException {
		
		EntityManager em = JPAUtils.getEntityManager();
		
		ProductoDAO productoDAO = new ProductoDAO(em);
		Productos producto1 = productoDAO.consultaPorID(1l);
		Productos producto2 = productoDAO.consultaPorID(2l);
		
		ClienteDAO clienteDAO = new ClienteDAO(em);
		PedidoDAO pedidoDAO = new PedidoDAO(em);
		
		Clientes cliente1 = new Clientes("Juan Zegarra", "40150746");
		Clientes cliente2 = new Clientes("Jose Guerra", "40201920");
		Pedidos pedido1 = new Pedidos(cliente1);
		Pedidos pedido2 = new Pedidos(cliente2);
		pedido1.agregarItems(new ItemsPedido(5, producto1, pedido1));
		pedido1.agregarItems(new ItemsPedido(2, producto2, pedido1));
		pedido2.agregarItems(new ItemsPedido(3, producto2, pedido2));
			
		em.getTransaction().begin();
			
		clienteDAO.guardar(cliente1);
		clienteDAO.guardar(cliente2);
		pedidoDAO.guardar(pedido1);
		pedidoDAO.guardar(pedido2);
		
		em.getTransaction().commit();
	    
		
	    
	    
	    
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