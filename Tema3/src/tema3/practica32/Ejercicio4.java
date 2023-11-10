package tema3.practica32;

import java.util.Scanner;

public class Ejercicio4 {
	/**
	 * Escribe un programa que pida un número positivo por teclado de 8 cifras (que
	 * se dividirá en dos mitades), e indique a la salida cuántos de sus dígitos son
	 * coincidentes (son iguales y está en la misma posición)
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		int numeroIntroducido, numero1, numero2, cifra1, cifra2;

		// Inicialización
		System.out.println("Introduce un número de 8 cifras:");
		numeroIntroducido = Integer.parseInt(entrada.nextLine());

		numero1 = numeroIntroducido / 10000;
		numero2 = numeroIntroducido % 10000;

		// Resultado
		for (int i = 0; i < 4; i++) {
			cifra1 = numero1 % 10;
			cifra2 = numero2 % 10;

			if (cifra1 == cifra2) {
				System.out.println(cifra1);
			}

			numero1 /= 10;
			numero2 /= 10;
		}

		// Liberación del scanner
		entrada.close();

	}

}
