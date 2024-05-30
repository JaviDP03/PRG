package ejercicio12;

import java.time.LocalDate;

/**
 * Clase ViajeBus que representa los viajes en autobús de una agencia.
 */
public class ViajeBus {
	// Propiedades de la clase
	static final float PRECIO_POR_KILOMETRO = 1.10f;

	// Propiedades de la instancia
	private LocalDate fecha;
	private String origen;
	private String destino;
	private float distancia;

	// Constructor
	public ViajeBus(LocalDate fecha, String origen, String destino, float distancia) {
		this.fecha = fecha;
		this.origen = origen;
		this.destino = destino;
		this.distancia = distancia;
	}

	// Getters y Setters
	public float getDistancia() {
		return distancia;
	}

	public void setDistancia(float distancia) {
		this.distancia = distancia;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public String getOrigen() {
		return origen;
	}

	public String getDestino() {
		return destino;
	}

	/**
	 * Método que calcula el precio del viaje.
	 * 
	 * @return precio del viaje
	 */
	public float getCosteViaje() {
		return distancia * PRECIO_POR_KILOMETRO;
	}

	// toString
	public String toString() {
		return fecha + ": " + origen + " -> " + destino + " (" + distancia + " km)";
	}

	// main
	public static void main(String[] args) {
		// Crear array
		ViajeBus[] listaViajes = new ViajeBus[30];
		
		// Tabla de consulta de ciudades
		String[] ciudadesAndalucia = { "Sevilla", "Málaga", "Granada", "Huelva", "Almería", "Cádiz", "Jaén",
				"Córdoba" };

		// Inicializar el array
		for (int i = 0; i < listaViajes.length; i++) {
			LocalDate fechaViaje = LocalDate.of(2024, 1, i + 1);
			String ciudadOrigen = ciudadesAndalucia[(int) (Math.random() * 8)];
			String ciudadDestino = ciudadesAndalucia[(int) (Math.random() * 8)];
			float distanciaViaje = (float) (Math.random() * 300 + 1);

			ViajeBus unViaje = new ViajeBus(fechaViaje, ciudadOrigen, ciudadDestino, distanciaViaje);

			listaViajes[i] = unViaje;
		}

		// Mostrar el array con foreach
		for (ViajeBus viaje : listaViajes) {
			System.out.println(viaje);
		}

		// Calcular billete más barato, más caro, precio medio y gasto total
		float gastoTotal = 0;
		float gastoMedio = 0;
		float precioBarato = 335;
		float precioCaro = 0;
		float precioActual = 0;
		for (int i = 0; i < listaViajes.length; i++) {
			precioActual = listaViajes[i].getCosteViaje();
			gastoTotal += precioActual;
			
			if (precioActual < precioBarato) {
				precioBarato = precioActual;
			}
			
			if (precioActual > precioCaro) {
				precioCaro = precioActual;
			}
		}
		gastoMedio = gastoTotal / 30;
		
		// Resultado
		System.out.printf("\nViaje más barato: %.2f €\n", precioBarato);
		System.out.printf("Viaje más caro: %.2f €\n", precioCaro);
		System.out.printf("Precio medio del viaje: %.2f €\n", gastoMedio);
		System.out.printf("Gasto total en viajes: %.2f €\n", gastoTotal);

	}
}
