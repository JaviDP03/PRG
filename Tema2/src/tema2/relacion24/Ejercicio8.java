package tema2.relacion24;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
//		Escribe un programa que calcule el salario semanal de un empleado en base a las horas trabajadas, a razón de 12 euros la hora.
		
		Scanner entrada = new Scanner(System.in);
		int horasDiarias;
		
		System.out.println("Introduce las horas trabajadas en el día:");
		horasDiarias = entrada.nextInt();
		
		System.out.println("Salario semanal (sin Sábado y Domingo): " + (horasDiarias*12*5) + " euros.");
			
		entrada.close();
	}

}
