package tema3.relacion32;

import java.util.Scanner;

public class Ejercicio6 {
	/**
	 * Crea un programa que pida un número tipo byte y escriba “El número acaba en
	 * ____”, donde ____ es el texto que indica el dígito final. Para ello usa el
	 * operador % con el operando derecho 10. Por ejemplo, si se introduce 45 debe
	 * mostrar “El número acaba en cinco”.
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		byte numero;

		// Inicialización
		System.out.println("Introduce un número:");
		numero = Byte.parseByte(entrada.nextLine());

		// Resultado
		switch (numero % 10) {
		case 1:
			System.out.println("El número acaba en uno");
			break;
		case 2:
			System.out.println("El número acaba en dos");
			break;
		case 3:
			System.out.println("El número acaba en tres");
			break;
		case 4:
			System.out.println("El número acaba en cuatro");
			break;
		case 5:
			System.out.println("El número acaba en cinco");
			break;
		case 6:
			System.out.println("El número acaba en seis");
			break;
		case 7:
			System.out.println("El número acaba en siete");
			break;
		case 8:
			System.out.println("El número acaba en ocho");
			break;
		case 9:
			System.out.println("El número acaba en nueve");
			break;
		default:
			System.out.println("El número acaba en cero");
			break;
		}

		// Liberación del scanner
		entrada.close();
	}

}
