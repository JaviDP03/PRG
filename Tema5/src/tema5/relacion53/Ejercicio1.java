package tema5.relacion53;

import java.util.Scanner;

/**
 * Un grupo de 20 alumnos están matriculados en un ciclo DAW que tiene 6 módulos
 * profesionales en primero. Se pide definir un array para almacenar las notas
 * de una evaluación para todos los alumnos. El programa debe ser capaz de pedir
 * un número de alumno de 1 a 20, un número de módulo de 1 a 6 y la nota
 * obtenida, que debe ser guardada directamente en la posición correcta del
 * array.
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double[][] notasAlumnos = new double[20][6];
		int numeroAlumno;
		int numeroModulo;
		double nota;

		System.out.println("Introduce el número de alumno (1-20):");
		numeroAlumno = Integer.parseInt(entrada.nextLine()) - 1;

		System.out.println("Introduce el número del módulo (1-6):");
		numeroModulo = Integer.parseInt(entrada.nextLine()) - 1;

		System.out.println("Introduce la nota (1-10):");
		nota = Double.parseDouble(entrada.nextLine());

		notasAlumnos[numeroAlumno][numeroModulo] = nota;

		System.out.printf("%15s  %s  %s  %s  %s  %s\n", "Md1", "Md2", "Md3", "Md4", "Md5", "Md6");

		for (int i = 0; i < notasAlumnos.length; i++) {
			System.out.printf("Alumno %d ", i + 1);
			if (i + 1 < 10) {
				System.out.print(" ");
			}
			for (int j = 0; j < notasAlumnos[0].length; j++) {
				System.out.printf("%5.1f", notasAlumnos[i][j]);
			}
			System.out.println();
		}

		entrada.close();
	}

}
