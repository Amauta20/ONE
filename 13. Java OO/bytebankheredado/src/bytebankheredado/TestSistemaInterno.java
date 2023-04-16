package bytebankheredado;

public class TestSistemaInterno {
	public static void main(String[] args) {
		
		SistemaInterno Sistema = new SistemaInterno();
		Gerente gerente1 = new Gerente();
		Administrador Admin = new Administrador();
		
		Sistema.Autentica(gerente1);
		Sistema.Autentica(Admin);
		
	}
}
