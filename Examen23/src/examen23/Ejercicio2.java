package examen23;

import java.util.Scanner;

public class Ejercicio2 {
	/**
	 * Un programa que pida el tiempo que hace hoy. Se saldrá cuando hay tres días
	 * malos seguidos. Si hay una opción distinta no se cuenta.
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);

		int contadorDiasMalos;
		String tiempoHoy;

		// Inicialización
		contadorDiasMalos = 0;

		// Resultado
		do {
			System.out.println("¿Qué tiempo hace hoy? (bueno/nublado/frio/lluvia/nieve)");
			tiempoHoy = entrada.nextLine().toLowerCase();

			switch (tiempoHoy) {
			case "bueno":
				contadorDiasMalos = 0; // Si el tiempo es bueno se resetea el contador
				break;
			case "nublado":
			case "frio":
			case "lluvia":
			case "nieve":
				contadorDiasMalos++; // Si es malo aumenta
				break;
			default:
				System.out.println("Opción no válida"); // Con otra opción no ocurre nada, sólo imprime este mensaje
				break;
			}
		} while (contadorDiasMalos < 3); // Cuando el contador llegue al límite se sale

		System.out.println("¡Este tiempo es insoportable!");

		// Liberación del scanner
		entrada.close();
	}

}