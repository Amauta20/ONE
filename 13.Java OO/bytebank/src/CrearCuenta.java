
public class CrearCuenta {
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta(12); 
		
		primeraCuenta.depositar(1000);
		System.out.println(primeraCuenta.getSaldo());
		
		Cuenta segundaCuenta = new Cuenta(10);
		segundaCuenta.depositar(500);
		System.out.println(segundaCuenta.getSaldo());
		System.out.println(segundaCuenta.getAgencia());
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
		if(primeraCuenta == segundaCuenta) {
			System.out.println("Son el mismo objeto");
		}else {
			System.out.println("Son objetos diferentes");
		}
		
	}
}
