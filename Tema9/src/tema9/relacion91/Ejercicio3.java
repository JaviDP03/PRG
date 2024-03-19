package tema9.relacion91;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Escribe un programa que ordene 10 números enteros introducidos por teclado y
 * almacenados en un objeto de la clase ArrayList.
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		List<Integer> listaNumeros = new ArrayList<>();

		System.out.println("Introduce 10 números separados por un espacio:");
		for (int i = 0; i < 10; i++) {
			listaNumeros.add(entrada.nextInt());
		}

		listaNumeros.sort(null);

		System.out.println("\nNúmeros ordenados:");
		for (Integer numero : listaNumeros) {
			System.out.println(numero);
		}

		entrada.close();
	}

}
