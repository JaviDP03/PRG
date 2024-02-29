package tema8.relacion82;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Ejercicio4 {

	public static void main(String[] args) {
		String linea;
		String[] lineaSeparada = new String[3];
		try {
			BufferedReader entrada = new BufferedReader(new FileReader("/home/usuario/entrada.txt"));
			BufferedWriter salida = new BufferedWriter(new FileWriter("/home/usuario/salida.txt"));

			linea = entrada.readLine();
			
			while (linea != null) {
				lineaSeparada = linea.split(";");
				salida.write(lineaSeparada[1] + ": " + lineaSeparada[2] + lineaSeparada[3] + "\n");

				linea = entrada.readLine();
			}

			entrada.close();
			salida.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
