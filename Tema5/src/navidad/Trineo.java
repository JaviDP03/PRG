package navidad;

import java.util.Arrays;

/**
 * Esta clase permitirá crear trineos de distinta capacidad para que Santa pueda
 * repartir todos sus regalos.
 */
public class Trineo {
	// Propiedades de la instancia
	private String[] listaRegalos;
	private int cantidadAlmacenada;

	/**
	 * Constructor
	 * 
	 * @param tamaño
	 */
	public Trineo(int tamaño) {
		listaRegalos = new String[tamaño];
		cantidadAlmacenada = 0;
	}

	/**
	 * Añadir un nuevo regalo al trineo. Solo será añadido en el caso de que haya
	 * espacio disponible.
	 * 
	 * @param regalo
	 */
	public void añadirRegalo(String regalo) {
		boolean estaLLeno = true;
		int posicion = 0;

		for (int i = 0; i < listaRegalos.length; i++) {
			if (listaRegalos[i] == null) {
				estaLLeno = false;
				posicion = i;
				break;
			}
		}

		if (estaLLeno) {
			;
		} else {
			listaRegalos[posicion] = regalo;
			cantidadAlmacenada++;
		}

	}

	/**
	 * Devuelve el número de regalos que el trineo tiene actualmente almacenados.
	 * 
	 * @return
	 */
	public int getCantidadAlmacenada() {
		return cantidadAlmacenada;
	}

	/**
	 * Devuelve la capacidad de un trineo.
	 * 
	 * @return
	 */
	public int getCapacidadMaxima() {
		return listaRegalos.length;
	}

	/**
	 * Consultar el regalo que hay almacenado en una posición. La posición se
	 * indicará entre 0 y capacidad - 1. En caso de no haber regalo en la posición
	 * indicada, devuelve null.
	 * 
	 * @param indice
	 * @return
	 */
	public String getRegalo(int indice) {
		if (indice < 0 || indice >= listaRegalos.length) {
			return "No existe";
		} else {
			return listaRegalos[indice];
		}
	}

	/**
	 * Saca un regalo del trineo. Si se indica una posición no válida, no se hará
	 * nada.
	 * 
	 * @param indice
	 */
	public void quitarRegalo(int indice) {
		if (indice < 0 || indice >= cantidadAlmacenada) {
			;
		} else {
			listaRegalos[indice] = null;

			for (int i = indice; i < cantidadAlmacenada - 1; i++) {
				listaRegalos[i] = listaRegalos[i + 1];
			}
			
			cantidadAlmacenada--;
		}
	}

	/**
	 * toString
	 */
	public String toString() {
		return "Trineo [listaRegalos=" + Arrays.toString(listaRegalos) + ", cantidadAlmacenada=" + cantidadAlmacenada
				+ ", capacidadMaxima()=" + getCapacidadMaxima() + "]";
	}

}
