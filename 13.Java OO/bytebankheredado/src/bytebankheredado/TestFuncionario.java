package bytebankheredado;

public class TestFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario diego = new Contador();
		diego.setNombre("Diego");
		diego.setDocumento("33445566");
		diego.setSalario(2000);
		diego.setTipo(0);
		
		System.out.println(diego.getSalario());
		System.out.println(diego.getBonificacion());
		
	}

}
