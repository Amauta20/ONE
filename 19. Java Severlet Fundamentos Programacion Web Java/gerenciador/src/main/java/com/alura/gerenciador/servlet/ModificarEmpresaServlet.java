package com.alura.gerenciador.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.alura.gerenciador.db.DB;
import com.alura.gerenciador.model.Empresas;


public class ModificarEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("Empresa modificada");
		
		String nombreEmpresa = req.getParameter("nombre");
		String fechaEmpresa = req.getParameter("fecha");
		String idEmpresa = req.getParameter("id");
		
		Integer id = Integer.valueOf(idEmpresa);
		System.out.println(id);
		
		Date fechaAbertura = null;
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			fechaAbertura = sdf.parse(fechaEmpresa);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		DB db = new DB();
		Empresas empresa = db.buscarEmpresaPorId(id);
		empresa.setNombre(nombreEmpresa);
		empresa.setFechaAbertura(fechaAbertura);
		
		resp.sendRedirect("listaEmpresas");
		
		
	}

}
