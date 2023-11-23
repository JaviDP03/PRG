package tema4.pruebas;

/**
 * Clase Coche Simula un coche para un videojuego de tablero
 */
public class Coche {
	enum SentidoMarcha {
		ADELANTE, ATRAS
	};

	// Propiedades de la clase
	private double litrosCombustible;
	private int fila;
	private int columna;
	private int orientacion; // 0, 45, 135, 180...
	private SentidoMarcha sentido;
	private int velocidad;

	// Métodos de la clase
	/**
	 * Constructor Coche(f, c, lc)
	 * 
	 * @param lc es los litros de combustible
	 * @param f  es la fila
	 * @param c  es la columna
	 */
	public Coche(double lc, int f, int c) {
		litrosCombustible = lc;
		fila = f;
		columna = c;
		sentido = SentidoMarcha.ADELANTE;
	}

	public String toString() {
		String cadena;

		cadena = "Coche [litrosCombustible = " + litrosCombustible + ", fila = " + fila + ", columna = " + columna
				+ ", orientacion = " + orientacion + ", sentido = " + sentido + ", velocidad = " + velocidad + "]";

		return cadena;
	}

	/**
	 * Aumenta la velocidad del coche en 10km/h
	 */
	public void acelerar() {
		velocidad += 1;

		if (velocidad > 120) {
			velocidad = 120;
		}
	}

	/**
	 * Reduce la velocidad del coche en 10km/h
	 */
	public void frenar() {
		velocidad -= 1;

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

	/**
	 * Permite consultar el sentido de la marcha configurado en el coche
	 * 
	 * @return es el sentido
	 */
	public SentidoMarcha getSentido() {
		return sentido;
	}

	/**
	 * Configura el sentido de la marcha del coche
	 * 
	 * @param s es el sentido
	 */
	public void setSentido(SentidoMarcha s) {
		sentido = s;
	}
	
	/**
	 * Permite consultar la orientación de la marcha configurado en el coche
	 * @return
	 */
	public int getOrientacion() {
		return orientacion;
	}

	/**
	 *  Configura la orientación de la marcha del coche
	 * @param o
	 */
	public void setOrientacion(int o) {
		orientacion = o;
	}

	/**
	 * Avanza 10 casillas en la dirección y sentido de la marcha
	 * Gasta de combustible tanto como casillas haya avanzado
	 */
	public void avanzar() {
		int incrementoFila = 0;
		int incrementoColumna = 0;
		
		switch (orientacion) {
		case 0:
			incrementoFila = 0;
			incrementoColumna = velocidad;
			break;
		case 45:
			incrementoFila = -velocidad;
			incrementoColumna = velocidad;
			break;
		case 90:
			incrementoFila = -velocidad;
			incrementoColumna = 0;
			break;
		case 135:
			incrementoFila = -velocidad;
			incrementoColumna = -velocidad;
			break;
		case 180:
			incrementoFila = 0;
			incrementoColumna = -velocidad;
			break;
		case 225:
			incrementoFila = velocidad;
			incrementoColumna = -velocidad;
			break;
		case 270:
			incrementoFila = velocidad;
			incrementoColumna = 0;
			break;
		case 315:
			incrementoFila = velocidad;
			incrementoColumna = velocidad;
			break;
		}
		
		if (sentido == SentidoMarcha.ATRAS) {
			incrementoFila = -incrementoFila;
			incrementoColumna = -incrementoColumna;
		}
		
		fila += incrementoFila;
		columna += incrementoColumna;
		
		litrosCombustible -= velocidad;
		
		if (litrosCombustible < 0) {
			litrosCombustible = 0;
		}
	}

}
