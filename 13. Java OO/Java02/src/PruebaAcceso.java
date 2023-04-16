
public class PruebaAcceso {

	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta(22);
		
		cuenta.setAgencia(-22);
		
		cuenta.depositar(2000);
		cuenta.retirar(500);
		cuenta.depositar(1500);
		
		System.out.println(cuenta.getAgencia());
		System.out.println(cuenta.getSaldo());
		
	}
	
}
