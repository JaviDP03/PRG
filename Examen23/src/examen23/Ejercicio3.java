package examen23;

import java.util.Scanner;

public class Ejercicio3 {
	/**
	 * Un programa que pida acertar una palabra secreta que ya se encuentra
	 * almacenada en una variable. Al comenzar tiene que decir al usuario la
	 * longitud de la palabra. Conforme el usuario vaya acertando letras, estas se
	 * tienen que ir revelando.
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);

		String palabraSecreta;
		String palabraIntroducida;
		int longitud;

		// Inicialización
		palabraSecreta = "pescado";
		longitud = palabraSecreta.length();

		// Resultado
		System.out.println("La palabra secreta tiene " + longitud + " letras");
		do {
			System.out.println("Introduce una palabra:");
			palabraIntroducida = entrada.nextLine().toLowerCase();

			if (palabraIntroducida.length() == longitud) { // Se comprueba que tenga la longitud adecuada para que no de
															// error
				for (int i = 0; i < longitud; i++) { // Aquí se verifica cada letra para ver si es igual o no
					if (palabraSecreta.charAt(i) == palabraIntroducida.charAt(i)) {
						System.out.print(palabraSecreta.charAt(i));
					} else {
						System.out.print("*");
					}
				}
			} else {
				System.out.print("La palabra introducida no tiene " + longitud + " letras");
			}

			System.out.println();
		} while (!palabraIntroducida.equals(palabraSecreta)); // Se comprueba si la palabra es correcta para
																		// salir o no del bucle

		System.out.println("¡Enhorabuena!");

		// Liberación del scanner
		entrada.close();
	}

}