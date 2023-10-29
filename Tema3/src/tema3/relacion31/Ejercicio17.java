package tema3.relacion31;

import java.util.Scanner;

public class Ejercicio17 {

	/**
	 * Escribe un programa que diga cuál es la primera cifra de un número entero
	 * introducido por teclado. Se permiten números de hasta 5 cifras.
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
			System.out.println("La primera cifra es " + numeroIntroducido / 10000);
		} else if (numeroIntroducido / 1000 != 0) {
			System.out.println("La primera cifra es " + numeroIntroducido / 1000);
		} else if (numeroIntroducido / 100 != 0) {
			System.out.println("La primera cifra es " + numeroIntroducido / 100);
		} else if (numeroIntroducido / 10 != 0) {
			System.out.println("La primera cifra es " + numeroIntroducido / 10);
		} else {
			System.out.println("La primera cifra es " + numeroIntroducido);
		}

		// Liberación del scanner
		entrada.close();
	}

}