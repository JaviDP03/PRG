package tema4.relacion42;

import java.util.Scanner;

public class Ejercicio3 {
	// Propiedades de clase
	private static Scanner entrada = new Scanner(System.in);

	// Métodos de la calse
	public static void comprarEntradas (Zona laZona) {
		System.out.println("Cantidad:");
		int cantidad = Integer.parseInt(entrada.nextLine());
		laZona.vender(cantidad);
	}
	
	// main
	public static void main(String[] args) {
		int opcion, opcion2;
		Zona salaPrincipal = new Zona(100);
		Zona talleres = new Zona(20);
		Zona vip = new Zona(10);

		do {
			System.out.println("1. Mostrar el número de entradas disponibles");
			System.out.println("2. Vender entradas");
			System.out.println("0. Salir");
			opcion = Integer.parseInt(entrada.nextLine());

			switch (opcion) {
			case 1:
				System.out.println("Sala Principal: " + salaPrincipal.getnumeroEntradasDisponibles() + " entradas");
				System.out.println("Zona de talleres: " + talleres.getnumeroEntradasDisponibles() + " entradas");
				System.out.println("Zona VIP: " + vip.getnumeroEntradasDisponibles() + " entradas");
				break;
			case 2:
				do {
					System.out.println("Elige la zona:");
					System.out.println("1. Sala Principal");
					System.out.println("2. Zona de talleres");
					System.out.println("3. Zona VIP");
					System.out.println("0. Cancelar");
					opcion2 = Integer.parseInt(entrada.nextLine());
					
					switch (opcion2) {
					case 1:
						Ejercicio3.comprarEntradas(salaPrincipal);
						break;
					case 2:
						Ejercicio3.comprarEntradas(talleres);
						break;
					case 3:
						Ejercicio3.comprarEntradas(vip);
						break;
					case 0:
						break;
					default:
						System.out.println("No es una opción válida");
						break;
					}
				} while (opcion2 != 0);
				break;
			case 0:
				break;
			default:
				System.out.println("No es una opción válida");
				break;
			}
			System.out.println();
		} while (opcion != 0);

		entrada.close();
	}

}
