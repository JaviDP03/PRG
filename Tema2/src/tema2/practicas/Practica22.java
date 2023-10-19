package tema2.practicas;

import java.util.Scanner;

public class Practica22 {
	/*
	 * Contenido de la práctica
	 * Realizado por: Javier Duarte Pérez
	 */
	public static void main(String[] args) {
		// Creación de variables
		Scanner entrada = new Scanner(System.in);
		String descripcion;
		int cantidad;
		double precio;
		boolean enviado;
		String entradaEnviado; // variable para introducir Si o No
		final int IVA = 4;

		// Introducción de datos
		System.out.println("Introduce la descripción del producto:");
		descripcion = entrada.nextLine();

		System.out.println("Introduce la cantidad:");
		cantidad = Integer.parseInt(entrada.nextLine());

		System.out.println("Introduce el precio en euros:");
		precio = Double.parseDouble(entrada.nextLine());

		System.out.println("¿Ha sido enviado? (Si/No):");
		entradaEnviado = entrada.nextLine();

		// Cálculos
		enviado = entradaEnviado.equalsIgnoreCase("Si");
		entradaEnviado = (enviado = true) ? "Si" : "No";
		double totalBruto = cantidad * precio;
		double importeIVA = totalBruto * IVA;
		double totalGeneral = totalBruto + importeIVA;

		// Resultado
		System.out.printf("%-20s%-7s%9s%7s%10s%8s%14s\n", "Descripción", "Enviado", "Cantidad", "Precio", "Imp_Bruto",
				"Imp_iva", "Total_General");
		System.out.printf("%-20s%-7s%9s%7s%10s%8s%14s\n", "-----------", "-------", "--------", "------", "---------",
				"-------", "-------------");
		System.out.printf("%-20s%-7s%9d%7.2f%10.2f%8.2f%14.2f\n", descripcion, entradaEnviado, cantidad, precio,
				totalBruto, importeIVA, totalGeneral);

		entrada.close();
	}

}
