package tema2.relacion24;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
//		Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere convertir debe ser introducida por teclado.
		
		Scanner entrada = new Scanner(System.in);
		double euros;
		
		System.out.println("Euros a cambiar:");
		euros = entrada.nextDouble();
		
		System.out.printf("%.2f euros son %.2f pesetas.", euros, euros*166.3860);
		
		entrada.close();

	}

}
