package tema3.relacion31;

import java.util.Scanner;

public class Ejercicio16 {

	/**
	 * Escribe un programa que diga cuál es la última cifra de un número entero
	 * introducido por teclado.
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		int numeroIntroducido;

		// Inicialización
		System.out.println("Introduce un número entero:");
		numeroIntroducido = Integer.parseInt(entrada.nextLine());

		// Resultado
		if (numeroIntroducido % 10 == 1) {
			System.out.println("La última cifra es uno");
		} else if (numeroIntroducido % 10 == 2) {
			System.out.println("La última cifra es dos");
		} else if (numeroIntroducido % 10 == 3) {
			System.out.println("La última cifra es tres");
		} else if (numeroIntroducido % 10 == 4) {
			System.out.println("La última cifra es cuatro");
		} else if (numeroIntroducido % 10 == 5) {
			System.out.println("La última cifra es cinco");
		} else if (numeroIntroducido % 10 == 6) {
			System.out.println("La última cifra es seis");
		} else if (numeroIntroducido % 10 == 7) {
			System.out.println("La última cifra es siete");
		} else if (numeroIntroducido % 10 == 8) {
			System.out.println("La última cifra es ocho");
		} else if (numeroIntroducido % 10 == 9) {
			System.out.println("La última cifra es nueve");
		} else {
			System.out.println("La última cifra es cero");
		}

		// Liberación del scanner
		entrada.close();
	}

}