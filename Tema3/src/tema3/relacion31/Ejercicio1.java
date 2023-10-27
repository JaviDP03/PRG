package tema3.relacion31;

import java.util.Scanner;

public class Ejercicio1 {

	/**
	 * Crea un programa en Java que pida por teclado la capital del país Tuvalu
	 * (este país es el que tiene asignado el dominio de Internet .tv). El programa
	 * tiene que mostrar “Has acertado” o “No es correcto” en función de la
	 * respuesta dada.
	 */
	public static void main(String[] args) {
		//Introducción de variables
		Scanner entrada = new Scanner(System.in);
		String capital;
		
		//Inicialización
		System.out.println("¿Cuál es la capital de Tuvalu?:");
		capital = entrada.nextLine();
		
		//Resultado
		if (capital.equalsIgnoreCase("Funafuti")) {
			System.out.println("Has acertado");
		} else {
			System.out.println("No es correcto");
		}
		
		//Liberación del scanner
		entrada.close();
	}

}
