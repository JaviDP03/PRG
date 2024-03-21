package tema9.relacion92;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Alumno {
	// Propiedades de la instancia
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;
	private String dni;

	// Constructor
	public Alumno() {
		this.nombre = null;
		this.apellidos = null;
		this.fechaNacimiento = null;
		this.dni = null;
	}

	public Alumno(String nombre, String apellidos, LocalDate fechaNacimiento, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.dni = dni;
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	// toString
	public String toString() {
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento="
				+ fechaNacimiento.format(formatoFecha) + ", dni=" + dni + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, dni, fechaNacimiento, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(dni, other.dni)
				&& Objects.equals(fechaNacimiento, other.fechaNacimiento) && Objects.equals(nombre, other.nombre);
	}

}
