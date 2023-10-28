package tema3.relacion31;

import java.util.Scanner;

public class Ejercicio7y8 {
	/**
	 * Realiza un programa que calcule la media de tres notas. Amplía el programa
	 * anterior para que diga la nota del boletín (insuficiente, suficiente, bien,
	 * notable o sobresaliente).
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		double nota1, nota2, nota3;
		double media;

		// Inicialización
		System.out.println("Introduce la primera nota:");
		nota1 = Double.parseDouble(entrada.nextLine());

		System.out.println("Introduce la segunda nota:");
		nota2 = Double.parseDouble(entrada.nextLine());

		System.out.println("Introduce la tercera nota:");
		nota3 = Double.parseDouble(entrada.nextLine());

		// Resultado
		media = (nota1 + nota2 + nota3) / 3;
		
		if (media>=9) {
			System.out.printf("Sobresaliente. Tu media es: %.2f\n", media);
		} else if (media>=7) {
			System.out.printf("Notable. Tu media es: %.2f\n", media);
		} else if (media>=6) {
			System.out.printf("Bien. Tu media es: %.2f\n", media);
		} else if (media>=5) {
			System.out.printf("Suficiente. Tu media es: %.2f\n", media);
		} else {
			System.out.printf("Insuficiente. Tu media es: %.2f\n", media);
		}

		// Liberación del scanner
		entrada.close();
	}
}