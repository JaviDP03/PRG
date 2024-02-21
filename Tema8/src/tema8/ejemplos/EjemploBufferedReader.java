package tema8.ejemplos;

import java.io.BufferedReader;
import java.io.FileReader;

public class EjemploBufferedReader {

	public static void main(String[] args) {
		// Crear un String
		String linea;
		try {
			// Crear un BufferedReader
			BufferedReader entrada = new BufferedReader(new FileReader("/home/usuario/salida.txt"));
			// Leer líneas
			linea = entrada.readLine();
			while (linea != null) {
				System.out.println("Línea en el fichero: " + linea);
				linea = entrada.readLine();
			}
			// Cerrar flujo
			entrada.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

}
