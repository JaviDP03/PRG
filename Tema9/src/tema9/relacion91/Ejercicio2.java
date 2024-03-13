package tema9.relacion91;

import java.util.ArrayList;
import java.util.List;

/**
 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de
 * esos números. El tamaño de la lista también será aleatorio y podrá oscilar
 * entre 10 y 20 elementos ambos inclusive.
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		List<Integer> listaNumeros = new ArrayList<>();
		int tamañoLista = (int) (Math.random() * 10) + 10;
		int sumaNumeros = 0;
		int mediaNumeros = 0;
		int numeroMaximo = 0;
		int numeroMinimo = 101;

		for (int i = 0; i < tamañoLista; i++) {
			listaNumeros.add((int) (Math.random() * 100));
		}

		System.out.print("Números de la lista: [ ");
		for (Integer numero : listaNumeros) {
			sumaNumeros += numero;

			if (numero > numeroMaximo) {
				numeroMaximo = numero;
			}

			if (numero < numeroMinimo) {
				numeroMinimo = numero;
			}
			
			System.out.print(numero + " ");
		}
		System.out.println("]");

		mediaNumeros = sumaNumeros / listaNumeros.size();
		
		System.out.println("La suma de todos los números es: " + sumaNumeros);
		System.out.println("La media de todos los números es: " + mediaNumeros);
		System.out.println("El máximo de todos los números es: " + numeroMaximo);
		System.out.println("El mínimo de todos los números es: " + numeroMinimo);
	}

}
