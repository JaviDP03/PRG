package tema3.relacion33;

import java.util.Scanner;

public class Ejercicio6 {
	/**
	 * Escribe un programa que pida una base y un exponente (entero positivo) y que
	 * calcule la potencia. Realiza el cálculo con un bucle for() donde el número de
	 * iteraciones sea el valor del exponente. En cada vuelta puedes usar el
	 * operador *= para ir almacenando el cálculo hasta ese momento.
	 */

	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		int base, exponente;

		// Inicialización
		System.out.println("Introduce el número base:");
		base = Integer.parseInt(entrada.nextLine());

		System.out.println("Introduce el número exponente:");
		exponente = Integer.parseInt(entrada.nextLine());

		final int BASE_COPIA = base; // constante creada para no perder el valor inicial de la base

		// Resultado
		for (int i = 1; i < exponente; i++) {
			base *= BASE_COPIA;
		}

		System.out.println(base);

		// Liberación del scanner
		entrada.close();
	}

}
