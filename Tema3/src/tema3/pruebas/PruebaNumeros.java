package tema3.pruebas;

import java.util.Scanner;

public class PruebaNumeros {
	/**
	 * Escribe un programa que lea un número por teclado de 8 dígitos y los ordene
	 * de mayor a menor por parejas
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		int numeroIntroducido;

		// Inicialización
		System.out.println("Introduce un número de 8 cifras:");
		numeroIntroducido = Integer.parseInt(entrada.nextLine());

		// Resultado
		for (int i = 0; i < 4 ; i++) {
			System.out.print(numeroIntroducido % 100);

			numeroIntroducido /= 100;
		}

		// Liberación del scanner
		entrada.close();
	}

}
