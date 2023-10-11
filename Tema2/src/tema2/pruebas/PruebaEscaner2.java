package tema2.pruebas;

import java.util.Scanner;

public class PruebaEscaner2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce nombre y edad separados por un espacio: ");
		String nombre = s.next();
		int edad = s.nextInt();
		System.out.println("Tu nombre es " + nombre + " y tu edad es " + edad);
	}

}
