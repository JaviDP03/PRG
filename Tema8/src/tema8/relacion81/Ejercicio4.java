package tema8.relacion81;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ejercicio4 {

	public static void main(String[] args) {
		int n = 0;
		byte[] buffer = new byte[5];
		try {
			InputStream fEntrada = new FileInputStream("/home/usuario/origen.txt");
			OutputStream fSalida = new FileOutputStream("/home/usuario/destino.txt");

			while ((n = fEntrada.read(buffer)) >= 0) {
				fSalida.write(buffer, 0, n);
			}

			fEntrada.close();
			fSalida.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
