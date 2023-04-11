// Entidad Cuenta
// Saldo
// Agencia
// Numero
// Titular

class Cuenta{
	private double saldo;
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
			System.out.println("Se asigno agencia correctamente");
		}
		total++;
		System.out.println("Se han creado " + total + " cuentas" );
		
		this.numero = numero;
		
	}
	
	//Metodo que no retorna valor
	void depositar(double valor){
		this.saldo += valor;
	}
	
	//Metodo que si retorna valor
	public boolean retirar(double valor){
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
		
	}
	
	//Metodo transferir
	public boolean transferir(double valor, Cuenta cuenta) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
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
