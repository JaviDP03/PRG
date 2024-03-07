package tema8.practica81;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LectorVehiculos {
	// Propiedades de instancia
	private String nombreFichero;
	private ObjectInputStream entrada;

	/**
	 * Construye un lector de objetos Vehiculo a partir del nombre del fichero donde
	 * están almacenados.
	 *
	 * @param nombreFichero
	 */
	public LectorVehiculos(String nombreFichero) {
		super();
		this.nombreFichero = nombreFichero;
	}

	/**
	 * Abre el fichero para escribir en él.
	 *
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public void abrir() throws FileNotFoundException, IOException {
		entrada = new ObjectInputStream(new FileInputStream(nombreFichero));
	}

	/**
	 * Cierra el fichero.
	 *
	 * @throws IOException
	 */
	public void cerrar() throws IOException {
		if (entrada != null) {
			entrada.close();
			entrada = null;
		}
	}

	/**
	 * Lee objetos de la clase Vehiculo.
	 *
	 * @return un objeto Vehiculo o null si ha llegado al final del fichero.
	 * @throws ClassNotFoundException
	 * @throws IOException
	 */
	public Vehiculo leer() throws ClassNotFoundException, IOException {
		Vehiculo unVehiculo;
		unVehiculo = null;

		if (entrada != null) {
			// Leemos si el fichero está abierto
			try {
				unVehiculo = (Vehiculo) entrada.readObject();
			} catch (EOFException e) {
				// Si hemos llegado al final del fichero, devolvemos null
			}
		}
		return unVehiculo;
	}
}
