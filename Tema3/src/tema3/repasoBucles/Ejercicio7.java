package tema3.repasoBucles;

import java.util.Scanner;

public class Ejercicio7 {
	/**
	 * Crea una aplicación que dibuje una escalera de números, siendo cada linea
	 * números empezando en uno y acabando en el numero de la linea.
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		int numeroLimite;

		// Inicialización
		System.out.println("Introduce un número:");
		numeroLimite = Integer.parseInt(entrada.nextLine());

		// Resultado
		for (int i = 1; i <= numeroLimite; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}

		// Liberación del scanner
		entrada.close();
	}

}
