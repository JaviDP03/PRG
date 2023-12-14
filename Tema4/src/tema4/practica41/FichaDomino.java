package tema4.practica41;

/**
 * Clase FichaDomino que representa las piezas de dominó y métodos para recrear
 * el juego
 */
public class FichaDomino {
	private int lado1;
	private int lado2;

	// Constructor
	public FichaDomino(int lado1, int lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	// toString
	public String toString() {
		return "[" + (lado1 == 0 ? " " : lado1) + "|" + (lado2 == 0 ? " " : lado2) + "]";
	}

	// Método voltea
	public String voltea() {
		int comodinLado1; // variable para almacenar el valor del lado 1 y no perderlo

		comodinLado1 = lado1;
		lado1 = lado2;
		lado2 = comodinLado1;

		return toString();
	}

	// Método encaja
	public boolean encaja(FichaDomino ficha) {
		return lado1 == ficha.lado1 || lado1 == ficha.lado2 || lado2 == ficha.lado1 || lado2 == ficha.lado2;
	}
}
