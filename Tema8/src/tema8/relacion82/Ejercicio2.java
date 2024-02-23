package tema8.relacion82;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Ejercicio2 {

	public static void main(String[] args) {
		String linea1;
		String linea2;
		try {
			BufferedReader entrada1 = new BufferedReader(new FileReader("/home/usuario/entrada1.txt"));
			BufferedReader entrada2 = new BufferedReader(new FileReader("/home/usuario/entrada2.txt"));
			BufferedWriter salida = new BufferedWriter(new FileWriter("/home/usuario/salida.txt"));

			linea1 = entrada1.readLine();
			linea2 = entrada2.readLine();
			while (linea1 != null && linea2 != null) {

				salida.write(linea1 + ": " + linea2 + "\n");

				linea1 = entrada1.readLine();
				linea2 = entrada2.readLine();
			}

			entrada1.close();
			entrada2.close();
			salida.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

}
