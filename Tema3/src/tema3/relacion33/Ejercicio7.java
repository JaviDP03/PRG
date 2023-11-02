package tema3.relacion33;

public class Ejercicio7 {
	/**
	 * Se pide un programa que genere 5 textos del tipo “PIEDRA”, “PAPEL” o “TIJERA”
	 * a partir de la generación de un número entero aleatorio entre 1 y 3. Usa
	 * for() y switch() para resolver este problema.
	 */

	public static void main(String[] args) {
		// Introducción de variables
		int numeroAleatorio;

		// Resultado
		for (int i = 0; i < 5; i++) {
			numeroAleatorio = (int) (Math.random() * 3 + 1);

			switch (numeroAleatorio) {
			case 1: // 1 = PIEDRA
				System.out.println("PIEDRA");
				break;
			case 2: // 2 = PAPEL
				System.out.println("PAPEL");
				break;
			case 3: // 3 = TIJERA
				System.out.println("TIJERA");
				break;
			}
		}

	}

}
