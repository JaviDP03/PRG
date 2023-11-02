package tema3.relacion33;

public class Ejercicio5 {
	/**
	 * Crea un programa que simule la Lotería Primitiva (sin n.º complementario),
	 * compuesta por seis números enteros aleatorios entre 1 y 49. (puede ser que
	 * genere números repetidos, pero no haremos control de esto)
	 */

	public static void main(String[] args) {
		// Resultado
		for (int i = 0; i < 6; i++) {
			System.out.print((int) (Math.random() * 49 + 1) + " | ");
		}

	}
}
