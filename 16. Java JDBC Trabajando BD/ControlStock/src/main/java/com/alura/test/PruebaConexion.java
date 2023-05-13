package com.alura.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PruebaConexion {
	
	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost/ControlStock?userTimeZone=true&serverTimeZone=UTC",
				"root",
				"Amauta20|962209");
		
		System.out.println("Estamos cerrando la conexión");
		
		con.close();
		
	}
	
}
