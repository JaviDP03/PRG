package tema5.relacion52;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int tamañoArray;
		int contador = 1;
		boolean entreDosNumeros;

		System.out.println("Introduce un número:");
		tamañoArray = Integer.parseInt(entrada.nextLine());

		do {
			if (tamañoArray == contador) {
				entreDosNumeros = true;
				break;
			} else {
				entreDosNumeros = false;
			}

			contador++;
		} while (contador <= 100);

		if (entreDosNumeros) {
			String[] grupoPalabras = new String[tamañoArray];

			for (String string : grupoPalabras) {
				System.out.println(string);
			}

			System.out.println("Introduce un valor de índice del array:");
			int numeroIndice = Integer.parseInt(entrada.nextLine());

			contador = 1;
			do {
				if (numeroIndice == contador) {
					entreDosNumeros = true;
					break;
				} else {
					entreDosNumeros = false;
				}

				contador++;
			} while (contador < grupoPalabras.length);

			if (entreDosNumeros) {
				System.out.println("Introduce texto para el array:");
				String texto1 = entrada.nextLine();

				grupoPalabras[numeroIndice] = texto1;

				int contador2 = 1;
				for (String string : grupoPalabras) {
					System.out.print(string + " ");
					if (contador2 % 5 == 0) {
						System.out.println();
					}

					contador2++;
				}
			} else {
				System.out.println("El número de índice no está entre 0 y 99");
			}

		} else {
			System.out.println("El número no está entre 0 y 100");
		}

		entrada.close();
	}

}
