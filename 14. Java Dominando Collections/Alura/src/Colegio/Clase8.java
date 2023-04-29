package Colegio;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Clase8 {
	
	@SuppressWarnings("serial")
	public static final List<List<Integer>> listas = new ArrayList<List<Integer>>() {
		{
			add(new LinkedList<Integer>());
			add(new ArrayList<Integer>());
		}
	};

	public static void main(String[] args) {
		
		for(List<Integer> list : listas) {
			final String nombreImplementacion = list.getClass().getSimpleName();
			
			//add
			long inicio = System.currentTimeMillis();
			for(int i = 0; i < 100000; i++) {
				list.add(i);
			}
			long fin = System.currentTimeMillis();
			long duracion = fin - inicio;
			
			System.out.println(nombreImplementacion + " add: " + duracion);
			
			
			//get
			inicio = System.currentTimeMillis();
			for(int i = 0; i < 100000; i++) {
				list.get(i);
			}
			fin = System.currentTimeMillis();
			duracion = fin - inicio;
			
			System.out.println(nombreImplementacion + " get: " + duracion);
			
			//remove
			inicio = System.currentTimeMillis();
			for(int i = 99999; i >= 0; i--) {
				list.remove(i);
			}
			fin = System.currentTimeMillis();
			duracion = fin - inicio;
			
			System.out.println(nombreImplementacion + " remove: " + duracion);
			
		}
		
	}

}
