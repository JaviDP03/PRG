package tema5.relacion54;

/**
 * Una clase donde en su método main() se definirán dos tipos String (conductor
 * y matricula) a los que se inicializará con literales de prueba. Se llamarán a
 * otros métodos de la clase. Se pide usando métodos:
 */
public class Ejercicio1 {

	/**
	 * La subcadena inicial de conductor hasta la posición de una coma.
	 * 
	 * @param cadena
	 * @return
	 */
	public static String getSubcadenaInicial(String cadena) {
		return cadena.substring(0, cadena.indexOf(","));
	}

	/**
	 * El último carácter de cualquier cadena.
	 * 
	 * @param cadena
	 * @return
	 */
	public static char getUltimoCaracter(String cadena) {
		return cadena.charAt(cadena.length() - 1);
	}

	/**
	 * El carácter central de cualquier cadena.
	 * 
	 * @param cadena
	 * @return
	 */
	public static char getCaracterCentral(String cadena) {
		return cadena.charAt(cadena.length() / 2);
	}

	/**
	 * El entero de 4 posiciones que se encuentra en el inicio de la cadena
	 * matricula.
	 * 
	 * @param cadena
	 * @return
	 */
	public static String getInicioCuatroPosiciones(String cadena) {
		return cadena.substring(0, 4);
	}

	/**
	 * La subcadena contenida en las tres últimas posiciones de matricula.
	 * 
	 * @param cadena
	 * @return
	 */
	public static String getSubcadenaTresFinal(String cadena) {
		return cadena.substring(cadena.length() - 3, cadena.length());
	}

	public static void main(String[] args) {
		String conductor = "Viyuela, Pepe";
		String matricula = "3465GHX";

		System.out.println(getSubcadenaInicial(conductor));
		System.out.println(getUltimoCaracter(conductor));
		System.out.println(getCaracterCentral(conductor));
		System.out.println(getInicioCuatroPosiciones(matricula));
		System.out.println(getSubcadenaTresFinal(matricula));

	}

}
