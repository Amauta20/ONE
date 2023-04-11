package bytebankheredado;

public class Gerente extends Funcionario implements Autenticable {
	
	@Override
	public double getBonificacion() {
		System.out.println("Ejecutando desde Gerente");
		//return super.getSalario() + this.getSalario()*0.05;
		return 2000;
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
