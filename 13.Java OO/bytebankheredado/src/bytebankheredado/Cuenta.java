package bytebankheredado;
// Entidad Cuenta
// Saldo
// Agencia
// Numero
// Titular

public abstract class Cuenta{
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	
	private static int total = 0;
	
	public Cuenta(int agencia, int numero) {
		
		if(agencia <= 0) {
			System.out.println("No se permite este valor");
			this.agencia = 1;
		}else {
			this.agencia = agencia;
		}
		
		this.numero = numero;
		
	}
	
	//Metodo que no retorna valor
	public abstract void depositar(double valor);
	
	//Metodo de sacar dinero
	public void sacar(double valor){
		this.saldo -= valor;
	}
	
	
	//Metodo que si retorna valor
	public void retirar(double valor){
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("No tiene saldo suficiente");
		}this.saldo -= valor;

	}
	
	//Metodo transferir
	public boolean transferir(double valor, Cuenta cuenta) {
		if(this.saldo >= valor) {
			this.sacar(valor);
			cuenta.depositar(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public double getAgencia() {
		return this.agencia;
	}
	
	public double getNumero() {
		return this.numero;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public static int getTotal(){
		return Cuenta.total;
	}
	
	public void setAgencia(int agencia) {
		if(agencia > 0){
			this.agencia = agencia;
		}else {
			System.out.println("No estan permitidos valores negativos");
		}
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	
}
