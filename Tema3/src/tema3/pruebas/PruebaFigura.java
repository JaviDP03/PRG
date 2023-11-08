package tema3.pruebas;

import java.util.Iterator;
import java.util.Scanner;

public class PruebaFigura {
	/**
	 * Escribe un programa que dibuje una S con asteriscos del tamaño que se le
	 * indique por teclado
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		int tamañoFigura;

		// Inicialización
		System.out.println("Introduce un número impar:");
		tamañoFigura = Integer.parseInt(entrada.nextLine());

		// Resultado
		for (int i = 0; i < tamañoFigura; i++) {
			System.out.print("*");
		}

		System.out.println();

		for (int i = 0; i < tamañoFigura / 2 - 1; i++) {
			System.out.println("*");
		}

		for (int i = 0; i < tamañoFigura; i++) {
			System.out.print("*");
		}

		System.out.println();

		for (int i = 0; i < tamañoFigura / 2 - 1; i++) {
			System.out.printf("%" + tamañoFigura + "s\n", "*");
		}

		for (int i = 0; i < tamañoFigura; i++) {
			System.out.print("*");
		}

		// Liberación del scanner
		entrada.close();
	}

}
