package com.alura.gerenciador.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import com.alura.gerenciador.accion.Accion;

//@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet  {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String paramAccion = req.getParameter("accion");
				
		String nombreDeClase = "com.alura.gerenciador.accion."+paramAccion;
		String nombre;
		
		try {
			Class<?> clase = Class.forName(nombreDeClase);
			Accion accion = (Accion)clase.getConstructor().newInstance();
			nombre = accion.ejecutar(req, resp);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | ServletException
				| IOException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
			throw new ServletException(e);
		}
		
		
		String[] tipoYDireccion = nombre.split(":");
		
		if(tipoYDireccion[0].equals("forward")) {
			RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/view/"+tipoYDireccion[1]);
			rd.forward(req, resp);
		}else {
			resp.sendRedirect(tipoYDireccion[1]);
		}
		
		/*
		 * if(paramAccion.equals("LISEMP")) { System.out.println("Listar empresas");
		 * 
		 * ListaEmpresas listaEmpresas = new ListaEmpresas(); nombre =
		 * listaEmpresas.ejecutar(req, resp);
		 * 
		 * }else if(paramAccion.equals("NUEEMP")) { System.out.println("Nueva empresa");
		 * 
		 * NuevaEmpresa nuevaEmpresa = new NuevaEmpresa(); nombre =
		 * nuevaEmpresa.ejecutar(req, resp);
		 * 
		 * }else if(paramAccion.equals("MOSEMP")) {
		 * System.out.println("Mostar empresa");
		 * 
		 * MostrarEmpresa mostrarEmpresa = new MostrarEmpresa(); nombre =
		 * mostrarEmpresa.ejecutar(req, resp);
		 * 
		 * }else if(paramAccion.equals("MODEMP")) {
		 * System.out.println("Modificar empresa");
		 * 
		 * ModificarEmpresa modificarEmpresa = new ModificarEmpresa(); nombre =
		 * modificarEmpresa.ejecutar(req, resp);
		 * 
		 * }else if(paramAccion.equals("ELIEMP")) {
		 * System.out.println("Eliminar empresa");
		 * 
		 * EliminarEmpresa eliminarEmpresa = new EliminarEmpresa(); nombre =
		 * eliminarEmpresa.ejecutar(req, resp);
		 * 
		 * }else if(paramAccion.equals("NUEEMPFOR")) {
		 * System.out.println("Form nueva empresa");
		 * 
		 * NuevaEmpresaForm nuevaEmpresaForm = new NuevaEmpresaForm(); nombre =
		 * nuevaEmpresaForm.ejecutar(req, resp); }
		 */
		
		
		
		
	}

}
