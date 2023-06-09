package com.alura.gerenciador.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;
import com.alura.gerenciador.accion.ListaEmpresas;
import com.alura.gerenciador.db.DB;
import com.alura.gerenciador.model.Empresas;


@WebServlet("/empresas")
public class EmpressServices extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		List<Empresas> empresas = new DB().getEmpresas();
		
		String valor = req.getHeader("Accept");
		
		if (valor.contains("xml")) {
			XStream xstream = new XStream();
			xstream.alias("empresas", Empresas.class);
			String xml = xstream.toXML(empresas);
		
			resp.setContentType("Aplication/xml");
			resp.getWriter().print(xml);
		}else if (valor.contains("json")) {
			 Gson gson = new Gson(); 
			 String json = gson.toJson(empresas);
		  
			 resp.setContentType("Aplication/json"); 
			 resp.getWriter().print(json);
		}else {
			resp.setContentType("Aplication/json"); 
			resp.getWriter().print("{message: 'no content' }");
		}
		
		
		
		
		 
		 
		
	}

}
