package tema3.relacion31;

import java.util.Scanner;

public class Ejercicio13 {

	/**
	 * Escribe un programa que ordene tres números enteros introducidos por teclado.
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		int numero1, numero2, numero3;

		// Inicialización
		System.out.println("Introduce el primer número:");
		numero1 = Integer.parseInt(entrada.nextLine());

		System.out.println("Introduce el segundo número:");
		numero2 = Integer.parseInt(entrada.nextLine());

		System.out.println("Introduce el tercer número:");
		numero3 = Integer.parseInt(entrada.nextLine());

		// Resultado
		if (numero1 <= numero2 && numero1 <= numero3) {
			System.out.print(numero1 + " < ");
			if (numero2 <= numero3) {
				System.out.println(numero2 + " < " + numero3);
			} else {
				System.out.println(numero3 + " < " + numero2);
			}
		} else if (numero2 <= numero1 && numero2 <= numero1) {
			System.out.print(numero2 + " < ");
			if (numero1 <= numero3) {
				System.out.println(numero1 + " < " + numero3);
			} else {
				System.out.println(numero3 + " < " + numero1);
			}
		} else if (numero3 <= numero1 && numero3 <= numero2) {
			System.out.print(numero3 + " < ");
			if (numero1 <= numero2) {
				System.out.println(numero1 + " < " + numero2);
			} else {
				System.out.println(numero2 + " < " + numero1);
			}
		}

		// Liberación del scanner
		entrada.close();
	}

}