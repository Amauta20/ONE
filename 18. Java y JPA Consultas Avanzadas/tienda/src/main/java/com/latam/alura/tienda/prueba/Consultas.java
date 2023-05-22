package com.latam.alura.tienda.prueba;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import com.latam.alura.tienda.dao.PedidoDAO;
import com.latam.alura.tienda.dao.ProductoDAO;
import com.latam.alura.tienda.modelo.Productos;
import com.latam.alura.tienda.utils.JPAUtils;
import com.latam.alura.tienda.vo.relatorioDeVentas;

public class Consultas {
	
	public static void main(String[] args) {
		
		EntityManager em = JPAUtils.getEntityManager();
		
	    ProductoDAO productoDAO = new ProductoDAO(em);
	    
	    System.out.println("Consulta por ID");
	    Productos productos = productoDAO.consultaPorID(3l);
	    System.out.println(productos.getNombre());
	    System.out.println("");
	    
	    System.out.println("Consulta de todos los productos");
	    List<Productos> productos01 = productoDAO.consultarTodos();
	    productos01.forEach(prod -> System.out.println(prod.getDescripcion()));
	    System.out.println("");
	    
	    System.out.println("Consulta por categoria");
	    List<Productos> productos02 = productoDAO.consultarPorNombreDeCategoria("MUEBLES");
	    productos02.forEach(prod -> System.out.println(prod.getNombre()));
	    System.out.println("");
	    
	    System.out.println("Consulta precio por nombre");
	    BigDecimal precio = productoDAO.consultaPrecioPorNombreDeProducto("Xiaomi 12 Ultra");
	    System.out.println(precio);
	    System.out.println("");
		
		
	    PedidoDAO pedidoDAO = new PedidoDAO(em);
		
	    System.out.println("Consulta total de pedido");
		BigDecimal valorTotal = pedidoDAO.valorTotalVendido();
		System.out.println(valorTotal);
		System.out.println("");
		
		System.out.println("Consulta valor maximo de pedido");
		BigDecimal valorMaximo = pedidoDAO.valorMaximoVendido();
		System.out.println(valorMaximo);
		System.out.println("");
		
		System.out.println("Consulta valor promedio de pedido");
		Double valorPromedio = pedidoDAO.valorPromedioVendido();
		System.out.println(valorPromedio);
		System.out.println("");
		
		System.out.println("Relatorio de Ventas");
		List<Object[]> relatorio = pedidoDAO.relatorioDeVentas();
		  for(Object[] obj:relatorio) { 
			  System.out.println(obj[0]);
			  System.out.println(obj[1]); 
			  System.out.println(obj[2]); 
		  }
		System.out.println("");
		
		System.out.println("Relatorio de Ventas VO");
		List<relatorioDeVentas> relatoriox = pedidoDAO.relatorioDeVentasVO();
		relatoriox.forEach(System.out::println);
		System.out.println("");
		
	}
	
}
