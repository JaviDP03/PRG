package tema8.relacion81;

import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.StringWriter;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Flujo hacia donde iremos enviando los caracteres que se tecleen
		StringWriter salida = new StringWriter();
		char c;
		int contador = 0;
		try {
			// Crear un flujo para leer caracteres de la entrada estándar
			InputStreamReader entrada = new InputStreamReader(System.in);
			// Mientras la entrada de teclado no sea Intro
			while ((c = (char) entrada.read()) != '\n') {
				if (c == 'x') {
					contador++;
				} else {
					contador = 0;
				}

				if (contador == 3) {
					break;
				}

				// Añadir el carácter leído al flujo de salida
				salida.append(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			// Crear un FileReader usando codificación por defecto
			FileWriter ficheroSalida = new FileWriter("C:/Users/javid/Desktop/pruebas/salida.txt");
			// Escribir en el fichero
			ficheroSalida.write(salida.toString());
			// Cerrar el flujo
			ficheroSalida.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}