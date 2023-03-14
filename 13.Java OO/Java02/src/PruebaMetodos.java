
public class PruebaMetodos {
	
	
	public static void main(String[] args) {
		
		Cuenta miCuenta = new Cuenta();
			miCuenta.saldo = 200;
			miCuenta.depositar(300);
			
			System.out.println(miCuenta.saldo );
			
			miCuenta.retirar(100);
			System.out.println(miCuenta.saldo );
		
		Cuenta cuentaJimena = new Cuenta();
			cuentaJimena.depositar(1000);
			
			boolean puedeTransferir = cuentaJimena.transferir(200, miCuenta);
			
			if(puedeTransferir) {
				System.out.println("Transferencia exitosa");
			}else {
				System.out.println("No es posible");
			}
			
			System.out.println(miCuenta.saldo );
			System.out.println(cuentaJimena.saldo );
			
	}	
}
