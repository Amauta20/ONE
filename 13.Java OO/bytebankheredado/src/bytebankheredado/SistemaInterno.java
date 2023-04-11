package bytebankheredado;

public class SistemaInterno {
	
	private String clave = "AluraLatam";
	
	public boolean Autentica(Autenticable gerente) {
		
		boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
				
		if(puedeIniciarSesion) {
			System.out.println("Login Exitoso");
			return true;
		}else {
			System.out.println("Error Login");
			return false;
		}
		
	}
	
}
