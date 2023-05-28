package com.alura.gerenciador.servlet;

//import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.alura.gerenciador.model.Empresas;
import com.alura.gerenciador.db.DB;


public class NuevaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
		System.out.println("Se registro una nueva empresa");
		
		String nombreEmpresa = req.getParameter("nombre");
		String fechaEmpresa = req.getParameter("fecha");
		
		Date fechaAbertura = null;
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			fechaAbertura = sdf.parse(fechaEmpresa);
		} catch (ParseException e) {
			throw new ServletException(e);
		} 
		
		Empresas empresa = new Empresas();
		empresa.setNombre(nombreEmpresa);
		empresa.setFechaAbertura(fechaAbertura);
		
		DB baseDatos = new DB();
		baseDatos.agregarEmpresa(empresa);	
		
		resp.sendRedirect("listaEmpresas");
		
		/*
		 * RequestDispatcher rd = req.getRequestDispatcher("/listaEmpresas");
		 * req.setAttribute("empresa", empresa.getNombre()); rd.forward(req, resp);
		 */
		
		
	}

}
