package tema2.relacion24;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
//		Realiza un conversor de Kb a Mb.
		
		Scanner entrada = new Scanner(System.in);
		int kilobits;
		
		System.out.println("Introduce el valor en kilobits:");
		kilobits = entrada.nextInt();
		
		System.out.println(kilobits + " kilobits son " + kilobits/1000 + " megabits.");
			
		entrada.close();
	}

}
