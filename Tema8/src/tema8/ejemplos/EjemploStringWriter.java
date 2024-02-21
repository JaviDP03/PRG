package tema8.ejemplos;

import java.io.StringWriter;

public class EjemploStringWriter {

	public static void main(String[] args) {
		try {
			String datos = "Una cadena de texto.";
			// Crear un StringWriter
			StringWriter salida = new StringWriter();
			// Escribir los datos al buffer del StringWriter
			salida.write(datos);
			// Imprimir el contenido del StringWriter
			System.out.println("Datos en el StringWriter: " + salida);
			salida.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

}
