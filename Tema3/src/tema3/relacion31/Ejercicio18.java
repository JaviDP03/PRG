package tema3.relacion31;

import java.util.Scanner;

public class Ejercicio18 {

	/**
	 * Realiza un programa que nos diga cuántos dígitos tiene un número entero que
	 * puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		int numeroIntroducido;

		// Inicialización
		System.out.println("Introduce un número entero:");
		numeroIntroducido = Integer.parseInt(entrada.nextLine());

		// Resultado
		if (numeroIntroducido / 100000 != 0) {
			System.out.println("El número tiene más de 5 cifras");
		} else if (numeroIntroducido / 10000 != 0) {
			System.out.println("El número tiene 5 cifras");
		} else if (numeroIntroducido / 1000 != 0) {
			System.out.println("El número tiene 4 cifras");
		} else if (numeroIntroducido / 100 != 0) {
			System.out.println("El número tiene 3 cifras");
		} else if (numeroIntroducido / 10 != 0) {
			System.out.println("El número tiene 2 cifras");
		} else {
			System.out.println("El número tiene 1 cifra");
		}

		// Liberación del scanner
		entrada.close();
	}

}