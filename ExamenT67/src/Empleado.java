/**
 * Clase Empleado que representa los empleados de una empresa.
 */
public abstract class Empleado {
	// Propiedades de la clase
	private static int contadorEmpleados = 0;

	// Propiedades de la instancia
	private String codigo;
	private String nombre;

	// Constructor
	public Empleado(String nombre) {
		codigo = Integer.toString(++contadorEmpleados);
		this.nombre = nombre;
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	// Método getEmpleadosContratados para saber el número de empleados hasta el
	// momento
	public static int getEmpleadosContratados() {
		return contadorEmpleados;
	}

	// toString
	public String toString() {
		return "Empleado [codigo=" + codigo + ", nombre=" + nombre + "]";
	}

}
