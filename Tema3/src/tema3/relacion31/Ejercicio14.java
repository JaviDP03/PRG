package tema3.relacion31;

import java.util.Scanner;

public class Ejercicio14 {

	/**
	 * Realiza un programa que diga si un número introducido por teclado es par y/o
	 * divisible entre 5.
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		int numeroDivisible;

		// Inicialización
		System.out.println("Introduce un número:");
		numeroDivisible = Integer.parseInt(entrada.nextLine());

		// Resultado
		if (numeroDivisible % 2 == 0) {
			System.out.print(numeroDivisible + " es par ");
			if (numeroDivisible % 5 == 0) {
				System.out.println("y divisible entre 5");
			}
		} else if (numeroDivisible % 5 == 0) {
			System.out.println(numeroDivisible + " es divisible entre 5");
		} else {
			System.out.println(numeroDivisible + " no es par ni divisible entre 5");
		}

		// Liberación del scanner
		entrada.close();
	}

}
