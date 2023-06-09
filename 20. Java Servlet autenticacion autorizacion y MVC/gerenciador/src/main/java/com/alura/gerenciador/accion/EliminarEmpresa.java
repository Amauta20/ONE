package com.alura.gerenciador.accion;

import java.io.IOException;

import com.alura.gerenciador.db.DB;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EliminarEmpresa implements Accion{
	
	public String ejecutar(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		String paramId = req.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		System.out.println("Eliminar empresa " + id);
		
		DB db = new DB();
		db.eliminarEmpresa(id);
		
		return "redirect:entrada?accion=ListaEmpresas";
		
	}
	
}
