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
		System.out.println(numeroIntroducido % 10);

		// Liberación del scanner
		entrada.close();
	}

}