package tema3.relacion34;

import java.util.Scanner;

public class Ejercicio2 {
	/**
	 * Leer un número e indicar si es positivo o negativo. El proceso se repetirá
	 * hasta que se introduzca un 0.
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		int numeroIntroducido;

		// Inicialización
		System.out.println("Introduce un número:");
		numeroIntroducido = Integer.parseInt(entrada.nextLine());

		// Resultado
		while (numeroIntroducido != 0) {
			if (numeroIntroducido > 0) {
				System.out.println(numeroIntroducido + " es positivo");
			}

			if (numeroIntroducido < 0) {
				System.out.println(numeroIntroducido + " es negativo");
			}

			System.out.println("Introduce un número:");
			numeroIntroducido = Integer.parseInt(entrada.nextLine());
		}
		
		System.out.println("El número introducido es 0");

		// Liberación del scanner
		entrada.close();
	}

}
