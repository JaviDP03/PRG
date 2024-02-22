package tema8.relacion81;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Ejercicio5 {

	public static void main(String[] args) {
		StringBuilder linea = new StringBuilder();
		try {
			PrintWriter salida = new PrintWriter(new FileWriter("/home/usuario/salida.txt", false));
			
			for (int i = 0; i < 100; i++) {
				linea.append((int) (Math.random() * 100));
				linea.append("\n");
			}
			salida.println(linea);
			
			salida.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
