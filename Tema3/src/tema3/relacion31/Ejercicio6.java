package tema3.relacion31;

import java.util.Scanner;

public class Ejercicio6 {

	/**
	 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b
	 * = 0).
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		double valorA, valorB;

		// Inicialización
		System.out.println("Introduce el valor de a:");
		valorA = Double.parseDouble(entrada.nextLine());

		System.out.println("Introduce el valor de b:");
		valorB = Double.parseDouble(entrada.nextLine());

		// Resultado
		if (valorA == 0) {
			System.out.println("No se puede resolver");
		} else {
			System.out.printf("x = %f\n", -valorB / valorA);
		}

		// Liberación del scanner
		entrada.close();
	}

}