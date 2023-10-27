package tema3.pruebas;

import java.util.Scanner;

public class PruebaDoWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String palabra;

		do {
			System.out.println("Dime la palabra secreta:");
			palabra = entrada.nextLine();
		} while (!palabra.equalsIgnoreCase("DAW"));

		System.out.println("Correcto");

		entrada.close();
	}

}
