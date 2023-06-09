package com.alura.gerenciador.accion;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface Accion {
	String ejecutar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException;
}
