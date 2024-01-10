package tema5.relacion53;

import java.util.Scanner;

/**
 * Amplia el ejercicio anterior para que en lugar de una evaluación sean 3
 * evaluaciones e igualmente pida el dato de la nota con el número de evaluación
 * (de 1 a 3).
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double[][] notasAlumnosEv1 = new double[20][6];
		double[][] notasAlumnosEv2 = new double[20][6];
		double[][] notasAlumnosEv3 = new double[20][6];
		int numeroAlumno;
		int numeroModulo;
		double nota;
		int evaluacion;

		do {
			System.out.println("1. 1ª Evaluación");
			System.out.println("2. 2ª Evaluación");
			System.out.println("3. 3ª Evaluación");
			System.out.println("0. Salir");
			evaluacion = Integer.parseInt(entrada.nextLine());

			switch (evaluacion) {
			case 1:
				System.out.println("Introduce el número de alumno (1-20):");
				numeroAlumno = Integer.parseInt(entrada.nextLine()) - 1;

				System.out.println("Introduce el número del módulo (1-6):");
				numeroModulo = Integer.parseInt(entrada.nextLine()) - 1;

				System.out.println("Introduce la nota (1-10):");
				nota = Double.parseDouble(entrada.nextLine());

				notasAlumnosEv1[numeroAlumno][numeroModulo] = nota;
				break;
			case 2:
				System.out.println("Introduce el número de alumno (1-20):");
				numeroAlumno = Integer.parseInt(entrada.nextLine()) - 1;

				System.out.println("Introduce el número del módulo (1-6):");
				numeroModulo = Integer.parseInt(entrada.nextLine()) - 1;

				System.out.println("Introduce la nota (1-10):");
				nota = Double.parseDouble(entrada.nextLine());

				notasAlumnosEv2[numeroAlumno][numeroModulo] = nota;
				break;
			case 3:
				System.out.println("Introduce el número de alumno (1-20):");
				numeroAlumno = Integer.parseInt(entrada.nextLine()) - 1;

				System.out.println("Introduce el número del módulo (1-6):");
				numeroModulo = Integer.parseInt(entrada.nextLine()) - 1;

				System.out.println("Introduce la nota (1-10):");
				nota = Double.parseDouble(entrada.nextLine());

				notasAlumnosEv3[numeroAlumno][numeroModulo] = nota;
				break;
			}

			System.out.println("1ª Evaluación");
			System.out.printf("%15s  %s  %s  %s  %s  %s\n", "Md1", "Md2", "Md3", "Md4", "Md5", "Md6");

			for (int i = 0; i < notasAlumnosEv1.length; i++) {
				System.out.printf("Alumno %d ", i + 1);
				if (i + 1 < 10) {
					System.out.print(" ");
				}
				for (int j = 0; j < notasAlumnosEv1[0].length; j++) {
					System.out.printf("%5.1f", notasAlumnosEv1[i][j]);
				}
				System.out.println();
			}

			System.out.println("\n");

			System.out.println("2ª Evaluación");
			System.out.printf("%15s  %s  %s  %s  %s  %s\n", "Md1", "Md2", "Md3", "Md4", "Md5", "Md6");

			for (int i = 0; i < notasAlumnosEv2.length; i++) {
				System.out.printf("Alumno %d ", i + 1);
				if (i + 1 < 10) {
					System.out.print(" ");
				}
				for (int j = 0; j < notasAlumnosEv2[0].length; j++) {
					System.out.printf("%5.1f", notasAlumnosEv2[i][j]);
				}
				System.out.println();
			}

			System.out.println("\n");

			System.out.println("3ª Evaluación");
			System.out.printf("%15s  %s  %s  %s  %s  %s\n", "Md1", "Md2", "Md3", "Md4", "Md5", "Md6");

			for (int i = 0; i < notasAlumnosEv3.length; i++) {
				System.out.printf("Alumno %d ", i + 1);
				if (i + 1 < 10) {
					System.out.print(" ");
				}
				for (int j = 0; j < notasAlumnosEv3[0].length; j++) {
					System.out.printf("%5.1f", notasAlumnosEv3[i][j]);
				}
				System.out.println();
			}

			System.out.println();
		} while (evaluacion != 0);

		entrada.close();
	}

}
