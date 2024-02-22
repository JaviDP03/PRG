package tema8.relacion81;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ejercicio6 {

	public static void main(String[] args) {
		String linea;
		int numeroLinea;
		int numeroMayor = 0;
		int numeroMenor = 100;
		int mediaNumeros = 0;
		int sumaNumeros = 0;
		try {
			BufferedReader entrada = new BufferedReader(new FileReader("/home/usuario/salida.txt"));

			linea = entrada.readLine();
			numeroLinea = Integer.parseInt(linea);
			while (linea != null || linea != "") {
				if (numeroLinea > numeroMayor) {
					numeroMayor = numeroLinea;
				}

				if (numeroLinea < numeroMenor) {
					numeroMenor = numeroLinea;
				}

				sumaNumeros += numeroLinea;

				linea = entrada.readLine();
				numeroLinea = Integer.parseInt(linea);
			}
			entrada.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
		
		mediaNumeros = sumaNumeros / 100;

		System.out.println(numeroMayor);
		System.out.println(numeroMenor);
		System.out.println(mediaNumeros);
		System.out.println(sumaNumeros);
	}

}
