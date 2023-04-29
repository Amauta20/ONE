package Colegio;

import java.util.ArrayList;

import Model.Aula;
import Model.Curso;

public class Clase7 {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso("Java", 70);
		curso1.addAula(new Aula("Variables"));
		curso1.addAula(new Aula("Listas"));
		curso1.addAula(new Aula("ArrayList"));
		curso1.addAula(new Aula("Herencia"));
		curso1.addAula(new Aula("Inmutable"));
		
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);

		
		System.out.println(cursos.get(0).getAulaList());
		System.out.println();
		
		

	}

}
