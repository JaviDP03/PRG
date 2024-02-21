package tema8.ejemplos;

import java.io.FileReader;

public class EjemploFileReader {

	public static void main(String[] args) {
		// Crear un array de caracteres
		char[] array = new char[100];
		try {
			// Crear un Reader usando FileReader
			FileReader entrada = new FileReader("/home/usuario/salida.txt");
			// Leer caracteres
			int caracteresLeidos = entrada.read(array);
			// Imprimir tantos caracteres del array como se hayan leído
			System.out.println("Datos en el fichero: ");
			for (int i = 0; i < caracteresLeidos; i++) {
				System.out.print(array[i]);
			}
			// Cerrar el flujo
			entrada.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

}
