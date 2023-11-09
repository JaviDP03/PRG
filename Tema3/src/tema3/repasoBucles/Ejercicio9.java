package tema3.repasoBucles;

import java.util.Scanner;

public class Ejercicio9 {
	/**
	 * Leer por teclado un número entero N no negativo y mostrar el factorial de
	 * todos los números desde 0 hasta N
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		int numeroIntroducido, numeroMultiplicar;

		// Inicialización
		System.out.println("Introduce un número positivo:");
		numeroIntroducido = Integer.parseInt(entrada.nextLine());

		// Resultado
		if (numeroIntroducido < 0) {
			System.out.println("El número introducido es negativo");
		} else {
			for (int i = 0; i <= numeroIntroducido; i++) {
				System.out.print(i + "! = ");
				
				numeroMultiplicar = i;
				
				for (int j = 1; j < i; j++) {
					numeroMultiplicar *= j;
				}
				
				System.out.println(numeroMultiplicar);
			}
		}

		// Liberación del scanner
		entrada.close();
	}

}
