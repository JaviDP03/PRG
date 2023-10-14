package tema2.relacion24;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
//		Escribe un programa que sume, reste, multiplique y divida dos números introducidos por teclado.
		
		Scanner entrada = new Scanner(System.in);
		double numero1;
		double numero2;
		
		System.out.println("Introduce el primer número:");
		numero1 = entrada.nextDouble();
		
		System.out.println("Introduce el segundo número:");
		numero2 = entrada.nextDouble();
		
		System.out.println("Suma: " + (numero1+numero2));
		System.out.println("Resta: " + (numero1-numero2));
		System.out.println("Multiplicación: " + (numero1*numero2));
		System.out.println("División: " + (numero1/numero2));
		entrada.close();
	}

}
