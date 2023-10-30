package tema3.relacion32;

import java.util.Scanner;

public class Ejercicio5 {
	/**
	 * Realiza un programa que pida dos números tipo byte y a continuación un
	 * carácter que podrá ser + ,- ,* o /. El programa hará la operación indicada
	 * con esos dos números, informando de que no es posible la división por cero
	 * cuando se dé esa circunstancia.
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		byte numero1;
		byte numero2;
		char signo;

		// Inicialización
		System.out.println("Introduce el primer número:");
		numero1 = Byte.parseByte(entrada.nextLine());

		System.out.println("Introduce el segundo número:");
		numero2 = Byte.parseByte(entrada.nextLine());

		System.out.println("Introduce el signo:");
		signo = entrada.nextLine().charAt(0);

		// Resultado
		switch (signo) {
		case '+':
			System.out.println(numero1 + numero2);
			break;
		case '-':
			System.out.println(numero1 - numero2);
			break;
		case '*':
			System.out.println(numero1 * numero2);
			break;
		case '/':
			switch (numero2) {
			case 0:
				System.out.println("No se puede dividir por 0");
				break;
			default:
				System.out.println(numero1 / numero2);
				break;
			}
			break;
		default:
			System.out.println("No se puede realizar la operación");
			break;
		}

		// Liberación del scanner
		entrada.close();
	}

}
