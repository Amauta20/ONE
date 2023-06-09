package com.alura.gerenciador.accion;

import java.io.IOException;
import java.util.List;

import com.alura.gerenciador.db.DB;
import com.alura.gerenciador.model.Empresas;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class ListaEmpresas implements Accion {
	
	public String  ejecutar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Listar empresas");
		
		DB baseDatos = new DB();
		List<Empresas> listaEmpresas = baseDatos.getEmpresas();
		
		req.setAttribute("empresas", listaEmpresas);
		
		return "forward:listaEmpresas.jsp";
		
	}
	
}
