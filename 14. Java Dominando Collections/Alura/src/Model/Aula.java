package Model;

public class Aula {

	private String nombre;
	
	public Aula(String nombre) {
		this.setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return this.nombre;
	}
	
	public int compareTo(Curso o) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(o.getNombre());
	}
	
	
}
