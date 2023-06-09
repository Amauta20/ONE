package com.alura.gerenciador.accion;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import com.alura.gerenciador.db.DB;
import com.alura.gerenciador.model.Usuarios;

public class Login implements Accion {

	@Override
	public String ejecutar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String paramLogin = req.getParameter("login");
		String paramContrasena = req.getParameter("contrasena");
		
		System.out.println("Login: " + paramLogin);
		
		DB db = new DB();
		Usuarios usuario = db.existeUsuario(paramLogin, paramContrasena); 
		
		if(usuario != null) {
			System.out.println("Usuario existe");
			HttpSession sesion = req.getSession();
			sesion.setAttribute("loginUsuario", usuario);
			return "redirect:entrada?accion=ListaEmpresas";
		}else {
			return "redirect:entrada?accion=FormLogin";
		}

	}

}
