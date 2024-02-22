package tema8.relacion81;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3 {

	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.print("Procesando el archivo " + args[i] + "...");
			try {
				// renombra el fichero añadiendo ".tmp"
				File ficheroOriginal = new File(args[i]);
				File ficheroTemporal = new File(args[i] + ".tmp");
				ficheroOriginal.renameTo(ficheroTemporal);
				// lee los datos del archivo temporal
				BufferedReader bf = new BufferedReader(new FileReader(args[i] + ".tmp"));
				// crea un fichero nuevo con el nombre original
				BufferedWriter bw = new BufferedWriter(new FileWriter(args[i]));
				String linea = "";
				while (linea != null) {
					linea = bf.readLine();
					if (linea != null) {
						// cambia ; por nada
						linea = linea.replace(";", "");
						// poner en mayúsculas
						linea = linea.replace("import", "IMPORT");
						linea = linea.replace("public", "PUBLIC");
						linea = linea.replace("class", "CLASS");
						linea = linea.replace("static", "STATIC");
						linea = linea.replace("try", "TRY");
						linea = linea.replace("catch", "CATCH");
						// cambia el tabulador por 2 espacios
						linea = linea.replace("\t", " ");
						bw.write(linea + "\n");
					}
				}
				bf.close();
				bw.close();
				// borra el fichero temporal
				ficheroTemporal.delete();
			} catch (IOException ioe) {
				System.out.println("Se ha producido un error de lectura/escritura");
				System.err.println(ioe.getMessage());
			}
			System.out.println("hecho");
		}
	}
}
