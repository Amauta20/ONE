package Colegio;

import java.util.Optional;

import Model.Alumno;
import Model.Curso;

public class Clase18 {	
	
	public static void main(String[] args) {
		
		Curso curso1 = new Curso("Java", 200);
		
		Alumno alumno1 = new Alumno("Luis Miguel", "001");
		Alumno alumno2 = new Alumno("Juana Ana", "002");
		Alumno alumno3 = new Alumno("Juan Carlos", "003");
		Alumno alumno4 = new Alumno("Luisa Maria", "004");
		Alumno alumno5 = new Alumno("Ana Luisa", "005");
		Alumno alumno6 = new Alumno("Ana Maria", "006");
		Alumno alumno7 = new Alumno("Steve Albert", "007");
		Alumno alumno8 = new Alumno("Heinz Dougherty", "008");
		Alumno alumno9 = new Alumno("Heinz Dougherty", "009");
		
		curso1.addAlumno(alumno1);
		curso1.addAlumno(alumno2);
		curso1.addAlumno(alumno3);
		curso1.addAlumno(alumno4);
		curso1.addAlumno(alumno5);
		curso1.addAlumno(alumno6);
		curso1.addAlumno(alumno7);
		curso1.addAlumno(alumno8);
		curso1.addAlumno(alumno9);
		
		System.out.println("Lista de Alumnos");
		curso1.getAlumnos().forEach(alumno -> System.out.println("+ " + alumno));
		System.out.println();
		
		System.out.println("Lista de Alumnos Stream Filter");
		Optional<Alumno> alumno = curso1.getAlumnos().stream().filter(a -> "003".equalsIgnoreCase(a.getCodigo())).findFirst();
		if(alumno.isPresent()) {
			System.out.println(alumno.get());
		}
		System.out.println();
		
		System.out.println("Lista de Alumnos Map");
		Alumno alumnoMap = curso1.getAlumnoMap().get("003");
		System.out.println(alumnoMap);
		
		
		
	}

}
