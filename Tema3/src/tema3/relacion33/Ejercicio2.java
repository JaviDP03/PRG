package tema3.relacion33;

import java.util.Scanner;

public class Ejercicio2 {
	/**
	 * Escribe un programa que lea una lista de diez números y determine cuántos son
	 * positivos, y cuántos son negativos.
	 */

	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		int numero, contadorPositivo = 0, contadorNegativo = 0;

		// Resultado
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduce un número:");
			numero = Integer.parseInt(entrada.nextLine());

			if (numero < 0) {
				System.out.printf("%d --> negativo\n\n", numero);
				contadorNegativo++;
			} else {
				System.out.printf("%d --> positivo\n\n", numero);
				contadorPositivo++;
			}
		}

		System.out.printf("Hay %d números positivos y %d números negativos\n", contadorPositivo, contadorNegativo);

		// Liberación del scanner
		entrada.close();
	}

}
