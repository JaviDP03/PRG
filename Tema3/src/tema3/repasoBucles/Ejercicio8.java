package tema3.repasoBucles;

import java.util.Scanner;

public class Ejercicio8 {
	/**
	 * Crea una aplicación que dibuje una pirámide de asteriscos. Nosotros le
	 * pasamos la altura de la pirámide por teclado.
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		int alturaPiramide, margen;

		// Inicialización
		System.out.println("Introduce un número:");
		alturaPiramide = Integer.parseInt(entrada.nextLine());

		margen = alturaPiramide;

		// Resultado
		for (int i = 1; i <= alturaPiramide; i++) {
			System.out.printf("%" + margen + "s", "");

			for (int j = 2; j <= i * 2; j++) {
				System.out.print("*");
			}

			System.out.println();

			margen--;
		}

		// Liberación del scanner
		entrada.close();
	}

}
