package tema8.ejemplos;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class EjemploBufferedWriter {

	public static void main(String[] args) {
		String datos = "Estos datos van hacia el archivo de salida";
		try {
			// Crear un BufferedWriter que dirija los datos
			// hacia un FileWriter
			BufferedWriter salida = new BufferedWriter(new FileWriter("salida.txt"));
			// Escribir cadena en el fichero
			salida.write(datos);
			// Cerrar el flujo
			salida.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

}
