package com.alura.gerenciador.accion;

import java.io.IOException;

import com.alura.gerenciador.db.DB;
import com.alura.gerenciador.model.Empresas;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MostrarEmpresa implements Accion {
	
	public String ejecutar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String paramId = req.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		System.out.println("Mostrar empresa " + id);
		
		DB db = new DB();
		Empresas empresa = db.buscarEmpresaPorId(id);
		
		System.out.println(empresa.getNombre());
		
		req.setAttribute("empresa", empresa);
		
		return "forward:formModificarEmpresa.jsp";
		
	}
	
}
