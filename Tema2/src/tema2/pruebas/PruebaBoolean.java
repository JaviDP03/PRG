package tema2.pruebas;

import java.util.Scanner;

public class PruebaBoolean {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double dineroGastado;
		boolean descuento;
		String comprarPescaderia;
		String descuentoDisponible;

		System.out.println("¿Cuánto dinero has gastado?:");
		dineroGastado = Double.parseDouble(entrada.nextLine());

		System.out.println("¿Has comprado en la pescadería? (Si/No)");
		comprarPescaderia = entrada.nextLine();

		descuento = (dineroGastado >= 50) || comprarPescaderia.equalsIgnoreCase("Si");
		descuentoDisponible = (descuento == true) ? "¡Dispones de un descuento!" : "No puedes optar a un descuento.";

		System.out.println(descuentoDisponible);

		entrada.close();
	}

}
