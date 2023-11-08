package tema3.relacion35;

import java.util.Scanner;

public class Ejercicio6 {
	/**
	 * Construye un programa que almacene un número de 1 a 100 generado
	 * aleatóriamente y juegue con el usuario a intentar acertarlo indicando “EL
	 * NÚMERO SECRETO ES MAYOR” o que sea menor
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		int numeroIntroducido, numeroSecreto;

		// Inicialización
		numeroSecreto = (int) (Math.random() * 100 + 1);

		System.out.println("Introduce un número (1-100):");
		numeroIntroducido = Integer.parseInt(entrada.nextLine());

		// Resultado
		while (numeroIntroducido != numeroSecreto) {
			if (numeroIntroducido < numeroSecreto) {
				System.out.println("El número secreto es mayor");
			} else {
				System.out.println("El número secreto es menor");
			}

			System.out.println("Introduce un número (1-100):");
			numeroIntroducido = Integer.parseInt(entrada.nextLine());
		}

		System.out.println("¡Has acertado!");

		// Liberación del scanner
		entrada.close();

	}

}
