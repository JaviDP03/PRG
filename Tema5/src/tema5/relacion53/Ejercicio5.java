package tema5.relacion53;

import java.util.Scanner;

/**
 * En el .pdf de este tema se comenta que los píxeles de una imagen se pueden
 * grabar en un array bidimensional. Los colores de un píxel pueden ser una
 * combinación de los 3 colores básicos (Red Green Blue) que se definen cada uno
 * como de tipo byte. Diseña un array para una imagen de 800x600 que permita
 * almacenar los 3 colores RGB. Solicita al usuario un valor byte para un color
 * concreto de un píxel en una posición que previamente debe introducir el
 * usuario.
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[][] colorPixel = new int[800][600];
		int posicionX;
		int posicionY;
		
		System.out.println("Introduce una posicion de la pantalla (x y):");
		posicionX = entrada.nextInt();
		posicionY = entrada.nextInt();
		
		System.out.println("Introduce el color del pixel (RGB):");
		colorPixel[posicionX][posicionY] = entrada.nextInt();
		
		System.out.println("Color del pixel " + posicionX + "x" + posicionY);
		System.out.println(colorPixel[posicionX][posicionY]);
		
		entrada.close();
	}

}
