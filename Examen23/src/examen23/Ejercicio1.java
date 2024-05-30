package examen23;

import java.util.Scanner;

public class Ejercicio1 {
	/**
	 * Un programa que pida tres números al usuario y diga si hay alguno repetido o
	 * son distintos. Luego decir cuál es más grande de los tres.
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
		// Comparamos los 3 números para ver cuál es mayor
		System.out.print("El número más grande es ");
		if (numero1 < numero2) {
			if (numero2 < numero3) {
				System.out.println(numero3);
			} else {
				System.out.println(numero2);
			}
		} else {
			if (numero1 < numero3) {
				System.out.println(numero3);
			} else {
				System.out.println(numero1);
			}
		}

		// Comprobamos si hay alguno igual o diferente
		if (numero1 == numero2) {
			System.out.println("El número " + numero1 + " se repite");
		} else if (numero1 == numero3) {
			System.out.println("El número " + numero1 + " se repite");
		} else if (numero2 == numero3) {
			System.out.println("El número " + numero2 + " se repite");
		} else {
			System.out.println("Son todos distintos");
		}

		// Liberación del scanner
		entrada.close();
	}

}
