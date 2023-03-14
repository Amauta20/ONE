
public class TestReferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 200;
		System.out.println("Saldo primera cuenta: "+ primeraCuenta.saldo);
		
		Cuenta segundaCuenta = primeraCuenta;
		segundaCuenta.saldo = 500;
		System.out.println("Saldo segunda cuenta: "+ segundaCuenta.saldo);
		System.out.println("Saldo primera cuenta: "+ primeraCuenta.saldo);
		
		segundaCuenta.saldo += 2000;
		System.out.println("Saldo primera cuenta: "+ primeraCuenta.saldo);
		System.out.println("Saldo segunda cuenta: "+ segundaCuenta.saldo);
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
	}

}
