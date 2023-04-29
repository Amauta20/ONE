package Colegio;

import java.util.HashSet;
import java.util.Set;

public class Clase11 {
	
	//https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html
	//https://docs.oracle.com/javase/8/docs/api/
	
	public static void main(String[] args) {
		
		String alumno1 = "Luis Miguel";
		String alumno2 = "Juana Ana";
		String alumno3 = "Juan Carlos";
		String alumno4 = "Luisa Maria";
		String alumno5 = "Ana Luisa";
		String alumno6 = "Ana Maria";
		String alumno7 = "Steve Albert";
		String alumno8 = "Heinz Dougherty";
		String alumno9 = "Heinz Dougherty";
		
		Set<String> listaAlumnos = new HashSet<>();
		
		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno3);
		listaAlumnos.add(alumno4);
		listaAlumnos.add(alumno5);
		listaAlumnos.add(alumno6);
		listaAlumnos.add(alumno7);
		listaAlumnos.add(alumno8);
		listaAlumnos.add(alumno9);
		
		System.out.println("Array de Alumnos");
		System.out.println(listaAlumnos);
		System.out.println();
		
		System.out.println("Lista de Alumnos");
		for(String alumnos : listaAlumnos) {
			System.out.println("+ " + alumnos);
		}
		System.out.println();
		
		System.out.println("Lista de Alumnos ForEach");
		listaAlumnos.forEach(alumnos -> {
			System.out.println("+ " + alumnos);
		});
		System.out.println();
	}
	
}
