package tema8.practica81;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscritorVehiculos {
	// Propiedades de instancia
	private String nombreFichero;
	private ObjectOutputStream salida;

	/**
	 * Construye un lector de objetos Vehiculo a partir del nombre del fichero donde
	 * están almacenados.
	 *
	 * @param nombreFichero
	 */
	public EscritorVehiculos(String nombreFichero) {
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
		salida = new ObjectOutputStream(new FileOutputStream(nombreFichero));
	}

	/**
	 * Cierra el fichero.
	 *
	 * @throws IOException
	 */
	public void cerrar() throws IOException {
		if (salida != null) {
			salida.close();
			salida = null;
		}
	}

	/**
	 * Escribe objetos de la clase Vehiculo.
	 *
	 * @throws IOException
	 */
	public void escribir(Vehiculo unVehiculo) throws IOException {
		if (salida == null)
			throw new IOException("El fichero está cerrado");
		salida.writeObject(unVehiculo);
	}
}
