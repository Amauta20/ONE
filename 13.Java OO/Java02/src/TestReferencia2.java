
public class TestReferencia2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente Diego = new Cliente();
			Diego.setNombre("Diego");
			Diego.setDocumento("44668800");
			Diego.setTelefono("945557458");
		
		Cuenta cuentaDiego = new Cuenta(14);
			cuentaDiego.setAgencia(1);
			cuentaDiego.setTitular(Diego);
			
			System.out.println(cuentaDiego.getTitular().getDocumento());
			System.out.println(cuentaDiego.getTitular());
			System.out.println(Diego);
	}

}
