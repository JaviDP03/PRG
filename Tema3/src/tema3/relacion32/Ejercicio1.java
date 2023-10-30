package tema3.relacion32;

import java.util.Scanner;

public class Ejercicio1 {
	/**
	 * Escribe un programa que pida por teclado un día de la semana y que diga qué
	 * módulo/asignatura toca a primera hora ese día.
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		String diaSemana;

		// Inicialización
		System.out.println("¿Qué día de la semana es?:");
		diaSemana = entrada.nextLine().toLowerCase();

		// Resultado
		switch (diaSemana) {
		case "lunes":
			System.out.println("Toca Lenguaje de Marcas a primera hora");
			break;
		case "martes":
			System.out.println("Toca Programación a primera hora");
			break;
		case "miercoles":
			System.out.println("Toca Bases de Datos a primera hora");
			break;
		case "jueves":
			System.out.println("Toca Bases de Datos a primera hora");
			break;
		case "viernes":
			System.out.println("Toca Entornos de desarrollo a primera hora");
			break;
		default:
			System.out.println("No hay nada este día");
			break;
		}

		// Liberación del scanner
		entrada.close();
	}

}
