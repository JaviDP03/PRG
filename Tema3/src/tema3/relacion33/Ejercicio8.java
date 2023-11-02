package tema3.relacion33;

import java.util.Scanner;

public class Ejercicio8 {
	/**
	 * Hay casos especiales de bucle for con número de iteraciones no prefijadas
	 * como puede ser el siguiente: Escribe un programa que permita ir introduciendo
	 * una serie indeterminada de números mientras su suma no supere el valor 10000.
	 * Cuando esto último ocurra, se debe mostrar el total acumulado, el contador de
	 * los números introducidos y la media.
	 */

	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		int numeroInicial, numeroASumar, contador;

		// Inicialización
		System.out.println("Introduce un número:");
		numeroInicial = Integer.parseInt(entrada.nextLine());

		contador = 1;

		// Resultado
		for (; numeroInicial <= 10000;) {
			System.out.println("Introduce un número:");
			numeroASumar = Integer.parseInt(entrada.nextLine());

			numeroInicial = numeroInicial + numeroASumar;

			contador++;
		}

		System.out.println("Total acumulado: " + numeroInicial);
		System.out.println("Números introducidos: " + contador);
		System.out.println("Media: " + numeroInicial / contador);

		// Liberación del scanner
		entrada.close();
	}

}
