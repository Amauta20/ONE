package com.latam.alura.tienda.prueba;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
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


public class LoadRecords {
	public static void cargarRegistros() throws FileNotFoundException {
		EntityManager em = JPAUtils.getEntityManager();
		CategoriaDAO categoriaDAO = new CategoriaDAO(em);
		ProductoDAO productoDAO = new ProductoDAO(em);
		ClienteDAO clienteDAO = new ClienteDAO(em);
		PedidoDAO pedidoDAO = new PedidoDAO(em);
		em.getTransaction().begin();
		
		loadCategoria("categoria",categoriaDAO,em);
		
		loadProducto("producto",productoDAO,categoriaDAO,em);
		
		loadCliente("cliente",clienteDAO,em);
		
		List<Clientes> clientesList = clienteDAO.consultarTodos();
		List<Pedidos> pedidoList= new ArrayList<>();
		
		for(Clientes cl:clientesList) {
			pedidoList.add(new Pedidos(cl));
		}
		
		for(int i=0;i<pedidoList.size();i++) {
			pedidoList.get(i).agregarItems(new ItemsPedido(i+1,productoDAO.consultaPorID((long) (i+1)),pedidoList.get(i)));
			pedidoDAO.guardar(pedidoList.get(i));
		}
		
		em.getTransaction().commit();
		em.close();
		
	}
	
	private static void loadProducto(String type, ProductoDAO productoDAO,CategoriaDAO categoriaDAO, EntityManager em) throws FileNotFoundException {
		List<String> productosTxt =readFile(type);
		for(int i=0;i<productosTxt.size();i++) {
			String[] line = productosTxt.get(i).split(";");
			if(line.length>1) {
				Categoria categoria=categoriaDAO.consultaPorNombre(line[3]);
				Productos producto = new Productos(line[4],line[0],new BigDecimal(line[1]),categoria);
				productoDAO.guardar(producto);
				em.flush();
			}
		}
	}

	private static void loadCategoria(String type, CategoriaDAO categoriaDAO,EntityManager em) throws FileNotFoundException {
		List<String> categoriasTxt =readFile(type);		
		for(int i=0;i<categoriasTxt.size();i++) {
			String[] line = categoriasTxt.get(i).split(";");
			if(line.length==1) {
				Categoria categoria = new Categoria(categoriasTxt.get(i));
				categoriaDAO.guardar(categoria);
				em.flush();	
			}
		}
	}

	private static void loadCliente(String type, ClienteDAO clienteDAO,EntityManager em) throws FileNotFoundException {
		List<String> clientesTxt =readFile(type);		
		for(int i=0;i<clientesTxt.size();i++) {
			String[] line = clientesTxt.get(i).split("~");
			System.out.println(line[0]+line[1]);
			if(line.length>1) {
				Clientes cliente= new Clientes(line[0],line[1]);
				clienteDAO.guardar(cliente);
				em.flush();	
			}
		}
	}
	
	private static List<String> readFile(String type) throws FileNotFoundException {
		File file = new File("C:\\Users\\Public\\Alura\\jpa\\"+type+".txt");
		Scanner scan = new Scanner(file);
		List<String> pedido= new ArrayList<>();
		while(scan.hasNextLine()){
			pedido.add(scan.nextLine());
		}
		scan.close();
		return pedido;
	}

	
}
