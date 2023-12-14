package tema4.practica41;

/**
 * Clase Tiempo que representan intervalos de tiempo. Ej: 1h 34m 12s. Estos
 * tiempos se pueden sumar y restar.
 */
public class Tiempo {
	private int horas;
	private int minutos;
	private int segundos;

	// Constructor
	public Tiempo(int horas, int minutos, int segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	// toString
	public String toString() {
		return horas + "h " + minutos + "m " + segundos + "s";
	}

	// Método sumar
	public void sumar(int horas, int minutos, int segundos) {
		this.segundos += segundos;
		this.minutos += minutos;
		this.horas += horas;

		if (this.segundos >= 60) {
			this.segundos -= 60;
			this.minutos++;
		}
		
		if (this.minutos >= 60) {
			this.minutos -= 60;
			this.horas++;
		}
		
		if (this.horas >= 24) {
			this.horas -= 24;
		}
	}
	
	// Método restar
	public void restar(int horas, int minutos, int segundos) {
		this.segundos -= segundos;
		this.minutos -= minutos;
		this.horas -= horas;

		if (this.segundos < 0) {
			this.segundos += 60;
			this.minutos--;
		}
		
		if (this.minutos < 0) {
			this.minutos += 60;
			this.horas--;
		}
		
		if (this.horas >= 24) {
			this.horas -= 24;
		}
	}
}
