package tema5.repaso;

/**
 * Clase que permite simular el juego de la primitiva
 * 
 * Se juega de la siguiente forma:
 *
 * Una de las claves del éxito de este sorteo a lo largo del tiempo es que las
 * reglas para jugar a La Primitiva son realmente sencillas. Básicamente, tienes
 * que elegir seis números del 1 al 49 en un mismo bloque del boleto, además de
 * un reintegro que va del 0 al 9. También existe el número complementario, que
 * es una bola adicional (del 1 al 49) que se extrae del bombo tras los seis
 * números principales, y sirve para determinar el acertante de 2.ª categoría.
 * El número complementario no se puede elegir, se incluye automáticamente en el
 * boleto al sellarlo.
 * 
 * Categoría Aciertos 1ª 6 números 2ª 5 números + complementario 3ª 5 números 4ª
 * 4 números 5ª 3 números Especial 6 números + reintegro
 */
public class Primitiva {
	// Propiedades de instancia
	private int[] combinacion;
	private int complementario;
	private int reintegro;
	private int bolasSorteadas;

	// Constructores
	public Primitiva() {
		combinacion = new int[6];
		complementario = 0;
		reintegro = -1;
		bolasSorteadas = 0;
	}

	/**
	 * Saca una de las bolas de la combinación ganadora
	 * 
	 * @return la bola agraciada o 0 en caso de que ya se hayan sorteado todas
	 */
	public int sortearBola() {
		int aleatorio;

		if (bolasSorteadas == 6) {
			System.out.println("Ya se han sorteado todas las bolas");
			aleatorio = 0;
		} else {
			aleatorio = (int) (Math.random() * 49 + 1);

			combinacion[bolasSorteadas++] = aleatorio;

			System.out.printf("La bola %d es el número %d\n", bolasSorteadas, aleatorio);
		}

		return aleatorio;
	}

	/**
	 * Saca el número complementario
	 * 
	 * @return el complementario. Si ya se había sorteado, devuelve el que salió
	 *         anteriormente.
	 */
	public int sortearComplementario() {
		int aleatorio;

		if (complementario != 0) {
			System.out.println("Ya se ha sorteado el complementario");
		} else {
			aleatorio = (int) (Math.random() * 49 + 1);

			complementario = aleatorio;

			System.out.printf("El número complementario es el %d\n", complementario);
		}

		return complementario;
	}

	/**
	 * Saca el reintegro
	 * 
	 * @return un número del 0 al 9. Si ya se había sorteado, devuelve el que salió
	 *         anteriormente.
	 */
	public int sortearReintegro() {
		if (reintegro != -1) {
			System.out.println("Ya se ha sorteado el reintegro");
		} else {
			reintegro = (int) (Math.random() * 10);

			System.out.printf("El reintegro es el %d\n", reintegro);
		}

		return reintegro;
	}

	@Override
	public String toString() {
		StringBuilder cadena;

		cadena = new StringBuilder();
		cadena.append("La combinación ganadora es:\n");

		for (int i = 0; i < combinacion.length; i++) {
			cadena.append(combinacion[i]);

			if (i < 5)
				cadena.append(", ");
		}
		cadena.append("\n");

		cadena.append("El complementario es: " + complementario + "\n");
		cadena.append("El reintegro es: " + reintegro + "\n");

		return cadena.toString();
	}
}