package Colegio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import Model.Curso;

public class Clase10 {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso("Historia", 70);
		Curso curso2 = new Curso("Algebra", 10);
		Curso curso3 = new Curso("Aritmetica", 30);
		Curso curso4 = new Curso("Geometria", 40);
		Curso curso5 = new Curso("Religion", 200);
		Curso curso6 = new Curso("Fisica", 100);
		Curso curso7 = new Curso("Literatura", 80);
		Curso curso8 = new Curso("Quimica", 150);
		Curso curso9 = new Curso("Comunicacion", 130);
		
		
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		cursos.add(curso5);
		cursos.add(curso6);
		cursos.add(curso7);
		cursos.add(curso8);
		cursos.add(curso9);
		
		System.out.println(cursos);
		System.out.println();
		
		Collections.sort(cursos, Comparator.comparing(Curso :: getNombre).reversed());
		
		System.out.println(cursos);
		System.out.println();
		
		
		List<Curso> cursoList2 = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Algebra")).sorted(Comparator.comparingInt(Curso :: getTiempo)).collect(Collectors.toList());
		System.out.println(cursoList2);
		System.out.println();
		
		System.out.println("El aula con el tiempo mayor metodo stream");
		System.out.println(cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt());
		System.out.println();
		
		System.out.println("El aula suma");
		System.out.println(cursoList2.stream().mapToInt(Curso::getTiempo).sum());
		System.out.println();
		
		System.out.println("El aula promedio");
		System.out.println(cursoList2.stream().mapToInt(Curso::getTiempo).average().getAsDouble());
		System.out.println();
		
		System.out.println("El aula maximo");
		System.out.println(cursoList2.stream().mapToInt(Curso::getTiempo).max().getAsInt());
		System.out.println();
		
		System.out.println("El aula minimo");
		System.out.println(cursoList2.stream().mapToInt(Curso::getTiempo).min().getAsInt());
		System.out.println();
		
		System.out.println("Mapa de cursos");
		Map<String, List<Curso>> grupoCursos = cursos.stream().collect(Collectors.groupingBy(Curso :: getNombre));
		grupoCursos.forEach((key, value) -> System.out.println(key + " - " + value.size()));
		System.out.println();
		
		System.out.println("ParallelStream");
		System.out.println(cursos.parallelStream().mapToInt(Curso :: getTiempo).sum());

	}

}
