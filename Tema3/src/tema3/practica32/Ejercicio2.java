package tema3.practica32;

import java.util.Scanner;

public class Ejercicio2 {
	/**
	 * Escribe un programa que dibuje una F con asteriscos del tamaño que se le
	 * indique por teclado (debe ser un número impar). Ten en cuenta que la anchura
	 * del trazo horizontal central debe ser la mitad del superior
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		int tamañoLetraF;

		// Inicialización
		System.out.println("Introduce el tamaño de la figura (número impar):");
		tamañoLetraF = Integer.parseInt(entrada.nextLine());

		// Resultado
		if (tamañoLetraF % 2 == 0) {
			System.out.println("El número introducido es par");
		} else {
			for (int i = 1; i < tamañoLetraF; i++) {
				System.out.print("*");
			}

			for (int i = 0; i < tamañoLetraF / 2; i++) {
				System.out.println("*");
			}

			for (int i = 0; i < tamañoLetraF / 2 + 1; i++) {
				System.out.print("*");
			}

			System.out.println();

			for (int i = 0; i < tamañoLetraF / 2; i++) {
				System.out.println("*");
			}
		}

		// Liberación del scanner
		entrada.close();

	}

}
