package tema8.relacion81;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Ejercicio2 {

	public static void main(String[] args) {
		String linea;
		StringBuilder nuevaLinea = new StringBuilder();
		try {
			// Abrir el fichero de salida en modo "anexar" (append = true)
			PrintWriter salida = new PrintWriter(new FileWriter("C:/Users/javid/Desktop/pruebas/salida.txt", true));
			// Crear un flujo de entrada para leer líneas de la entrada estándar
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			while (!(linea = entrada.readLine()).equals("salir")) {
				char letra;
				for (int i = 0; i < linea.length(); i++) {
					letra = linea.charAt(i);
					
					if (letra == 'a') {
						nuevaLinea.append('o');
					} else if (letra == 'o') {
						nuevaLinea.append('a');
					} else {
						nuevaLinea.append(letra);
					}
				}
				salida.println(nuevaLinea);
			}
			salida.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}