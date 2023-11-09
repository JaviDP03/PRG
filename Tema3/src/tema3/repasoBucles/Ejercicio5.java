package tema3.repasoBucles;

import java.util.Scanner;

public class Ejercicio5 {
	/**
	 * Pide un número por teclado e indica si es un número primo o no. Un número
	 * primo es aquel solo puede dividirse entre 1 y por sí mismo. Un buen truco
	 * para calcular la raíz cuadrada del numero e ir comprobando que si es
	 * divisible desde ese numero hasta 1.
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		int numeroIntroducido;
		boolean esPrimo;

		// Inicialización
		System.out.println("Introduce un número:");
		numeroIntroducido = Integer.parseInt(entrada.nextLine());
		
		esPrimo = true;

		// Resultado
		for (int i = 2; i < numeroIntroducido; i++) {
			if (numeroIntroducido % i == 0) {
				esPrimo = false;
			}
		}
		
		if (esPrimo) {
			System.out.println("Es primo");
		} else {
			System.out.println("No es primo");
		}

		// Liberación del scanner
		entrada.close();
	}

}
