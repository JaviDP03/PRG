package tema2.relacion24;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
//		Escribe un programa que calcule el área de un triángulo a partir de datos de entrada.
		
		Scanner entrada = new Scanner(System.in);
		double base;
		double altura;
		
		System.out.println("Introduce la base (cm):");
		base = entrada.nextDouble();
		
		System.out.println("Introduce la altura (cm):");
		altura = entrada.nextDouble();
		
		System.out.println("Área: " + (base*altura/2) + " cm.");
		entrada.close();
	}

}
