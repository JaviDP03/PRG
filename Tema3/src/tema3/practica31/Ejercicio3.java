package tema3.practica31;

import java.util.Scanner;

public class Ejercicio3 {
	/**
	 * Escribe un programa que lea un número por teclado de 4 dígitos y muestre a la
	 * salida ese mismo número pero con sus dígitos invertidos
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		int numeroIntroducido;
		String numeroAlReves;

		// Inicialización
		System.out.println("Introduce un número de 4 cifras:");
		numeroIntroducido = Integer.parseInt(entrada.nextLine());

		// Resultado
		if (numeroIntroducido / 1000 > 0 && numeroIntroducido / 1000 < 10) {
			numeroAlReves = Integer.toString(numeroIntroducido);
			
			System.out.print(numeroAlReves.charAt(3));
			System.out.print(numeroAlReves.charAt(2));
			System.out.print(numeroAlReves.charAt(1));
			System.out.print(numeroAlReves.charAt(0));
		
		} else {
			System.out.println("El número no tiene 4 cifras");
		}

		// Liberación del scanner
		entrada.close();
	}

}
