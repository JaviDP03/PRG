package tema8.ejemplos;

import java.io.BufferedReader;
import java.io.FileReader;

public class EjemploMediaLineas {

	public static void main(String[] args) {
		// Crear un String
		String linea;
		int lineasLeidas = 0;
		double suma = 0;
		double valor;
		try {
			// Crear un BufferedReader
			BufferedReader entrada = new BufferedReader(new FileReader("/home/usuario/reales.txt"));
			// Leer líneas
			linea = entrada.readLine();
			while (linea != null) {
				valor = Double.parseDouble(linea);
				System.out.printf("Leyendo %f ...\n", valor);
				lineasLeidas++;
				suma += valor;
				linea = entrada.readLine();
			}
			// Cerrar flujo
			entrada.close();
			System.out.println("La media es " + suma / (double) lineasLeidas);
		} catch (Exception e) { 
			e.getStackTrace();
		}
	}

}
