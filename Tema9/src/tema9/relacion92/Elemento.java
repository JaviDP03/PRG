package tema9.relacion92;

import java.util.Objects;

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
		return String.format("%s PVP: %.2f Unidades: %d Subtotal: %.2f", nombre, precio, cantidad, getSubtotal());
	}

	@Override
	public int hashCode() {
		return Objects.hash(cantidad, nombre, precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Elemento other = (Elemento) obj;
		return cantidad == other.cantidad && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}

}
