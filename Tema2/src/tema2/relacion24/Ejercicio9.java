package tema2.relacion24;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
//		Escribe un programa que calcule el volumen de un cono según la fórmula V = ⅓ π r2h
		
		Scanner entrada = new Scanner(System.in);
		double radio;
		double altura;
		
		System.out.println("Introduce el radio (cm):");
		radio = entrada.nextDouble();
		
		System.out.println("Introduce la altura (cm):");
		altura = entrada.nextDouble();
		
		System.out.println("Volumen del cono: " + (1d/3d*Math.PI*Math.pow(radio, 2)*altura));
		entrada.close();
	}

}
