package tema3.relacion34;

import java.util.Scanner;

public class Ejercicio1 {
	/**
	 * Leer un número y mostrar su cuadrado, repetir el proceso hasta que se
	 * introduzca un número negativo..
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		int numeroIntroducido;

		// Inicialización
		System.out.println("Introduce un número:");
		numeroIntroducido = Integer.parseInt(entrada.nextLine());

		// Resultado
		while (numeroIntroducido >= 0) {
			System.out.printf("%.0f\n", Math.pow(numeroIntroducido, 2));
			
			System.out.println("Introduce un número:");
			numeroIntroducido = Integer.parseInt(entrada.nextLine());
		}

		System.out.println("El número introducido es negativo");
		
		// Liberación del scanner
		entrada.close();
	}

}
