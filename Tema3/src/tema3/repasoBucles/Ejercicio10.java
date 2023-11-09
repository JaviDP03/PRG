package tema3.repasoBucles;

public class Ejercicio10 {
	/**
	 * Muestra los números primos entre 1 y 100.
	 */
	public static void main(String[] args) {
		// Introducción de variables
		boolean esPrimo;

		// Inicialización
		esPrimo = true;

		// Resultado
		for (int i = 1; i <= 100; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					esPrimo = false;
				}
			}

			if (esPrimo) {
				System.out.println(i);
			}

			esPrimo = true;
		}

	}

}
