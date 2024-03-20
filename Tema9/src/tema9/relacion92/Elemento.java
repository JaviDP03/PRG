package tema9.relacion92;

public class Elemento {
	// Propiedades de la instancia
	private String nombre;
	private double precio;
	private int cantidad;

	// Constructor
	public Elemento(String nombre, double precio, int cantidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	// Métodos
	public double getSubtotal() {
		return getPrecio() * getCantidad();
	}

	// toString
	public String toString() {
		return "Elemento [nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}

}
