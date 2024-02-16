package tema7.tarea73;

public class Figura {
	private String nombre;

	public Figura() {
		nombre = "Sin nombre";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Figura [nombre=" + nombre + "]";
	}

}
