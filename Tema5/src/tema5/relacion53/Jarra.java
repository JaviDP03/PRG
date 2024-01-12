package tema5.relacion53;

public class Jarra {
	private int capacidad;
	private int contenido;

	/**
	 * Crea un vaso, inicialmente vacío, de la capacidad indicada.
	 * 
	 * @param capacidad es lo que le coge al vaso.
	 */
	public Jarra(int capacidad) {
		this.capacidad = capacidad;
		contenido = 0;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public int getContenido() {
		return contenido;
	}

	/**
	 * Llena la jarra a tope
	 */
	public void llenar() {
		contenido = capacidad;
	}

	/**
	 * Vacía toda la jarra
	 */
	public void vaciar() {
		contenido = 0;
	}

	/**
	 * Rellena la jarra con la cantidad indicada y, si se pasa, devuelve los litros
	 * que han sobrado;
	 */
	public int rellenar(int cantidad) {
		int sobran = 0;

		contenido += cantidad;

		if (contenido > capacidad) {
			sobran = contenido - capacidad;
			contenido = capacidad;
		}

		return sobran;
	}

	/**
	 * Vierte de la jarra la cantidad indicada y, si se pasa, devuelve los litros
	 * que no ha podido verter.
	 */
	public int verter(int cantidad) {
		int faltan = 0;

		contenido -= cantidad;

		if (contenido < 0) {
			faltan = -contenido;
			contenido = 0;
		}

		return faltan;
	}

	/**
	 * Pasa todos los litros que pueda (de la cantidad indicada) a otra jara
	 * 
	 * @param otra La otra jarra
	 */
	public void traspasar(Jarra otra, int cantidad) {
		int puedoTraspasar;
		int maximoAdmitido;

		// ¿Cuánto puedo traspasar desde mi jarra?
		puedoTraspasar = cantidad;
		if (this.contenido < cantidad)
			puedoTraspasar = this.contenido;

		// ¿Cuánto admite la otra jarra?
		maximoAdmitido = puedoTraspasar;
		if (otra.capacidad - otra.contenido < puedoTraspasar)
			maximoAdmitido = otra.capacidad - otra.contenido;

		this.contenido -= maximoAdmitido;
		otra.contenido += maximoAdmitido;
	}

	@Override
	public String toString() {
		return contenido + " ";
	}
}
