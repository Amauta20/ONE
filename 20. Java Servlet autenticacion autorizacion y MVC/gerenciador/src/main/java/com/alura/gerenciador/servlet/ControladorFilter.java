package com.alura.gerenciador.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import com.alura.gerenciador.accion.Accion;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebFilter(urlPatterns = "/entrada")
public class ControladorFilter implements Filter {

	@SuppressWarnings("deprecation")
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) 
			throws IOException, ServletException {
		
		System.out.println("ControladorFilter");
		
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		String paramAccion = request.getParameter("accion");
		
		String nombreDeClase = "com.alura.gerenciador.accion."+paramAccion;
		String nombre;
		try {
			Class<?> clase = Class.forName(nombreDeClase);
			Accion accion = (Accion)clase.getConstructor().newInstance();
			nombre = accion.ejecutar(request, response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | ServletException
				| IOException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
			throw new ServletException(e);
		}
		
		String[] tipoYDireccion = nombre.split(":");
		
		if(tipoYDireccion[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/"+tipoYDireccion[1]);
			rd.forward(request, response);
		}else {
			response.sendRedirect(tipoYDireccion[1]);
		}
	}
}
