package Colegio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import Model.Curso;

public class Clase9 {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso("Historia", 70);
		Curso curso2 = new Curso("Algebra", 10);
		Curso curso3 = new Curso("Aritmetica", 30);
		Curso curso4 = new Curso("Geometria", 40);
		Curso curso5 = new Curso("Religion", 200);
		
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		cursos.add(curso5);
		
		System.out.println(cursos);
		System.out.println();
		
		Collections.sort(cursos, Comparator.comparing(Curso :: getNombre).reversed());
		
		System.out.println("Tiempo total del curso");
		int tiempo = 0;
		for(Curso curso : cursos) {
			tiempo += curso.getTiempo();
		}
		
		System.out.println(tiempo);
		System.out.println();
		
		System.out.println("El aula con mayor tiempo");
		int mayor = 0; 
		for(Curso curso : cursos) {
			if(curso.getTiempo() > mayor) {
				mayor = curso.getTiempo();
			}
		}
		
		System.out.println(mayor);
		System.out.println();
		
		List<Curso> cursoList2 = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Algebra")).sorted(Comparator.comparingInt(Curso :: getTiempo)).collect(Collectors.toList());
		System.out.println(cursoList2);
		System.out.println();
		
		System.out.println("El aula con el tiempo mayor metodo stream");
		System.out.println(cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt());
		System.out.println();
		
		System.out.println("El aula con el tiempo mayor metodo stream");
		System.out.println(cursoList2.stream().mapToInt(Curso::getTiempo).sum());
		
		

	}

}
