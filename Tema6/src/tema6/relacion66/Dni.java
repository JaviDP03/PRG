package tema6.relacion66;

public class Dni {
	// Propiedades de la clase
	private final static String secuenciaLetras = "TRWAGMYFPDXBNJZSQVHLCKE";

	// Propiedades de la instancia
	private int numero;
	private char letra;

	// Constructores
	public Dni() {
		this(0);
	}

	public Dni(int numero) {
		setNumero(numero);
	}

	public Dni(String dni) {
		setDni(dni);
	}

	// Getters y Setters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
		letra = calcularLetra(numero);
	}

	public String getDni() {
		return String.format("%d%s", numero, letra);
	}

	public void setDni(String dni) {
		numero = extraerNumero(dni);
		letra = extraerLetra(dni);
	}

	// Métodos
	public static char calcularLetra(int numero) {
		return secuenciaLetras.charAt(numero % 23);
	}

	public static char extraerLetra(String dni) {
		return dni.charAt(8);
	}

	public static int extraerNumero(String dni) {
		return Integer.parseInt(dni.substring(0, 8));
	}

}
