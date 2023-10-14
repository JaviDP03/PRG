package tema2.relacion24;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
//		Realiza un conversor de Mb a Kb.
		
		Scanner entrada = new Scanner(System.in);
		int megabits;
		
		System.out.println("Introduce el valor en megabits:");
		megabits = entrada.nextInt();
		
		System.out.println(megabits + " megabits son " + megabits*1000 + " kilobits.");
			
		entrada.close();
	}

}
