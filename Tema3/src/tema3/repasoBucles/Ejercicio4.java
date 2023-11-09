package tema3.repasoBucles;

import java.util.Scanner;

public class Ejercicio4 {
	/**
	 * Escribe una aplicación con un String que contenga una contraseña cualquiera.
	 * Después se le pedirá al usuario que introduzca la contraseña, que deberá
	 * acertarla en 3 intentos como máximo. Cuando acierte, ya no pedirá mas la
	 * contraseña y mostrara un mensaje diciendo "Enhorabuena". En caso contrario,
	 * terminará el programa con el mensaje de "Acceso denegado"
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		String contraseña, contraseñaIntroducida;
		int contador;

		// Inicialización
		contraseña = "Java1234";
		contador = 3;

		// Resultado
		do {
			System.out.println("Introduce la contraseña: ");
			contraseñaIntroducida = entrada.nextLine();

			if (contraseñaIntroducida.equals(contraseña)) {
				break;
			}

			contador--;

			System.out.println("Te quedan " + contador + " intentos");
		} while (contador > 0);

		if (contador == 0) {
			System.out.println("Acceso denegado");
		} else {
			System.out.println("Enhorabuena");
		}

		// Liberación del scanner
		entrada.close();
	}

}
