package tema5.resumen;

/**
 * Crea un array de 5 elementos de tipo cadena, usando new. Asigna el valor
 * “Hola” al elemento quinto. Muestra por pantalla todos los valores del array,
 * separados por espacios en blanco.
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		String[] elementosCadena = new String[5];
		
		elementosCadena[4] = "Hola";
		
		for (String string : elementosCadena) {
			System.out.printf("%s ", string);
		}
	}

}
