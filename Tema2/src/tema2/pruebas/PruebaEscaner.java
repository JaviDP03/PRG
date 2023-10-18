package tema2.pruebas;

import java.util.Scanner;

//Esto es una prueba de entrada por teclado
public class PruebaEscaner {

	public static void main(String[] args) {
		//Introducción de datos
		Scanner teclado = new Scanner(System.in);
		String unNombre;
		int unaEdad;
		double unaEstatura;
		
		//Procesamiento de datos
		//(No hacemos ningún cálculo en realidad)
		
		//Obtención de resultados
		System.out.println("Dime tu nombre:");
		unNombre = teclado.nextLine();
		
		System.out.println("Dime tu edad:");
		unaEdad = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Dime tu estatura:");
		unaEstatura = Double.parseDouble(teclado.nextLine());
		
		System.out.printf("¡Hola %s! Tienes %d años y mides %.2f metros.", unNombre, unaEdad, unaEstatura);
		
		teclado.close();
	}

}
