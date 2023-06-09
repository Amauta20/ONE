package com.alura.gerenciador.db;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.alura.gerenciador.model.Empresas;
import com.alura.gerenciador.model.Usuarios;

public class DB {
	
	private static List<Empresas> listaEmpresas = new ArrayList<>();
	private static List<Usuarios> listaUsuarios = new ArrayList<>();
	private static Integer llaveSecuencial = 1;
	
	static {
		Empresas empresa1 = new Empresas();
		empresa1.setId(DB.llaveSecuencial++);
		empresa1.setNombre("Alura");
		Empresas empresa2 = new Empresas();
		empresa2.setId(DB.llaveSecuencial++);
		empresa2.setNombre("Caelum");
		
		listaEmpresas.add(empresa1);
		listaEmpresas.add(empresa2);
		
		Usuarios usuario1 = new Usuarios();
		usuario1.setLogin("steve");
		usuario1.setContrasena("12345");
		Usuarios usuario2 = new Usuarios();
		usuario2.setLogin("albert");
		usuario2.setContrasena("12345");
		
		listaUsuarios.add(usuario1);
		listaUsuarios.add(usuario2);
		
	}
	
	public void agregarEmpresa(Empresas empresa) {
		empresa.setId(DB.llaveSecuencial++);
		DB.listaEmpresas.add(empresa);
	}
	
	public List<Empresas> getEmpresas() {
		return DB.listaEmpresas;
	}

	public void eliminarEmpresa(Integer id) {
		Iterator<Empresas> it = listaEmpresas.iterator();
		while (it.hasNext()) {
			Empresas empresa = it.next();
			if(empresa.getId() == id) {
				it.remove();
			}
			
		}
		
	}

	public Empresas buscarEmpresaPorId(Integer id) {	
		for (Empresas empresa : listaEmpresas) {
			if(empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}

	public Usuarios existeUsuario(String paramLogin, String paramContrasena) {
		for (Usuarios usuario : listaUsuarios) {
			if(usuario.esIgual(paramLogin, paramContrasena)) {
				return usuario;
			}
		}
		return null;
	}
	
}
