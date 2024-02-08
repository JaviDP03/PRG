package tema6.relacion66;

public class Dni {
	// Propiedades de la clase
	private final static String secuenciaLetras = "TRWAGMYFPDXBNJZSQVHLCKE";

	// Propiedades de la instancia
	private int numero;
	private char letra;
	
	// Constructores
	public Dni() throws Exception {
		this(0);
	}

	public Dni(int numero) throws Exception {
		setNumero(numero);
	}

	public Dni(String dni) throws Exception {
		setDni(dni);
	}

	// Getters y Setters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) throws Exception {
		if (numero < 0 || numero > 99999999) {
			throw new Exception("El número está fuera de rango");
		}
		this.numero = numero;
		letra = calcularLetra(numero);
	}

	public String getDni() {
		return String.format("%d%s", numero, letra);
	}

	public void setDni(String dni) throws Exception {
		if (dni == null || dni.length() != 9) {
			throw new Exception("El DNI no tiene el formato adecuado");
		}
		
		if (calcularLetra(extraerNumero(dni)) != extraerLetra(dni)) {
			throw new Exception("La letra del DNI no corresponde a esa combinación de números");
		}
		
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
