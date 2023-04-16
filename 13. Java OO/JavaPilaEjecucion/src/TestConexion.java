
public class TestConexion {
	
	public static void main(String[] args) throws Exception {
		
		try(Conexion con = new Conexion()){
			con.leerDatos();
		}catch(IllegalStateException ix){
			System.out.println("Ejecutando Catch");
			ix.printStackTrace();
		}
		
		
		/*Conexion con = null;
		
		try {
			con = new Conexion();
			con.leerDatos();
		}catch(IllegalStateException ex) {
			ex.printStackTrace();
		}finally {
			System.out.println("Finally exception");
			if(con != null) {
				con.cerrar();
			}
			
		}*/
		
		
	}
	
}
