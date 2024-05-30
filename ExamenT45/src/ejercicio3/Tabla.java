package ejercicio3;

import java.util.Scanner;

public class Tabla {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// Creación del array
		System.out.println("Introduce la anchura de la tabla:");
		int anchura = Integer.parseInt(entrada.nextLine());
		System.out.println("Introduce la altura de la tabla:");
		int altura = Integer.parseInt(entrada.nextLine());

		int[][] tablaNumeros = new int[altura][anchura];

		// Inicialización
		for (int i = 0; i < tablaNumeros.length; i++) {
			for (int j = 0; j < tablaNumeros[0].length; j++) {
				tablaNumeros[i][j] = (int) (Math.random() * 9);
			}
		}

		// Suma columna derecha
		int suma = 0;
		for (int i = 0; i < tablaNumeros.length; i++) {
			for (int j = 0; j < tablaNumeros[0].length - 1; j++) {
				suma += tablaNumeros[i][j];
			}

			tablaNumeros[i][tablaNumeros[0].length - 1] = suma;
			suma = 0;
		}

		// Suma fila de abajo
		for (int i = 0; i < tablaNumeros[0].length; i++) {
			for (int j = 0; j < tablaNumeros.length - 1; j++) {
				suma += tablaNumeros[j][i];
			}

			tablaNumeros[tablaNumeros.length - 1][i] = suma;
			suma = 0;
		}

		// Mostrar array
		for (int i = 0; i < tablaNumeros.length; i++) {
			for (int j = 0; j < tablaNumeros[0].length; j++) {
				System.out.printf("%-6d", tablaNumeros[i][j]);
			}
			System.out.println();
		}

		entrada.close();
	}

}
