package tema3.repasoBucles;

import java.util.Scanner;

public class Ejercicio3 {
	/**
	 * Realiza una aplicación que nos pida un número de ventas a introducir, después
	 * nos pedirá tantas ventas por teclado como número de ventas se hayan indicado.
	 * Al final mostrara la suma de todas las ventas.
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		int numeroVentas;
		double precioVenta, siguienteVenta;

		// Inicialización
		System.out.println("Introduce el número de ventas:");
		numeroVentas = Integer.parseInt(entrada.nextLine());

		// Resultado
		if (numeroVentas != 0) {

			System.out.println("Introduce el precio de una venta:");
			precioVenta = Double.parseDouble(entrada.nextLine());

			for (int i = 1; i < numeroVentas; i++) {
				System.out.println("Introduce el precio de una venta:");
				siguienteVenta = Double.parseDouble(entrada.nextLine());

				precioVenta += siguienteVenta;
			}
			System.out.printf("La suma total de ventas es %.2f€\n", precioVenta);
		} else {
			System.out.println("No hay ventas");
		}

		// Liberación del scanner
		entrada.close();
	}

}
