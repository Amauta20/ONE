package com.alura.gerenciador.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.alura.gerenciador.db.DB;
import com.alura.gerenciador.model.Empresas;

public class ListaEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		DB baseDatos = new DB();
		List<Empresas> listaEmpresas = baseDatos.getEmpresas();
		
		req.setAttribute("empresas", listaEmpresas);
		
		RequestDispatcher rd = req.getRequestDispatcher("/listaEmpresas.jsp");
		rd.forward(req, resp);
		
	}

}
