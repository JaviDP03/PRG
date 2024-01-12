package tema5.resumen;

/**
 * Crea un array de 5 jarras de la clase Jarra visto en el tema 4 de objetos.
 * Los cubos tendrán de capacidad 5, 10, 15, 20 y 25 litros. Hazlo con un bucle
 * for.
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		Jarra[] jarras = new Jarra[5];
		int capacidadVariable = 5;

		for (int i = 0; i < jarras.length; i++) {
			jarras[i] = new Jarra(capacidadVariable);
			capacidadVariable += 5;
			System.out.println(jarras[i]);
		}
	}

}
