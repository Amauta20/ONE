package com.alura.jdbc.pruebas;

import java.sql.Connection;
import java.sql.SQLException;

import com.alura.jdbc.factory.ConnectionFactory;

public class PruebaPoolDeConexiones {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory conectionfactory = new ConnectionFactory();
		
		for(int i = 0; i < 20; i++) {
			//Connection conect = conectionfactory.recuperaConexion();	
		
			System.out.println("Se abre la conexion numero " + (i+1));
		}
		
		

	}

}
