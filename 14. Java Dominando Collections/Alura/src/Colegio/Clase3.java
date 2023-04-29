package Colegio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Clase3 {
	
	public static void main(String[] args) {
		
		String curso1 = "Geometria";
		String curso2 = "Fisica";
		String curso3 = "Quimica";
		String curso4 = "Historia";
		
		ArrayList<String> Cursos = new ArrayList<>();
		Cursos.add(curso1);
		Cursos.add(curso2);
		Cursos.add(curso3);
		Cursos.add(curso4);
		
		System.out.println(Cursos);
		System.out.println();
		
		System.out.println("Ordenas de forma ascedente - Collection");
		Collections.sort(Cursos);
		System.out.println(Cursos);
		System.out.println();
		
		System.out.println("Ordenas de forma descendente - Collection");
		Collections.sort(Cursos, Collections.reverseOrder());
		System.out.println(Cursos);
		System.out.println();
		
		System.out.println("Ordenas de forma ascendente - Comparator");
		Cursos.sort(Comparator.naturalOrder());
		System.out.println(Cursos);
		System.out.println();
		
		System.out.println("Ordenas de forma descendente - Comparator");
		Cursos.sort(Comparator.reverseOrder());
		System.out.println(Cursos);
		System.out.println();
		
		System.out.println("Ordenas de forma descendente - Stream");
		List<String> CursosList = Cursos.stream().sorted().collect(Collectors.toList());
		System.out.println(CursosList);
		System.out.println();
	}
	
}
