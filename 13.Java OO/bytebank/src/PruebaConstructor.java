
public class PruebaConstructor {
	
	public static void main(String[] args) {
		
		Cuenta cuenta1 = new Cuenta(100);
		Cuenta cuenta2 = new Cuenta(200);
		Cuenta cuenta3 = new Cuenta(300);
		
		System.out.println(cuenta1.getAgencia());
		System.out.println(cuenta2.getAgencia());
		System.out.println(cuenta3.getAgencia());
		
		System.out.println(Cuenta.getTotal());
	}
	
}
