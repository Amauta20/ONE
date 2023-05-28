package com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/hello")
public class HolaMundoServlet extends HttpServlet{
	
	
	
	public HolaMundoServlet() {
		System.out.println("Creando Hola Mundo Servlet");
	}

	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Hola Mundo, Felicitaciones");
		out.println("</body>");
		out.println("</html>");
	
		System.out.println("Se ejecuto todo correctamente");
	}
	
}
