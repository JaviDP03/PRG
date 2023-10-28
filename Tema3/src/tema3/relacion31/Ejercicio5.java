package tema3.relacion31;

import java.util.Scanner;

public class Ejercicio5 {

	/**
	 * Escribe un programa que calcule el salario semanal de un trabajador teniendo
	 * en cuenta que las horas ordinarias (40 primeras horas de trabajo) se pagan a
	 * 12 euros la hora. A partir de la hora 41, se pagan a 16 euros la hora.
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		int horasTrabajadas;

		// Inicialización
		System.out.println("¿Cuántas horas has trabajado esta semana?:");
		horasTrabajadas = Integer.parseInt(entrada.nextLine());

		// Resultado
		if (horasTrabajadas <= 40) {
			System.out.printf("Salario semanal: %d€\n", horasTrabajadas * 12);
		} else {
			System.out.printf("Salario semanal: %d€\n", 40 * 12 + (horasTrabajadas - 40) * 16);
		}

		// Liberación del scanner
		entrada.close();
	}

}