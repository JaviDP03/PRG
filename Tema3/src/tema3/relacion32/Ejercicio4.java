package tema3.relacion32;

import java.util.Scanner;

public class Ejercicio4 {
	/**
	 * Crea un programa que lea desde teclado el nombre de un mes del año y responda
	 * indicando el número del trimestre al que pertenece. En el caso de no
	 * introducir un mes correcto debe mostrar “ERROR EN EL NOMBRE DEL MES”.
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		String mes;

		// Inicialización
		System.out.println("Introduce un mes (enero):");
		mes = entrada.nextLine().toLowerCase();

		// Resultado
		switch (mes) {
		case "enero":
		case "febrero":
		case "marzo":
			System.out.println("Trimestre 1");
			break;
		case "abril":
		case "mayo":
		case "junio":
			System.out.println("Trimestre 2");
			break;
		case "julio":
		case "agosto":
		case "septiembre":
			System.out.println("Trimestre 3");
			break;
		case "octubre":
		case "noviembre":
		case "diciembre":
			System.out.println("Trimestre 4");
			break;
		default:
			System.out.println("ERROR EN EL NOMBRE DEL MES");
			break;
		}
		
		// Liberación del scanner
		entrada.close();
	}

}
