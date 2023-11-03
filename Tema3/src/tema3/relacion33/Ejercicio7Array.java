package tema3.relacion33;

public class Ejercicio7Array {
	/**
	 * Se pide un programa que genere 5 textos del tipo “PIEDRA”, “PAPEL” o “TIJERA”
	 * a partir de la generación de un número entero aleatorio entre 1 y 3. Usa
	 * for() y switch() para resolver este problema.
	 */

	public static void main(String[] args) {
		// Introducción de variables
		int numeroAleatorio;
		String[] lista = { "PIEDRA", "PAPEL", "TIJERA" };

		// Resultado
		for (int i = 0; i < 5; i++) {
			numeroAleatorio = (int) (Math.random() * 3);
			
			System.out.println(lista[numeroAleatorio]);
		}

	}

}
