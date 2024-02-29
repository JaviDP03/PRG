package tema8.relacion82;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ejercicio3 {

	public static void main(String[] args) {
		String linea;
		String[] lineaSeparada = new String[3];
		String mesCaluroso = null;
		String mesFrio = null;
		int temperaturaAlta = 0;
		int temperaturaBaja = 100;
		
		try {
			BufferedReader entrada = new BufferedReader(new FileReader("/home/usuario/entrada.txt"));

			linea = entrada.readLine();
			
			while (linea != null) {
				lineaSeparada = linea.split(" ");
				
				if (Integer.parseInt(lineaSeparada[1]) < temperaturaBaja) {
					temperaturaBaja = Integer.parseInt(lineaSeparada[1]);
					mesFrio = lineaSeparada[0];
				}
				
				if (Integer.parseInt(lineaSeparada[2]) > temperaturaAlta) {
					temperaturaAlta = Integer.parseInt(lineaSeparada[2]);
					mesCaluroso = lineaSeparada[0];
				} 
				
				linea = entrada.readLine();
			} 
			
			System.out.println("El mes más caluroso es: " + mesCaluroso + " (máxima = " + temperaturaAlta + ")");
			System.out.println("El mes más frío es: " + mesFrio + " (mínima = " + temperaturaBaja + ")");
			
			entrada.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
