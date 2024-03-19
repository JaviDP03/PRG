package tema9.relacion91;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Realiza un programa equivalente al anterior pero en esta ocasión, el programa
 * debe ordenar palabras en lugar de números
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		List<String> listaPalabras = new ArrayList<>();
		
		System.out.println("Introduce 10 palabras:");
		for (int i = 0; i < 10; i++) {
			listaPalabras.add(entrada.nextLine());
		}

		Collections.sort(listaPalabras);

		System.out.println("\nPalabras ordenadas:");
		for (String palabra : listaPalabras) {
			System.out.println(palabra);
		}

		entrada.close();
	}

}
