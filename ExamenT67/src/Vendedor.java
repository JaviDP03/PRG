/**
 * Clase Vendedor (subclase de Empleado) que además almacena la especialidad y
 * experiencia del mismo.
 */
public class Vendedor extends Empleado {
	// Propiedades de la instancia
	private String especialidad;
	private int añosExperiencia;

	// Constructores
	public Vendedor(String nombre, String especialidad, int añosExperiencia) {
		super(nombre);
		this.especialidad = especialidad;
		this.añosExperiencia = añosExperiencia;
	}

	public Vendedor(String nombre, String especialidad) {
		this(nombre, especialidad, 0);
	}

	// Getters
	public String getEspecialidad() {
		return especialidad;
	}

	public int getAñosExperiencia() {
		return añosExperiencia;
	}

	@Override
	public String getCodigo() {
		return "VE-" + super.getCodigo();
	}

	@Override
	public String toString() {
		return "Vendedor [codigo=" + getCodigo() + ", nombre=" + getNombre() + ", especialidad=" + especialidad
				+ ", añosExperiencia=" + añosExperiencia + "]";
	}

}
