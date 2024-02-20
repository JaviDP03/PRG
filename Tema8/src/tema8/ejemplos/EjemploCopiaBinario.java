package tema8.ejemplos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class EjemploCopiaBinario {

	public static void main(String[] args) {
		int n = 0;
		byte[] buffer = new byte[5];
		try {
			// Crear los flujos de E/S
			InputStream fEntrada = new FileInputStream("/home/usuario/origen.txt");
			OutputStream fSalida = new FileOutputStream("/home/usuario/destino.txt");
			
			// read() lee todos los bytes que puede hasta completar el buffer
			// Devuelve el número de bytes que ha sido capaz de leer
			while ((n = fEntrada.read(buffer)) >= 0) {
				// Escribir a la salida los bytes que se han leído
				fSalida.write(buffer, 0, n);
			}
			
			// Cerrar los flujos
			fEntrada.close();
			fSalida.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
