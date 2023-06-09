package com.alura.gerenciador.accion;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.alura.gerenciador.db.DB;
import com.alura.gerenciador.model.Empresas;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ModificarEmpresa implements Accion {
	
	public String ejecutar(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
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
		
		return "redirect:entrada?accion=ListaEmpresas";
		
	}
}
