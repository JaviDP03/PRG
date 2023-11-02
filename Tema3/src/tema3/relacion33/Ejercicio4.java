package tema3.relacion33;

import java.util.Scanner;

public class Ejercicio4 {
	/**
	 * Escribe un programa que calcule el factorial de un número entero leído por
	 * teclado. Hazlo con un bucle for() descendente acumulando el valor
	 * multiplicado hasta el momento en la misma variable.
	 */

	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		int numero, numeroFactorial;

		// Inicialización
		System.out.println("Introduce un número:");
		numero = Integer.parseInt(entrada.nextLine());

		numeroFactorial = numero;
		
		System.out.print(numero + "! = ");

		// Resultado
		for (int i = numero; i > 1; i--) {
			numeroFactorial = numeroFactorial * (i - 1);
			System.out.print(i + " x ");
		}
		
		System.out.println("1 = " + numeroFactorial);

		// Liberación del scanner
		entrada.close();
	}

}
