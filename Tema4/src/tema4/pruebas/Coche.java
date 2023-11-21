package tema4.pruebas;

/**
 * Clase Coche
 * Simula un coche para un videojuego de tablero
 */
public class Coche {
	enum SentidoMarcha {ADELANTE, ATRAS};
	
	// Propiedades de la clase
	double litrosCombustible;
	int fila;
	int columna;
	int orientacion; // 0, 45, 135, 180...
	SentidoMarcha sentido;
	double velocidad;

	// Métodos de la clase
	/**
	 * Constructor Coche(f, c, lc)
	 * @param lc es los litros de combustible
	 * @param f es la fila
	 * @param c es la columna
	 */
	public Coche(double lc, int f, int c) {
		litrosCombustible = lc;
		fila = f;
		columna = c;
	}

	public String toString() {
		String cadena;

		cadena = "fila = " + fila + ", columna = " + columna + ", litros = " + litrosCombustible;
		
		return cadena;
	}
	
	/**
	 * Aumenta la velocidad del coche en 10km/h
	 */
	public void acelerar() {
		velocidad += 10;
		
		if (velocidad > 120) {
			velocidad = 120;
		}
	}
	
	/**
	 * Reduce la velocidad del coche en 10km/h
	 */
	public void frenar() {
		velocidad -= 10;
		
		if (velocidad < 0) {
			velocidad = 0;
		}
	}
	
	/**
	 * Para el coche por completo (velocidad = 0)
	 */
	public void detener() {
		velocidad = 0;
	}
	
	/**
	 * Gira el coche 45º en sentido antihorario
	 */
	public void girarIzquierda() {
		orientacion = (orientacion + 45) % 360;
	}
	
	/**
	 * Gira el coche 45º en sentido horario
	 */
	public void girarDerecha() {
		orientacion = (360 + orientacion - 45) % 360;
	}
	
}
