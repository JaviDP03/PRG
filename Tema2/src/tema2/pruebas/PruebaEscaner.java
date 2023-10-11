package tema2.pruebas;

import java.util.Scanner;

public class PruebaEscaner {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String unNombre;
		int unaEdad;
		double unaEstatura;
		
		System.out.println("Dime tu nombre:");
		unNombre = teclado.nextLine();
		
		System.out.println("Dime tu edad:");
		unaEdad = teclado.nextInt();
		
		System.out.println("Dime tu estatura:");
		unaEstatura = teclado.nextDouble();
		
		System.out.printf("¡Hola %s! Tienes %d años y mides %.2f metros.", unNombre, unaEdad, unaEstatura);
		
		teclado.close();
	}

}
