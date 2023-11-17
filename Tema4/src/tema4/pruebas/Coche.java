package tema4.pruebas;

/**
 * Clase Coche
 * Simula un coche para un videojuego de tablero
 */
public class Coche {
	// Propiedades de la clase
	int fila, columna;
	double litrosCombustible;

	// Métodos de la clase
	public Coche(int f, int c, double lc) {
		fila = f;
		columna = c;
		litrosCombustible = lc;
	}

	public String comoCadena() {
		String cadena;

		cadena = "fila = " + fila + ", columna = " + columna + ", litros = " + litrosCombustible;
		
		return cadena;
	}
	
	public void avanzar() {
		litrosCombustible -= 10;
	}

}
