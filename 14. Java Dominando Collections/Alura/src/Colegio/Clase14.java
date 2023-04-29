package Colegio;

import java.util.Collection;
import java.util.HashSet;

import Model.Alumno;

public class Clase14 {	
	
	public static void main(String[] args) {
		
		Alumno alumno1 = new Alumno("Luis Miguel", "001");
		Alumno alumno2 = new Alumno("Juana Ana", "002");
		Alumno alumno3 = new Alumno("Juan Carlos", "003");
		Alumno alumno4 = new Alumno("Luisa Maria", "004");
		Alumno alumno5 = new Alumno("Ana Luisa", "005");
		Alumno alumno6 = new Alumno("Ana Maria", "006");
		Alumno alumno7 = new Alumno("Steve Albert", "007");
		Alumno alumno8 = new Alumno("Heinz Dougherty", "008");
		Alumno alumno9 = new Alumno("Heinz Dougherty", "009");
		
		Collection<Alumno> listaAlumnos = new HashSet<>();
		
		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno3);
		listaAlumnos.add(alumno4);
		listaAlumnos.add(alumno5);
		listaAlumnos.add(alumno6);
		listaAlumnos.add(alumno7);
		listaAlumnos.add(alumno8);
		listaAlumnos.add(alumno9);
		
		Alumno alumnoNuevo = new Alumno("Luis Miguel", "001");
		
		System.out.println(alumno1.equals(alumnoNuevo));
		System.out.println(listaAlumnos.contains(alumnoNuevo));
		
		
	}

}
