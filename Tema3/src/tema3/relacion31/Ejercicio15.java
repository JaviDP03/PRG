package tema3.relacion31;

import java.util.Scanner;

public class Ejercicio15 {

	/**
	 * Escribe un programa que pinte una pirámide rellena con un carácter
	 * introducido por teclado que podrá ser una letra, un número o un símbolo como
	 * *, +, -, $, &, etc. El programa debe permitir al usuario mediante un menú
	 * elegir si el vértice de la pirámide está apuntando hacia arriba, hacia abajo,
	 * hacia la izquierda o hacia la derecha.
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		char caracterPiramide;
		char direccionVertice;

		// Inicialización
		System.out.println("Introduce un carácter para hacer la pirámide:");
		caracterPiramide = entrada.nextLine().charAt(0);

		System.out.println("Elige la dirección del vértice de la pirámide:");
		System.out.println("a) Arriba\nb) Abajo\nc) Derecha\nd) Izquierda");
		direccionVertice = entrada.nextLine().charAt(0);

		// Resultado
		if (direccionVertice == 'a') {
			System.out.printf("%5s\n", caracterPiramide);
			System.out.printf("%4s%s%s\n", caracterPiramide, caracterPiramide, caracterPiramide);
			System.out.printf("%3s%s%s%s%s\n", caracterPiramide, caracterPiramide, caracterPiramide, caracterPiramide,
					caracterPiramide);
			System.out.printf("%2s%s%s%s%s%s%s\n", caracterPiramide, caracterPiramide, caracterPiramide,
					caracterPiramide, caracterPiramide, caracterPiramide, caracterPiramide);
			System.out.printf("%s%s%s%s%s%s%s%s%s\n", caracterPiramide, caracterPiramide, caracterPiramide,
					caracterPiramide, caracterPiramide, caracterPiramide, caracterPiramide, caracterPiramide,
					caracterPiramide);
		} else if (direccionVertice == 'b') {
			System.out.printf("%s%s%s%s%s%s%s%s%s\n", caracterPiramide, caracterPiramide, caracterPiramide,
					caracterPiramide, caracterPiramide, caracterPiramide, caracterPiramide, caracterPiramide,
					caracterPiramide);
			System.out.printf("%2s%s%s%s%s%s%s\n", caracterPiramide, caracterPiramide, caracterPiramide,
					caracterPiramide, caracterPiramide, caracterPiramide, caracterPiramide);
			System.out.printf("%3s%s%s%s%s\n", caracterPiramide, caracterPiramide, caracterPiramide, caracterPiramide,
					caracterPiramide);
			System.out.printf("%4s%s%s\n", caracterPiramide, caracterPiramide, caracterPiramide);
			System.out.printf("%5s\n", caracterPiramide);
		} else if (direccionVertice == 'c') {
			System.out.printf("%s\n", caracterPiramide);
			System.out.printf("%s%s\n", caracterPiramide, caracterPiramide);
			System.out.printf("%s%s%s\n", caracterPiramide, caracterPiramide, caracterPiramide);
			System.out.printf("%s%s%s%s\n", caracterPiramide, caracterPiramide, caracterPiramide, caracterPiramide);
			System.out.printf("%s%s%s%s%s\n", caracterPiramide, caracterPiramide, caracterPiramide, caracterPiramide,
					caracterPiramide);
			System.out.printf("%s%s%s%s\n", caracterPiramide, caracterPiramide, caracterPiramide, caracterPiramide);
			System.out.printf("%s%s%s\n", caracterPiramide, caracterPiramide, caracterPiramide);
			System.out.printf("%s%s\n", caracterPiramide, caracterPiramide);
			System.out.printf("%s\n", caracterPiramide);
		} else if (direccionVertice == 'd') {
			System.out.printf("%5s\n", caracterPiramide);
			System.out.printf("%4s%s\n", caracterPiramide, caracterPiramide);
			System.out.printf("%3s%s%s\n", caracterPiramide, caracterPiramide, caracterPiramide);
			System.out.printf("%2s%s%s%s\n", caracterPiramide, caracterPiramide, caracterPiramide, caracterPiramide);
			System.out.printf("%s%s%s%s%s\n", caracterPiramide, caracterPiramide, caracterPiramide, caracterPiramide,
					caracterPiramide);
			System.out.printf("%2s%s%s%s\n", caracterPiramide, caracterPiramide, caracterPiramide, caracterPiramide);
			System.out.printf("%3s%s%s\n", caracterPiramide, caracterPiramide, caracterPiramide);
			System.out.printf("%4s%s\n", caracterPiramide, caracterPiramide);
			System.out.printf("%5s\n", caracterPiramide);
		} else {
			System.out.println("No es una opción válida");
		}
		
		// Liberación del scanner
		entrada.close();
	}

}