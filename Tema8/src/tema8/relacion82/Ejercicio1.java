package tema8.relacion82;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ejercicio1 {

	public static void main(String[] args) {
		int n = 0;
		byte[] buffer = new byte[256];
		try {
			FileInputStream fEntrada = new FileInputStream("/home/usuario/entrada.txt");
			BufferedInputStream entrada = new BufferedInputStream(fEntrada);
			FileOutputStream fSalida = new FileOutputStream("/home/usuario/salida.txt");
			BufferedOutputStream salida = new BufferedOutputStream(fSalida);
			
			while ((n = entrada.read(buffer)) >= 0) {
				salida.write(buffer, 0, n);
			}

			entrada.close();
			salida.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}