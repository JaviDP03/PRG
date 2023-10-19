package tema2.practicas;

import java.util.Scanner;

public class Practica21 {
	/**
	 * Contenido de la práctica
	 * Realizado por: Javier Duarte Pérez
	 */
	public static void main(String[] args) {
		// Variables
		Scanner entrada = new Scanner(System.in);
		int diaFecha1, mesFecha1, añoFecha1, diaFecha2, mesFecha2, añoFecha2;
		final double añoDias = 365.25; // valor para pasar de años a días
		final double mesDias = 30.4375; // valor para pasar de meses a días
		double totalDias;

		// Entrada por teclado
		System.out.println("Introduce la primera fecha (dd mm aaaa):");
		diaFecha1 = entrada.nextInt();
		mesFecha1 = entrada.nextInt();
		añoFecha1 = entrada.nextInt();

		System.out.println("Introduce la segunda fecha (dd mm aaaa):");
		diaFecha2 = entrada.nextInt();
		mesFecha2 = entrada.nextInt();
		añoFecha2 = entrada.nextInt();

		// Cálculo
		totalDias = diaFecha2 - diaFecha1 + mesDias * (mesFecha2 - mesFecha1) + añoDias * (añoFecha2 - añoFecha1);
		totalDias = (totalDias < 0) ? -totalDias : totalDias;
		totalDias = (int) totalDias;
		/*
		 * Además de calcular la diferencia de días, es muy importante verificar si es
		 * positivo o negativo, ya que la fecha 1 puede ser mayor que la fecha 2 o viceversa.
		 */

		// Resultado
		System.out.printf(
				"La primera fecha es %02d/%02d/%04d y la segunda fecha es %02d-%02d-%04d. La diferencia es de %.3f días.\n",
				diaFecha1, mesFecha1, añoFecha1, diaFecha2, mesFecha2, añoFecha2, totalDias);

		entrada.close();
	}

}
