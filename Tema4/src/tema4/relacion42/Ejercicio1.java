package tema4.relacion42;

import java.util.Scanner;

import tema4.relacion41.CuentaBancaria;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcion, opcion2;
		double cantidad;
		CuentaBancaria cuenta1 = new CuentaBancaria("ES07-1234-5678", "Pepe", 556.76, "2%");
		CuentaBancaria cuenta2 = new CuentaBancaria("ES09-9876-5432", "Paco", 1234.91, "2%");
				
		do {
			System.out.println("CUENTAS BANCARIAS");
			System.out.println("=====================");
			System.out.println("1. Ver saldo de cuenta1");
			System.out.println("2. Ver saldo de cuenta2");
			System.out.println("11. Ingresar importe en cuenta1");
			System.out.println("12. Ingresar importe en cuenta2");
			System.out.println("21. Reintegrar cantidad de cuenta1");
			System.out.println("22. Reintegrar cantidad de cuenta2");
			System.out.println("31. ¿Está la cuenta1 en números rojos?");
			System.out.println("32. ¿Está la cuenta2 en números rojos?");
			System.out.println("40. Transferir importe entre cuentas");
			System.out.println("0. Salir");
			
			opcion = Integer.parseInt(entrada.nextLine());
			
			switch (opcion) {
			case 1:
				System.out.println(cuenta1.getSaldo() + "€");
				break;
			case 2:
				System.out.println(cuenta2.getSaldo() + "€");
				break;
			case 11:
				System.out.println("Introduzca el importe:");
				cantidad = Double.parseDouble(entrada.nextLine());
				
				cuenta1.ingreso(cantidad);
				break;
			case 12:
				System.out.println("Introduzca el importe:");
				cantidad = Double.parseDouble(entrada.nextLine());
				
				cuenta2.ingreso(cantidad);
				break;
			case 21:
				System.out.println("Introduzca el importe:");
				cantidad = Double.parseDouble(entrada.nextLine());
				
				cuenta1.reintegro(cantidad);
				break;
			case 22:
				System.out.println("Introduzca el importe:");
				cantidad = Double.parseDouble(entrada.nextLine());
				
				cuenta2.reintegro(cantidad);
				break;
			case 31:
				cuenta1.numerosRojos();
				break;
			case 32:
				cuenta2.numerosRojos();
				break;
			case 40:
				do {
					System.out.println("41. Transferir de cuenta1 a cuenta2");
					System.out.println("42. Transferir de cuenta1 a cuenta2");
					System.out.println("0. Cancelar");
					
					opcion2 = Integer.parseInt(entrada.nextLine());
					
					switch (opcion2) {
					case 41:
						System.out.println("Introduzca el importe:");
						cantidad = Double.parseDouble(entrada.nextLine());
						
						if (cuenta1.getSaldo() < cantidad) {
							System.out.println("No puedes realizar la transferencia, quedan " + cuenta1.getSaldo() + "€");
						} else {
							cuenta1.reintegro(cantidad);
							cuenta2.ingreso(cantidad);
						}
						break;
					case 42:
						System.out.println("Introduzca el importe:");
						cantidad = Double.parseDouble(entrada.nextLine());
						
						if (cuenta2.getSaldo() < cantidad) {
							System.out.println("No puedes realizar la transferencia, quedan " + cuenta2.getSaldo() + "€");
						} else {
							cuenta2.reintegro(cantidad);
							cuenta1.ingreso(cantidad);
						}
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
