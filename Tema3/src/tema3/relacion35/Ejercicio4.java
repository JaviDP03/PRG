package tema3.relacion35;

public class Ejercicio4 {
	/**
	 * Construir un programa que visualice por pantalla todos los caracteres
	 * correspondientes a letras minúsculas
	 */
	public static void main(String[] args) {
		// Introducción de variables
		char letra;

		// Inicialización
		letra = 'a';

		// Resultado
		do {
			System.out.print(letra + " ");

			letra++;
		} while (letra <= 'z');
	}

}
