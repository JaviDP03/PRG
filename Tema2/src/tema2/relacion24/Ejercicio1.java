package tema2.relacion24;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
//		Realiza un programa que pida dos números y que luego muestre el resultado de su multiplicación.
		
		Scanner entrada = new Scanner(System.in);
		int numero1;
		int numero2;
		
		System.out.println("Dime el primer número:");
		numero1 = entrada.nextInt();
		
		System.out.println("Dime el segundo número:");
		numero2 = entrada.nextInt();
		
		System.out.println("El resultado de la multiplicación es: " + numero1 * numero2);
		
		entrada.close();
	}

}
