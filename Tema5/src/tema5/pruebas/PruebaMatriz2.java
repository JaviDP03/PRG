package tema5.pruebas;

public class PruebaMatriz2 {

	public static void main(String[] args) {
		// notas[alumno][asignatura]
		// 0 --> Programación
		// 1 --> BB.DD.
		double[][] notas = { { 3, 1 }, { 9, 3 }, { 7, 7 }, { 5, 8 }, { 6, 6 } };

		// Imprimir notas
		System.out.printf("%13s %7s\n", "PRG", "BBDD");
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Alumno%d", i + 1);
			for (int j = 0; j < notas[0].length; j++) {
				System.out.printf("%7.2f", notas[i][j]);
			}
			System.out.println();
		}
	}

}
