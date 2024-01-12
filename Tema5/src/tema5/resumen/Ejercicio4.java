package tema5.resumen;

import java.util.Scanner;

/**
 * Crea un array de 4 valores booleanos. Los valores iniciales los introducirá
 * el usuario desde teclado. Al final debe mostrarse esos valores con un bucle
 * for/in.
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Boolean[] elementosBooleanos = new Boolean[4];
		
		System.out.println("Introduce 4 valores booleanos (separados por un espacio):");
		elementosBooleanos[0] = entrada.nextBoolean();
		elementosBooleanos[1] = entrada.nextBoolean();
		elementosBooleanos[2] = entrada.nextBoolean();
		elementosBooleanos[3] = entrada.nextBoolean();
		
		for (Boolean boolean1 : elementosBooleanos) {
			System.out.println(boolean1);
		}
		
		entrada.close();
	}

}
