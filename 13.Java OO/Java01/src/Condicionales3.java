
public class Condicionales3 {
	
	public static void main(String[] args) {
		
		System.out.println("Hola Mundo");
		
		int edad = 17;
		int cantidadPersonas = 3;
		
		boolean esPareja = cantidadPersonas > 1;
		System.out.println("El valor de la condicion es " + esPareja);
		
		if (edad >= 18 || esPareja == true) {
			System.out.println("Usted puede entrar");
			System.out.println("Bienvenido");
		}else {
			System.out.println("Usted no esta permitido entrar");
		}
		
	}
	
}
