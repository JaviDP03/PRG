package tema3.relacion34;

import java.util.Scanner;

public class Ejercicio4 {
	/**
	 * Realizar un juego para adivinar un número. Para ello pedir un número N, y
	 * luego ir pidiendo números indicando “Éste es mayor” o “Éste es menor” según
	 * sea mayor o menor con respecto a N. El proceso termina cuando el usuario
	 * acierta.
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		int numeroIntroducido, numeroParaAdivinar;

		// Inicialización
		numeroParaAdivinar = (int) (Math.random() * 100);

		System.out.println("Introduce un número (0-100):");
		numeroIntroducido = Integer.parseInt(entrada.nextLine());

		// Resultado
		while (numeroIntroducido != numeroParaAdivinar) {
			if (numeroIntroducido < numeroParaAdivinar) {
				System.out.println("Éste es menor");
			} else {
				System.out.println("Éste es mayor");
			}
			
			System.out.println("Introduce un número (0-100):");
			numeroIntroducido = Integer.parseInt(entrada.nextLine());
		}

		System.out.println("¡Has acertado!");

		// Liberación del scanner
		entrada.close();
	}

}
