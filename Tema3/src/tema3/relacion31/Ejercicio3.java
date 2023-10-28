package tema3.relacion31;

import java.util.Scanner;

public class Ejercicio3 {

	/**
	 * Realiza un programa que pida una hora por teclado y que muestre luego buenos
	 * días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos
	 * de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta
	 * las horas, los minutos no se deben introducir por teclado.
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		int hora;

		// Inicialización
		System.out.println("¿Qué hora es?:");
		hora = Integer.parseInt(entrada.nextLine());

		// Resultado
		if (hora >= 6 && hora <= 12) {
			System.out.println("Buenos días");
		} else if (hora >= 13 && hora <= 20) {
			System.out.println("Buenas tardes");
		} else if ((hora >= 0 && hora <= 5) || (hora >= 21 && hora <= 24)) {
			System.out.println("Buenas noches");
		} else {
			System.out.println("No es una hora válida");
		}

		// Liberación del scanner
		entrada.close();
	}

}