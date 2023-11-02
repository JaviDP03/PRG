package tema3.relacion33;

import java.util.Scanner;

public class Ejercicio1 {
	/**
	 * Se pide un programa que pida inicialmente un número entero. Ese número
	 * indicará la cantidad de personas de las que queremos introducir nombre y DNI.
	 * Realiza un bucle for() para la entrada del total de esos datos personales,
	 * grabando los valores de cada persona en la misma variable que la anterior
	 * (por lo cual se pierden los datos anteriores, pero esto ahora no nos importa
	 * que suceda).
	 */

	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		int numeroPersonas;
		String nombre;
		String dni;

		// Inicialización
		System.out.println("Introduce el número de personas totales:");
		numeroPersonas = Integer.parseInt(entrada.nextLine());

		// Resultado
		for (int i = 0; i < numeroPersonas; i++) {
			System.out.println("Introduce el nombre:");
			nombre = entrada.nextLine();

			System.out.println("Introduce el DNI");
			dni = entrada.nextLine();

			System.out.printf("Nombre: %s\nDNI: %s\n\n", nombre, dni);
		}

		// Liberación del scanner
		entrada.close();
	}

}
