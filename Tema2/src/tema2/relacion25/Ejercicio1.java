package tema2.relacion25;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
//		Crea un programa que pida por teclado el nombre de una persona y su día de nacimiento, dado por día, mes y año (4 cifras) 
//		separados por espacios en blanco.

		Scanner entrada = new Scanner(System.in);
		String nombre;
		int dia, mes, año;

		System.out.println("Dime tu nombre:");
		nombre = entrada.nextLine();

		System.out.println("Dime tu fecha de nacimiento (dd mm aaaa):");
		dia = entrada.nextInt();
		mes = entrada.nextInt();
		año = entrada.nextInt();

		System.out.printf("Te llamas %s y naciste el %02d-%02d-%d.", nombre, dia, mes, año);

		entrada.close();
	}

}
