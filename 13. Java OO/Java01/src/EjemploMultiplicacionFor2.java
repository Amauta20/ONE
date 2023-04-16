
public class EjemploMultiplicacionFor2 {

	public static void main(String[] args) {
		
		for(int contador = 1; contador <= 10; contador++) {
			for(int multiplicador = 1; multiplicador <= 10; multiplicador++) {
				System.out.print(contador * multiplicador);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
	
}
