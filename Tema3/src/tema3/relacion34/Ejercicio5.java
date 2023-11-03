package tema3.relacion34;

import java.util.Scanner;

public class Ejercicio5 {
	/**
	 * Pedir números al usuario y cuando el usuario meta un -1 se terminará el
	 * programa. Al terminar, mostrará lo siguiente:
	 * – Mayor numero introducido
	 * – Menor número introducido
	 * – Suma de todos los números
	 * – Suma de los números positivos
	 * – Suma de los números negativos
	 * – Media de la suma de todos los números
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		int numeroIntroducido, numeroMayor = 0, numeroMenor = 0, contador = 0;
		double sumaTotal = 0, sumaPositivos = 0, sumaNegativos = 0;

		// Resultado
		do {
			System.out.println("Introduce un número:");
			numeroIntroducido = Integer.parseInt(entrada.nextLine());
			
			if (numeroIntroducido != -1) {
				if (numeroIntroducido > numeroMayor) {
					numeroMayor = numeroIntroducido;
				}
				
				if (numeroIntroducido < numeroMenor) {
					numeroMenor = numeroIntroducido;
				}
				
				if (numeroIntroducido > 0) {
					sumaPositivos += numeroIntroducido;
				} else if (numeroIntroducido < 0) {
					sumaNegativos += numeroIntroducido;
				}
				
				sumaTotal += numeroIntroducido;
				contador++;				
			}
			
		} while (numeroIntroducido != -1);
		
		System.out.println("Número mayor: " + numeroMayor);
		System.out.println("Número menor: " + numeroMenor);
		System.out.println("Suma total: " + sumaTotal);
		System.out.println("Suma de los positivos: " + sumaPositivos);
		System.out.println("Suma de los negativos: " + sumaNegativos);
		System.out.println("Media de la suma total: " + sumaTotal / contador);

		// Liberación del scanner
		entrada.close();
	}

}
