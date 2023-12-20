package tema5.pruebas;

import java.util.Scanner;

/**
 * Preguntar al usuario la nota de 10 alumnos Mostrar todas las notas por
 * pantalla Calcular y mostrar la media
 */
public class NotasAlumnos {

	public static void main(String[] args) {
		float[] notas = new float[10];
		Scanner entrada = new Scanner(System.in);
		float media = 0;

		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Introduce la nota del alumno %d (0-10):\n", i + 1);
			notas[i] = Float.parseFloat(entrada.nextLine());
		}

		for (float n : notas) {
			System.out.printf("%.2f\n", n);
			media += n;
		}

		media /= notas.length;

		System.out.printf("Media = %.2f", media);

		entrada.close();
	}

}
