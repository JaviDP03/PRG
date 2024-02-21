package tema8.ejemplos;

import java.io.FileWriter;

public class EjemploFileWriter {

	public static void main(String[] args) {
		String datos = "En un lugar de la Mancha\nde cuyo nombre no quiero acordarme\nno ha mucho tiempo que vivía un hidalgo ";
		try {
			// Crear un FileReader usando codificación por defecto
			FileWriter salida = new FileWriter("/home/usuario/salida.txt");
			// Escribir en el fichero
			salida.write(datos);
			// Cerrar el flujo
			salida.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

}