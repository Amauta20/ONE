package Colegio;

import java.util.ArrayList;

public class Clase2 {
	
	public static void main(String[] args) {
		
		String variable1 = "Clase 1";
		String variable2 = "Clase 2";
		String variable3 = "Clase 3";
		String variable4 = "Clase 4";
		
		ArrayList<String> listaString = new ArrayList<>();
		listaString.add(variable1);
		listaString.add(variable2);
		listaString.add(variable3);
		listaString.add(variable4);
		
		System.out.println(listaString);
		System.out.println();
		
		System.out.println("Metodo For");
		for(int i = 0; i < listaString.size(); i++  ) {
			System.out.println(listaString.get(i));
		}
		System.out.println();
		
		System.out.println("Metodo ForEach");
		for (String Clase : listaString) {
			System.out.println(Clase);
		}
		System.out.println();
		
		System.out.println("Metodo Lampira");
		listaString.forEach(Clase->{
			System.out.println(Clase);
		});
		System.out.println();
		
		
	}
	
}
