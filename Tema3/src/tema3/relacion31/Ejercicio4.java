package tema3.relacion31;

import java.util.Scanner;

public class Ejercicio4 {

	/**
	 * Escribe un programa en que dado un número del 1 a 7 escriba el
	 * correspondiente nombre del día de la semana.
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		int diaSemana;

		// Inicialización
		System.out.println("¿Qué día es? (1-7):");
		diaSemana = Integer.parseInt(entrada.nextLine());

		// Resultado
		if (diaSemana == 1) {
			System.out.println("Lunes");
		} else if (diaSemana == 2) {
			System.out.println("Martes");
		} else if (diaSemana == 3) {
			System.out.println("Miércoles");
		} else if (diaSemana == 4) {
			System.out.println("Jueves");
		} else if (diaSemana == 5) {
			System.out.println("Viernes");
		} else if (diaSemana == 6) {
			System.out.println("Sábado");
		} else if (diaSemana == 7) {
			System.out.println("Domingo");
		} else {
			System.out.println("No es un día válido");
		}

		// Liberación del scanner
		entrada.close();
	}

}