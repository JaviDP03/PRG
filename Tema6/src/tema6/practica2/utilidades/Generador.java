package tema6.practica2.utilidades;
/**
 * Clase Generador que crea datos al azar.
 */
public class Generador {
	// Propiedades del objeto
	private static String[] listaNombres = { "Sal", "Pimiento", "Chorizo", "Harina", "Levadura", "Tomate", "Pepino", "Aceite" };

	/**
	 * Método que genera un nuevo código de ingrediente.
	 * @return código
	 */
	public static String nuevoCodigo() {
		char letra = (char) (Math.random() * 25 + 65);
		int numero1 = (int) (Math.random() * 10);
		int numero2 = (int) (Math.random() * 10);
		int numero3 = (int) (Math.random() * 10);

		return String.format("%s-%d%d%d", letra, numero1, numero2, numero3);
	}

	/**
	 * Método que devuelve un nombre generado para el ingrediente.
	 * @return nombre
	 */
	public static String nuevoNombre() {
		int numeroAleatorio = (int) (Math.random() * 8);

		return listaNombres[numeroAleatorio];
	}

	/**
	 * Método que genera un peso para el ingrediente.
	 * @return peso entre 1 y 200
	 */
	public static int nuevoPeso() {
		return (int) (Math.random() * 201 + 1);
	}
}
