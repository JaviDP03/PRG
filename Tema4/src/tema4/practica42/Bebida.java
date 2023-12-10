package tema4.practica42;

/**
 * Simulación de la preparación de bebidas con café y leche.
 */
public class Bebida {
	// Propiedades de la instancia
	private int cafe;
	private int cafeDescafeinado;
	private int leche;
	private int lecheDesnatada;

	// Constructor
	public Bebida() {
		cafe = 0;
		cafeDescafeinado = 0;
		leche = 0;
		lecheDesnatada = 0;
	}

	// toString
	public String toString() {
		String texto = "";

		if (cafe == 0 && cafeDescafeinado == 0) {
			texto = "Leche";
		} else if (leche == 0 && lecheDesnatada == 0) {
			texto = "Café solo";
		} else {
			if (leche >= 80 || lecheDesnatada >= 80) {
				texto = "Leche manchada";
				texto += cafeDescafeinado > 0 ? " descafeinada" : "";
				texto += lecheDesnatada > 0 ? " con leche desnatada" : "";
			} else if (leche >= 30 || lecheDesnatada >= 30) {
				texto = "Café con leche";
				texto += cafeDescafeinado > 0 ? " descafeinado" : "";
				texto += lecheDesnatada > 0 ? " con leche desnatada" : "";
			} else if (leche < 30 || lecheDesnatada < 30) {
				texto = "Café cortado";
				texto += cafeDescafeinado > 0 ? " descafeinado" : "";
				texto += lecheDesnatada > 0 ? " con leche desnatada" : "";
			}
		}

		return texto;
	}

	// Método ponerCafe
	public void ponerCafe(int cantidad) {
		if (cafe > 0 || cafeDescafeinado > 0) {
			System.out.println("ERROR: Ya hay café en el vaso");
		} else {
			cafe += cantidad;
		}
	}

	// Método ponerDescafeinado
	public void ponerDescafeinado(int cantidad) {
		if (cafeDescafeinado > 0 || cafe > 0) {
			System.out.println("ERROR: Ya hay café en el vaso");
		} else {
			cafeDescafeinado += cantidad;
		}
	}

	// Método ponerLeche
	public void ponerLeche(int cantidad) {
		if (leche > 0 || lecheDesnatada > 0) {
			System.out.println("ERROR: Ya hay leche en el vaso");
		} else {
			leche += cantidad;
		}
	}

	// Método ponerDesnatada
	public void ponerDesnatada(int cantidad) {
		if (lecheDesnatada > 0 || leche > 0) {
			System.out.println("ERROR: Ya hay leche en el vaso");
		} else {
			lecheDesnatada += cantidad;
		}
	}
}
