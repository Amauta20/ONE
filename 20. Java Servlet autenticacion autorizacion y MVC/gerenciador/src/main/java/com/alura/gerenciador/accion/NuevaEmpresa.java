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

public class NuevaEmpresa implements Accion {
	
	public String ejecutar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				
		System.out.println("Nueva empresa");
		
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
		
		return "redirect:entrada?accion=ListaEmpresas";
		
	}
	
}
