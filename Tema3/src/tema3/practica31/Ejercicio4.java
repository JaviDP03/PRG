package tema3.practica31;

import java.util.Scanner;

public class Ejercicio4 {
	/**
	 * Escribe un programa que pide un número por teclado e indique a la salida
	 * cuántos de sus dígitos son pares
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		int numeroIntroducido, contador;

		// Inicialización
		System.out.println("Introduce un número:");
		numeroIntroducido = Integer.parseInt(entrada.nextLine());

		contador = 0;

		// Resultado
		do {
			if ((numeroIntroducido % 10) % 2 == 0) {
				contador++;
			}

			numeroIntroducido /= 10;
		} while (numeroIntroducido != 0);
		
		System.out.println("Dígitos pares: " + contador);

		// Liberación del scanner
		entrada.close();
	}

}
