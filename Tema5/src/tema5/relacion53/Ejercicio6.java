package tema5.relacion53;

/**
 * Amplia el ejercicio 6 de la relación RESUMEN DE ARRAYS Y EJERCICIOS BÁSICOS
 * para que en lugar de 5 objetos de la clase Cubo se pueda definir una pirámide
 * de cubos de 1 litro con la base compuesta por 5x5 cubos, la segunda fila con
 * todo el contorno de cubos con 0 litros y el centro formado por 3x3 cubos y
 * tercer piso de cubos, donde sólo habrá un cubo central con 1 litro y el resto
 * con 0 litros.
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		Jarra[][][] piramide = new Jarra[3][5][5];

		// Planta 1
		for (int i = 0; i < piramide[0].length; i++) {
			for (int j = 0; j < piramide[0].length; j++) {
				piramide[0][i][j] = new Jarra(1);
				piramide[1][i][j] = new Jarra(1);
				piramide[2][i][j] = new Jarra(1);
				piramide[0][i][j].llenar();
			}
		}

		// Planta 2
		for (int i = 1; i <= piramide.length; i++) {
			for (int j = 1; j <= piramide.length; j++) {
				piramide[1][i][j].llenar();
			}
		}

		// Planta 3
		piramide[2][2][2].llenar();

		// Imprimir
		for (int i = 0; i < piramide.length; i++) {
			System.out.printf("Planta %d\n", i + 1);
			for (int j = 0; j < piramide[0].length; j++) {
				for (int j2 = 0; j2 < piramide[0][0].length; j2++) {
					System.out.print(piramide[i][j][j2]);
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
