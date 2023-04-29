package Colegio;

import java.util.ArrayList;

import Model.Curso;

public class Clase4 {
	
	public static void main(String[] args) {
		
		Curso curso1 = new Curso("Geometria", 30);
		Curso curso2 = new Curso("Fisica", 30);
		Curso curso3 = new Curso("Quimica", 30);
		Curso curso4 = new Curso("Historia", 30);
		
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		
		System.out.println(cursos);
		
	}
	
}
