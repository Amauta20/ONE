package Colegio;


import Model.Alumno;
import Model.Curso;

public class Clase15 {	
	
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
		
		Alumno alumnoNuevo = new Alumno("Luis Miguel", "001");
		
		System.out.println(alumno1.equals(alumnoNuevo));
		System.out.println(curso1.verificarAlumno(alumnoNuevo));
		
		
		
		
		
	}

}
