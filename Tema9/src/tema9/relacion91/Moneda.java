package tema9.relacion91;

public class Moneda {
	// Propiedades de la instancia
	private String nombre;
	private String orientacion;
	
	// Constructor
	public Moneda(String nombre, String orientacion) {
		super();
		this.nombre = nombre;
		this.orientacion = orientacion;
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOrientacion() {
		return orientacion;
	}

	public void setOrientacion(String orientacion) {
		this.orientacion = orientacion;
	}

	// toString
	public String toString() {
		return nombre + " - " + orientacion;
	}

}
