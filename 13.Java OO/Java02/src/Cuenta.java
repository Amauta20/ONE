// Entidad Cuenta
// Saldo
// Agencia
// Numero
// Titular

class Cuenta{
	double saldo;
	int agencia = 33;
	int numero;
	String titular;
	
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
	
}
