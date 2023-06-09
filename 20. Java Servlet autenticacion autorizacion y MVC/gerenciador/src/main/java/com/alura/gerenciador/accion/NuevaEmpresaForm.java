package com.alura.gerenciador.accion;

import java.io.IOException;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NuevaEmpresaForm implements Accion {

public String ejecutar(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
	return "forward:formNuevaEmpresa.jsp";
		
	}	
	
}
