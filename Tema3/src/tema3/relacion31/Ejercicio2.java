package tema3.relacion31;

import java.util.Scanner;

public class Ejercicio2 {

	/**
	 * Escribe un programa que pida por teclado un día de la semana y que diga qué
	 * módulo/asignatura toca a primera hora ese día.
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		String diaSemana;

		// Inicialización
		System.out.println("¿Que día de la semana es?:");
		diaSemana = entrada.nextLine();

		// Resultado
		if (diaSemana.equalsIgnoreCase("Lunes")) {
			System.out.println("Toca Lenguaje de Marcas a primera hora");
		} else if (diaSemana.equalsIgnoreCase("Martes")) {
			System.out.println("Toca Programación a primera hora");
		} else if (diaSemana.equalsIgnoreCase("Miercoles")) {
			System.out.println("Toca Bases de Datos a primera hora");
		} else if (diaSemana.equalsIgnoreCase("Jueves")) {
			System.out.println("Toca Bases de Datos a primera hora");
		} else if (diaSemana.equalsIgnoreCase("Viernes")) {
			System.out.println("Toca Entornos de desarrollo a primera hora");
		} else {
			System.out.println("No hay nada este día");
		}

		// Liberación del scanner
		entrada.close();
	}

}
