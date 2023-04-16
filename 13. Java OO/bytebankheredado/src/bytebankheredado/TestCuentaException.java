package bytebankheredado;

public class TestCuentaException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Cuenta cuenta = new CuentaAhorros(123, 45678);
	cuenta.depositar(1000);
	cuenta.retirar(5009);
	}

}
