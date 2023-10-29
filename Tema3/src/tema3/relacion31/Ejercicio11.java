package tema3.relacion31;

import java.util.Scanner;

public class Ejercicio11 {

	/**
	 * Escribe un programa que dada una hora determinada (horas y minutos), calcule
	 * los segundos que faltan para llegar a la medianoche.
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		int horas, minutos, segundosHastaMedianoche;

		// Inicialización
		System.out.println("Introduce la hora actual (hh mm):");
		horas = entrada.nextInt();
		minutos = entrada.nextInt();

		// Cálculo
		segundosHastaMedianoche = (24 - horas) * 3600 + (-minutos) * 60;

		// Resultado
		System.out.printf("Faltan %d segundos para la medianoche\n", segundosHastaMedianoche);

		// Liberación del scanner
		entrada.close();
	}

}