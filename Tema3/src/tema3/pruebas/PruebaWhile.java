package tema3.pruebas;

import java.util.Scanner;

public class PruebaWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String palabra;
		
		System.out.println("Dime la palabra secreta:");
		palabra = entrada.nextLine();
		
		while (!palabra.equalsIgnoreCase("DAW")) {
			System.out.println("Incorrecto");
			
			System.out.println("Dime la palabra secreta:");
			palabra = entrada.nextLine();
		}
		
		System.out.println("Correcto");
		
		entrada.close();
	}

}
