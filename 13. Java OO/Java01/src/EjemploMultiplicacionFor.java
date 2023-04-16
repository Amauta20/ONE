
public class EjemploMultiplicacionFor {

	public static void main(String[] args) {
		
		for(int contador = 1; contador <= 10; contador++) {
			for(int multiplicador = 1; multiplicador <= 10; multiplicador++) {
				System.out.println(contador + "*" + multiplicador + "=" + contador * multiplicador);
			}
		}
	}
	
}
