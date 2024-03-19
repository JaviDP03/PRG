package tema9.ejemplos;

import java.util.Comparator;
import java.util.Objects;

class ComparadorPersonasPorNombre implements Comparator<Persona> {
	// compare
	public int compare(Persona o1, Persona o2) {
		String nombre1, nombre2;

		nombre1 = o1.getNombre();
		nombre2 = o2.getNombre();

		return nombre1.compareTo(nombre2);
	}

}

public class Persona implements Comparable<Persona> {
	// Propiedades de instancia
	private String nombre;
	private String dni;
	private int edad;

	public static class ComparadorNombre implements Comparator<Persona> {
		@Override
		public int compare(Persona o1, Persona o2) {
			return o1.edad - o2.edad;
		}

	}

	// Constructor
	public Persona(String nombre, String dni, int edad) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// toString
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + "]";
	}

	// hashCode
	public int hashCode() {
		return Objects.hash(dni, edad, nombre);
	}

	// equals
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(dni, other.dni) && edad == other.edad && Objects.equals(nombre, other.nombre);
	}

	// compareTo
	public int compareTo(Persona o) {
		return this.nombre.compareTo(o.nombre);
	}

}
