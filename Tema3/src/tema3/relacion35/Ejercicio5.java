package tema3.relacion35;

import java.util.Scanner;

public class Ejercicio5 {
	/**
	 * Construir un programa que juegue con el usuario a PIEDRA, PAPEL y TIJERA
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		String eleccionUsuario;
		int eleccionMaquina;

		// Inicialización
		System.out.println("Introduce PIEDRA, PAPEL o TIJERA:");
		eleccionUsuario = entrada.nextLine();

		eleccionMaquina = (int) (Math.random() * 3 + 1);

		// Resultado
		switch (eleccionMaquina) {
		case 1:
			System.out.println("PIEDRA");

			if (eleccionUsuario.equalsIgnoreCase("PAPEL")) {
				System.out.println("Has ganado");
			} else if (eleccionUsuario.equalsIgnoreCase("TIJERA")) {
				System.out.println("Has perdido");
			} else {
				System.out.println("Empate");
			}
			break;
		case 2:
			System.out.println("PAPEL");

			if (eleccionUsuario.equalsIgnoreCase("TIJERA")) {
				System.out.println("Has ganado");
			} else if (eleccionUsuario.equalsIgnoreCase("PIEDRA")) {
				System.out.println("Has perdido");
			} else {
				System.out.println("Empate");
			}
			break;

		case 3:
			System.out.println("TIJERA");

			if (eleccionUsuario.equalsIgnoreCase("PIEDRA")) {
				System.out.println("Has ganado");
			} else if (eleccionUsuario.equalsIgnoreCase("PAPEL")) {
				System.out.println("Has perdido");
			} else {
				System.out.println("Empate");
			}
			break;
		}

		// Liberación del scanner
		entrada.close();

	}

}
