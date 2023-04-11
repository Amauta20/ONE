
public class Condicionales {
	
	public static void main(String[] args) {
		
		System.out.println("Hola Mundo");
		
		int edad = 17;
		int cantidadPersonas = 2;
		
		if (edad >= 18) {
			System.out.println("Usted puede entrar");
			System.out.println("Bienvenido");
		}else {
			if(cantidadPersonas >= 2) {
				System.out.println("Usted es menor de edad, pero esta "
						+ "permitido tu ingreso");
			}else {
				System.out.println("Usted no esta permitido entrar");
			}
		}
		
	}
	
	
}
