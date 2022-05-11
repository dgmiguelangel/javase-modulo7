package clase13.mapas.comparator;

public class NomApeKey {
	
	private String nombre;
	private String apellido;
	
	public NomApeKey(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	

	@Override
	public String toString() {
		return "NomApeKey [nombre=" + nombre + ", apellido=" + apellido + "]";
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	

}
