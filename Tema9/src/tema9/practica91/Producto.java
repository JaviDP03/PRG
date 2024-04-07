package tema9.practica91;

import java.io.Serializable;
import java.util.Objects;

/**
 * Clase Producto que representa un producto para su uso en la aplicación.
 */
public class Producto implements Serializable, Comparable<Producto> {
	// Propiedades del objeto
	private static final long serialVersionUID = 1L;

	// Propiedades de la instancia
	private int id;
	private String nombre;
	private double precio;

	/**
	 * Constructor
	 * 
	 * @param id     único del producto
	 * @param nombre del producto
	 * @param precio del producto
	 */
	public Producto(int id, String nombre, double precio) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}

	// Getters y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	// toString
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + "]";
	}

	// Otros métodos
	@Override
	public int hashCode() {
		return Objects.hash(id, nombre, precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return id == other.id && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}

	@Override
	public int compareTo(Producto o) {
		return 0;
	}

}
