package bytebankheredado;

public class CuentaCorriente extends Cuenta {
	
	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
		
		System.out.println("Creando Cuenta Corriente");
		
	}
	
	@Override
	public void sacar(double valor) {
		double comision = 0.2;
		super.sacar(valor + comision);
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
		
	}
	
	
}
