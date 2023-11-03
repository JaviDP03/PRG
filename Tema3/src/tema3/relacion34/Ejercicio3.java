package tema3.relacion34;

import java.util.Scanner;

public class Ejercicio3 {
	/**
	 * Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o
	 * impar.
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
			if (numeroIntroducido % 2 == 0) {
				System.out.println(numeroIntroducido + " es par");
			} else {
				System.out.println(numeroIntroducido + " es impar");
			}

			System.out.println("Introduce un número:");
			numeroIntroducido = Integer.parseInt(entrada.nextLine());
		}

		System.out.println("El número introducido es 0");

		// Liberación del scanner
		entrada.close();
	}

}
