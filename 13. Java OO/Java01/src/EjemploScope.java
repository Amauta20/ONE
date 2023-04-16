
public class EjemploScope {

	public static void main(String[] args) {
		
		System.out.println("Hola Mundo");
		
		int edad = 21;
		int cantidadPersonas = 2;
		boolean esPersona;
		boolean esPareja;
		
		//boolean esPareja = cantidadPersonas > 1;
		//System.out.println("El valor de la condicion es " + esPareja);
		
		if(cantidadPersonas > 1){
			esPareja = true;
		}else {
			esPareja = false;
		}
		
		if (edad >= 18 || esPareja == true) {
			System.out.println("Usted puede entrar");
			System.out.println("Bienvenido");
		}else {
			System.out.println("Usted no esta permitido entrar");
		}
		
	}

}
