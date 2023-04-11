
public class PruebaEncapsulamiento {
	
	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta(10);
		Cliente cliente = new Cliente();
		cliente.setNombre("Diego");
		cliente.setDocumento("40ABC980");
		
		cuenta.setTitular(cliente);
		
		Cliente titular = cuenta.getTitular();
		
		System.out.println(cliente);
		System.out.println(cuenta.getTitular());
		System.out.println(titular);
	}
	
}
