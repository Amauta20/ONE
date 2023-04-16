package bytebankheredado;

public class CuentaAhorros extends Cuenta {

	public CuentaAhorros(int agencia, int numero) {
		super(agencia, numero);

		System.out.println("Creando Cuenta de Ahorros");
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	
}
