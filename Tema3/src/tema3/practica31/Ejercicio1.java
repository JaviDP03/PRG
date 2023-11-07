package tema3.practica31;

public class Ejercicio1 {
	/**
	 * Escribe un programa que genere el menú del día de un restaurante. El programa
	 * el programa debe mostrar: - Un primer plato (elegido al azar de entre 4
	 * posibles primeros). - Un segundo plato (elegido al azar de entre 3 posibles
	 * segundos). - Un postre (elegido al azar de entre 2 posibles postres).
	 */
	public static void main(String[] args) {
		// Introducción de variables
		String primerPlato1, primerPlato2, primerPlato3, primerPlato4;
		String segundoPlato1, segundoPlato2, segundoPlato3;
		String postre1, postre2;
		int numeroPrimerPlato, numeroSegundoPlato, numeroPostre;

		// Inicialización
		primerPlato1 = "Solomillo en salsa";
		primerPlato2 = "Macarrones con tomate";
		primerPlato3 = "Sopa de fideos";
		primerPlato4 = "Salmón ahumado";

		segundoPlato1 = "Ensalada mixta";
		segundoPlato2 = "Tortilla de patatas";
		segundoPlato3 = "Salmorejo";

		postre1 = "Helado de chocolate";
		postre2 = "Tiramisú";

		numeroPrimerPlato = (int) (Math.random() * 4 + 1);
		numeroSegundoPlato = (int) (Math.random() * 3 + 1);
		numeroPostre = (int) (Math.random() * 2 + 1);

		// Resultado
		System.out.print("De primero: ");
		if (numeroPrimerPlato == 1) {
			System.out.println(primerPlato1);
		} else if (numeroPrimerPlato == 2) {
			System.out.println(primerPlato2);
		} else if (numeroPrimerPlato == 3) {
			System.out.println(primerPlato3);
		} else {
			System.out.println(primerPlato4);
		}

		System.out.print("De segundo: ");
		if (numeroSegundoPlato == 1) {
			System.out.println(segundoPlato1);
		} else if (numeroSegundoPlato == 2) {
			System.out.println(segundoPlato2);
		} else {
			System.out.println(segundoPlato3);
		}

		System.out.print("De postre: ");
		if (numeroPostre == 1) {
			System.out.println(postre1);
		} else {
			System.out.println(postre2);
		}

	}

}
