package tema5.pruebas;

public class PruebaMatriz {

	public static void main(String[] args) {
		// notas[alumno][asignatura]
		// 0 --> Programación
		// 1 --> BB.DD.
		double[][] notas = new double[5][2];

		// Inicializar las notas de BB.DD.
		notas[0][1] = 1;
		notas[1][1] = 3;
		notas[2][1] = 7;
		notas[3][1] = 8;
		notas[4][1] = 6;

		// Inicializar las notas de Programación
		notas[0][0] = 3;
		notas[1][0] = 9;
		notas[2][0] = 7;
		notas[3][0] = 5;
		notas[4][0] = 6;

		// Imprimir notas
		System.out.printf("%13s %7s\n", "PRG", "BBDD");
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Alumno%d", i + 1);
			for (int j = 0; j < notas[0].length; j++) {
				System.out.printf("%7.2f", notas[i][j]);
			}
			System.out.println("");
		}
	}

}
