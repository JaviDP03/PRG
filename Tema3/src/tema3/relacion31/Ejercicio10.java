package tema3.relacion31;

import java.util.Scanner;

public class Ejercicio10 {

	/**
	 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de
	 * nacimiento.
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		double dia, mes;

		// Inicialización
		System.out.println("Introduce tu día de nacimiento:");
		dia = Double.parseDouble(entrada.nextLine());

		System.out.println("Introduce tu mes de nacimiento:");
		mes = Double.parseDouble(entrada.nextLine());

		// Resultado
		if (mes == 1) {
			if (dia <= 19) {
				System.out.println("Capricornio");
			} else {
				System.out.println("Acuario");
			}
		} else if (mes == 2) {
			if (dia <= 18) {
				System.out.println("Acuario");
			} else {
				System.out.println("Piscis");
			}
		} else if (mes == 3) {
			if (dia <= 20) {
				System.out.println("Piscis");
			} else {
				System.out.println("Aries");
			}
		} else if (mes == 4) {
			if (dia <= 19) {
				System.out.println("Aries");
			} else {
				System.out.println("Tauro");
			}
		} else if (mes == 5) {
			if (dia <= 20) {
				System.out.println("Tauro");
			} else {
				System.out.println("Géminis");
			}
		} else if (mes == 6) {
			if (dia <= 20) {
				System.out.println("Géminis");
			} else {
				System.out.println("Cáncer");
			}
		} else if (mes == 7) {
			if (dia <= 22) {
				System.out.println("Cáncer");
			} else {
				System.out.println("Leo");
			}
		} else if (mes == 8) {
			if (dia <= 22) {
				System.out.println("Leo");
			} else {
				System.out.println("Virgo");
			}
		} else if (mes == 9) {
			if (dia <= 22) {
				System.out.println("Virgo");
			} else {
				System.out.println("Libra");
			}
		} else if (mes == 10) {
			if (dia <= 22) {
				System.out.println("Libra");
			} else {
				System.out.println("Escorpio");
			}
		} else if (mes == 11) {
			if (dia <= 21) {
				System.out.println("Escorpio");
			} else {
				System.out.println("Sagitario");
			}
		} else if (mes == 12) {
			if (dia <= 21) {
				System.out.println("Sagitario");
			} else {
				System.out.println("Capricornio");
			}
		} else {
			System.out.println("El día o mes introducidos no son válidos");
		}

		// Liberación del scanner
		entrada.close();
	}

}