package tema5.relacion54;

import java.util.Scanner;

/**
 * Amplia el código del ejercicio 1 para que cada uno de los métodos se llame
 * desde un menú repetitivo de opciones y se visualice el resultado justo
 * después de la llamada.
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		int opcion = 0;
		int opcion2 = 0;
		Scanner entrada = new Scanner(System.in);
		String conductor = "Viyuela, Pepe";
		String matricula = "3465GHX";
		
		do {
			System.out.println("Elige una opción:");
			System.out.println("1. La subcadena inicial de conductor hasta la posición de una coma.");
			System.out.println("2. El último carácter de cualquier cadena.");
			System.out.println("3. El carácter central de cualquier cadena.");
			System.out.println("4. El entero de 4 posiciones que se encuentra en el inicio de la cadena matricula.");
			System.out.println("5. La subcadena contenida en las tres últimas posiciones de matricula.");
			System.out.println("0. Salir");
			opcion = Integer.parseInt(entrada.nextLine());
			
			switch (opcion) {
			case 1:
				System.out.println(Ejercicio1.getSubcadenaInicial(conductor));
				break;
			case 2:
				System.out.println("Elige una cadena:");
				System.out.println("1. conductor");
				System.out.println("2. matricula");
				opcion2 = Integer.parseInt(entrada.nextLine());
				switch (opcion2) {
				case 1:
					System.out.println(Ejercicio1.getUltimoCaracter(conductor));
					break;
				case 2:
					System.out.println(Ejercicio1.getUltimoCaracter(matricula));
					break;
				}
				break;
			case 3:
				System.out.println("Elige una cadena:");
				System.out.println("1. conductor");
				System.out.println("2. matricula");
				opcion2 = Integer.parseInt(entrada.nextLine());
				switch (opcion2) {
				case 1:
					System.out.println(Ejercicio1.getCaracterCentral(conductor));
					break;
				case 2:
					System.out.println(Ejercicio1.getCaracterCentral(matricula));
					break;
				}
				break;
			case 4:
				System.out.println(Ejercicio1.getInicioCuatroPosiciones(matricula));
				break;
			case 5:
				System.out.println(Ejercicio1.getSubcadenaTresFinal(matricula));
				break;
			}
		} while (opcion != 0);

		entrada.close();
	}

}
