package tema8.relacion81;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ejercicio7 {

	public static void main(String[] args) throws IOException {
		// Crear el fichero
		File fichero = new File("/home/usuario/ejemplo.txt");
		try {
			boolean creadoConExito = fichero.createNewFile();
			if (creadoConExito) {
				System.out.println("Se ha creado el nuevo fichero.");
			} else {
				System.out.println("El fichero ya existe.");
			}
		} catch (Exception e) {
			e.getStackTrace();
		}

		// Escribir en el fichero
		String datos = "Este es el ejercicio 7 de la relación 8.1";
		try {
			FileWriter salida = new FileWriter(new File("/home/usuario/ejemplo.txt"));
			
			salida.write(datos);
			
			salida.close();
		} catch (Exception e) {
			e.getStackTrace();
		}

		// Leer el fichero
		String cadena;
		try {
			cadena = Files.readString(Paths.get("/home/usuario/ejemplo.txt"));
			System.out.println(cadena);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Renombrar fichero
		File fichero1 = new File("/home/usuario/ejemplo.txt");
		File fichero2 = new File("/home/usuario/ejercicio7.txt");
		if (fichero2.exists())
			throw new java.io.IOException("Ya existe ese fichero");
		boolean renombradoConExito = fichero1.renameTo(fichero2);
		if (!renombradoConExito) {
			System.out.println("No se ha podido renombrar el fichero");
		}

		// Conocer codificación
		try {
			// InputStreamReader sabe convertir bytes a caracteres
			InputStreamReader entrada = new InputStreamReader(new FileInputStream("/home/usuario/ejercicio7.txt"));
			// Vemos la codificación actual
			System.out.println(entrada.getEncoding());
			entrada.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
