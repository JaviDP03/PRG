package tema4.relacion42;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcion;
		
		Equipo equipo1 = new Equipo("Equipo 1", 0, 0, 0);
		
		Equipo equipo2 = new Equipo("Equipo 2", 0, 0, 0);
		
		do {
			System.out.println("INTRODUCE UNA OPCIÓN:");
			System.out.println("--------------------------");
			System.out.println("1. Ver datos de los dos equipos");
			System.out.println("2. Introducir datos de un partido");
			System.out.println("0. Salir de la aplicación");
			
			opcion = Integer.parseInt(entrada.nextLine());
			
			switch (opcion) {
			case 1:
				System.out.println(equipo1);
				System.out.println(equipo2);
				break;
			case 2:
				System.out.println(equipo1.getNombre());
				System.out.print("Goles marcados: ");
				int golesMarcados = Integer.parseInt(entrada.nextLine());
				System.out.print("Goles recibidos: ");
				int golesRecibidos = Integer.parseInt(entrada.nextLine());
				equipo1.partido(golesMarcados, golesRecibidos);
				
				System.out.println(equipo2.getNombre());
				System.out.print("Goles marcados: ");
				golesMarcados = Integer.parseInt(entrada.nextLine());
				System.out.print("Goles recibidos: ");
				golesRecibidos = Integer.parseInt(entrada.nextLine());
				equipo2.partido(golesMarcados, golesRecibidos);
				break;
			default:
				break;
			}
			
		System.out.println();
		} while (opcion != 0);
		
		entrada.close();
	}

}
