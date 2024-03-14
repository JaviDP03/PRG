package tema9.relacion91;

public class Carta {
	public static String[] listaTipos = { "bastos", "copas", "espadas", "oros" };
	public static String[] listaNumeraciones = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "sota", "caballo",
			"rey" };

	// Propiedades de la instancia
	private String tipo;
	private String numeracion;

	// Constructor
	public Carta(String tipo, String numeracion) {
		super();
		this.tipo = tipo;
		this.numeracion = numeracion;
	}

	// Getters y Setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNumeracion() {
		return numeracion;
	}

	public void setNumeracion(String numeracion) {
		this.numeracion = numeracion;
	}

	// toString
	public String toString() {
		return numeracion + " - " + tipo;
	}

}
