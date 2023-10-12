package tema2.relacion24;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
//		Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere convertir debe ser introducida por teclado.
		
		Scanner entrada = new Scanner(System.in);
		double pesetas;
		
		System.out.println("Pesetas a cambiar:");
		pesetas = entrada.nextDouble();
		
		System.out.printf("%.2f pesetas son %.2f euros.", pesetas, pesetas*0.0060);
		
		entrada.close();
	}

}
