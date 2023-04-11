
public class PruebaMetodos {
	
	
	public static void main(String[] args) {
		
		Cuenta miCuenta = new Cuenta(6);
			miCuenta.depositar(200);
			miCuenta.depositar(300);
			
			System.out.println(miCuenta.getSaldo());
			
			miCuenta.retirar(100);
			System.out.println(miCuenta.getSaldo());
		
		Cuenta cuentaJimena = new Cuenta(6);
			cuentaJimena.depositar(1000);
			
			boolean puedeTransferir = cuentaJimena.transferir(200, miCuenta);
			
			if(puedeTransferir) {
				System.out.println("Transferencia exitosa");
			}else {
				System.out.println("No es posible");
			}
			
			System.out.println(miCuenta.getSaldo());
			System.out.println(cuentaJimena.getSaldo());
			
	}	
}
