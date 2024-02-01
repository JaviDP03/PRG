package tema6.relacion64;

/**
 * Clase Password que genera contraseñas dependiendo de su longitud.
 */
public class Password {
	private int longitud;
	private String contraseña;

	/**
	 * Constructor por defecto
	 */
	public Password() {
		longitud = 8;

		contraseña = "";
		for (int i = 0; i < longitud; i++) {
			contraseña = contraseña + (char) (Math.random() * 74 + 48);
		}
	}

	/**
	 * Constructor con longitud variable
	 * 
	 * @param longitud
	 */
	public Password(int longitud) {
		this.longitud = longitud;

		contraseña = "";
		for (int i = 0; i < longitud; i++) {
			contraseña = contraseña + (char) (Math.random() * 74 + 48);
		}
	}

	/**
	 * toString
	 */
	public String toString() {
		return contraseña;
	}

	/**
	 * Verificar si la contraseña es fuerte
	 */
	public boolean esFuerte() {
		boolean hayMayuscula = false;
		boolean hayMinuscula = false;
		boolean hayNumero = false;
		char caracterActual;

		for (int i = 0; i < contraseña.length(); i++) {
			caracterActual = contraseña.charAt(i);

			if (Character.isUpperCase(caracterActual)) {
				hayMayuscula = true;
			}

			if (Character.isLowerCase(caracterActual)) {
				hayMinuscula = true;
			}

			if (Character.isDigit(caracterActual)) {
				hayNumero = true;
			}
		}

		if (longitud >= 8 && hayMayuscula && hayMinuscula && hayNumero) {
			return true;
		}

		return false;
	}

	/**
	 * Generar una contraseña
	 */
	public void generarContraseña() {
		contraseña = "";
		
		for (int i = 0; i < longitud; i++) {
			contraseña = contraseña + (char) (Math.random() * 74 + 48);
		}
	}

	/**
	 * @return the longitud
	 */
	public int getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	/**
	 * @return the contraseña
	 */
	public String getContraseña() {
		return contraseña;
	}
	
	
}
