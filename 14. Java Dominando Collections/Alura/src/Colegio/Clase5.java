package Colegio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import Model.Curso;

public class Clase5 {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso("Python", 70);
		Curso curso2 = new Curso("Ruby", 10);
		Curso curso3 = new Curso("PHP", 30);
		Curso curso4 = new Curso("JavaScript", 40);
		Curso curso5 = new Curso("Java", 200);
		
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		cursos.add(curso5);
		
		System.out.println(cursos);
		System.out.println();
		
		System.out.println("Metodo Comparable");
		Collections.sort(cursos);
		System.out.println(cursos);
		System.out.println();
		
		System.out.println("Metodo Comparable List");
		Collections.sort((List<Curso>) cursos);
		System.out.println(cursos);
		System.out.println();
		
		System.out.println("Metodo Comparable Inverso");
		Collections.sort(cursos, Collections.reverseOrder());
		System.out.println(cursos);
		System.out.println();
		
		System.out.println("Metodo Comparable Usando Lampira");
		List<Curso> cursoList1 = cursos.stream().sorted(Comparator.comparingInt(Curso :: getTiempo)).collect(Collectors.toList());
		System.out.println(cursoList1);
		System.out.println();
		
		System.out.println("Metodo Comparable Usando Lampira Quitar Ruby");
		List<Curso> cursoList2 = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Ruby")).sorted(Comparator.comparingInt(Curso :: getTiempo)).collect(Collectors.toList());
		System.out.println(cursoList2);
		System.out.println();

	}

}
