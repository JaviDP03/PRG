package tema5.relacion53;

import java.util.Scanner;

/**
 * Define un array para poder grabar el horario de clase de tu curso. Solicita
 * al usuario un tramo horario y el nombre del módulo profesional del ciclo en
 * el que se imparte clase a esa hora.
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String[][] horario = new String[6][5];
		int tramoHorario;
		int diaSemana;

		System.out.println("Introduce un día:");
		diaSemana = Integer.parseInt(entrada.nextLine());

		System.out.println("Introduce un tramo horario:");
		tramoHorario = Integer.parseInt(entrada.nextLine());

		System.out.println("Introduce el módulo:");
		horario[tramoHorario][diaSemana] = entrada.nextLine();

		System.out.printf("%s%7s%10s%8s%10s%10s\n", "Tramo", "Lunes", "Martes", "Mierc", "Jueves", "Viernes");
		for (int i = 0; i < horario.length; i++) {
			System.out.print(i + 1 + " ");
			for (int j = 0; j < horario[0].length; j++) {
				System.out.printf("%9s", horario[i][j]);
			}
			System.out.println();
		}

		entrada.close();
	}

}
