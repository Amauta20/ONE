package bytebankheredado;

public class TestGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gerente gerente = new Gerente();
		gerente.setSalario(6000);
		gerente.setClave("PaseAlura");
		gerente.setTipo(1);
		
		System.out.println(gerente.getBonificacion());
		System.out.println(gerente.iniciarSesion("PaseAlura"));
		
	}

}
