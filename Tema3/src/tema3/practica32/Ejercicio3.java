package tema3.practica32;

import java.util.Scanner;

public class Ejercicio3 {
	/**
	 * Escribe un programa que lea un número por teclado de 4 dígitos y muestre a la
	 * salida ese mismo número pero con sus dígitos incrementados en 1
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		int numeroIntroducido, cifra1, cifra2, cifra3, cifra4;

		// Inicialización
		System.out.println("Introduce un número de 4 cifras:");
		numeroIntroducido = Integer.parseInt(entrada.nextLine());

		// Resultado
		if (numeroIntroducido / 1000 > 0 && numeroIntroducido / 1000 < 10) {
			cifra4 = numeroIntroducido % 10+1;
			cifra3 = (numeroIntroducido / 10) % 10+1;
			cifra2 = (numeroIntroducido / 100) % 10+1;
			cifra1 = numeroIntroducido / 1000+1;
			
			if (cifra1 > 9) {
				System.out.print(0);
			} else {
				System.out.print(cifra1);
			}
			
			if (cifra2 > 9) {
				System.out.print(0);
			} else {
				System.out.print(cifra2);
			}
			
			if (cifra3 > 9) {
				System.out.print(0);
			} else {
				System.out.print(cifra3);
			}
			
			if (cifra4 > 9) {
				System.out.print(0);
			} else {
				System.out.print(cifra4);
			}
		} else {
			System.out.println("El número no tiene 4 cifras");
		}
		

		// Liberación del scanner
		entrada.close();

	}

}
