
public class TestReferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuenta primeraCuenta = new Cuenta(2);
		primeraCuenta.depositar(200);
		System.out.println("Saldo primera cuenta: "+ primeraCuenta.getSaldo());
		
		Cuenta segundaCuenta = primeraCuenta;
		segundaCuenta.depositar(500);
		System.out.println("Saldo segunda cuenta: "+ segundaCuenta.getSaldo());
		System.out.println("Saldo primera cuenta: "+ primeraCuenta.getSaldo());
		
		segundaCuenta.depositar(2000);
		System.out.println("Saldo primera cuenta: "+ primeraCuenta.getSaldo());
		System.out.println("Saldo segunda cuenta: "+ segundaCuenta.getSaldo());
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
	}

}
