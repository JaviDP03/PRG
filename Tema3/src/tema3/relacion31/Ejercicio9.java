package tema3.relacion31;

import java.util.Scanner;

public class Ejercicio9 {

	/**
	 * Crea un programa que resuelva una ecuación de segundo grado (del tipo ax2 +
	 * bx + c = 0).
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		double valorA, valorB, valorC, operacion;

		// Inicialización
		System.out.println("Introduce el valor de a:");
		valorA = Double.parseDouble(entrada.nextLine());

		System.out.println("Introduce el valor de b:");
		valorB = Double.parseDouble(entrada.nextLine());

		System.out.println("Introduce el valor de c:");
		valorC = Double.parseDouble(entrada.nextLine());

		// Resultado
		if (valorA == 0) {
			System.out.println("No tiene solución");
		} else {
			operacion = Math.pow(valorB, 2) - 4 * valorA * valorC;

			if (operacion < 0) {
				System.out.println("No tiene solución");
			} else if (operacion == 0) {
				System.out.printf("x = %f\n", -valorB / 2 * valorA);
			} else {
				System.out.printf("x = %f\n", (-valorB + Math.sqrt(operacion)) / (2 * valorA));
				System.out.printf("x = %f\n", (-valorB - Math.sqrt(operacion)) / (2 * valorA));
			}
		}

		// Liberación del scanner
		entrada.close();
	}

}