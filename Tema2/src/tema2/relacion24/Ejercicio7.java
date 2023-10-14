package tema2.relacion24;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
//		Escribe un programa que calcule el total (base + IVA) de una factura a partir de la base imponible.
		
		Scanner entrada = new Scanner(System.in);
		double subtotal;
		
		System.out.println("Introduce el subtotal (sin IVA):");
		subtotal = entrada.nextDouble();
			
		System.out.printf("Total (con IVA): %.2f euros", subtotal+subtotal*0.21);
		entrada.close();
	}

}
