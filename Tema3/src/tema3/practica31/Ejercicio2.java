package tema3.practica31;

import java.util.Scanner;

public class Ejercicio2 {
	/**
	 * Escribe un programa que dibuje una cruz con asteriscos del tamaño que se le
	 * indique por teclado (debe ser un número impar)
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		int tamañoPiramide, margen;

		// Inicialización
		System.out.println("Introduce un número impar:");
		tamañoPiramide = Integer.parseInt(entrada.nextLine());

		margen = tamañoPiramide / 2 + 1;

		// Resultado
		if (tamañoPiramide % 2 != 0) {
			for (int i = 0; i < tamañoPiramide / 2; i++) {
				System.out.printf("%" + margen + "s\n", "*");
			}

			for (int i = 0; i < tamañoPiramide; i++) {
				System.out.print("*");
			}
			System.out.print("\n");

			for (int i = 0; i < tamañoPiramide / 2; i++) {
				System.out.printf("%" + margen + "s\n", "*");
			}
			
		} else {
			System.out.println("El número introducido es par");;
		}

		// Liberación del scanner
		entrada.close();
	}

}
