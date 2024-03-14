package tema9.relacion91;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Map<String, String> palabrasTraducidas = new HashMap<>();
		String[] listaPalabrasEspañol = new String[5];
		String[] listaPalabrasIngles = new String[5];
		int contadorCorrectas = 0;

		palabrasTraducidas.put("hola", "hello");
		palabrasTraducidas.put("mesa", "table");
		palabrasTraducidas.put("lápiz", "pencil");
		palabrasTraducidas.put("agua", "water");
		palabrasTraducidas.put("helicóptero", "helicopter");
		palabrasTraducidas.put("mapa", "map");
		palabrasTraducidas.put("árbol", "tree");
		palabrasTraducidas.put("ordenador", "computer");
		palabrasTraducidas.put("coche", "car");
		palabrasTraducidas.put("moto", "motorbike");
		palabrasTraducidas.put("chocolate", "chocolate");
		palabrasTraducidas.put("leche", "milk");
		palabrasTraducidas.put("texto", "text");
		palabrasTraducidas.put("silla", "chair");
		palabrasTraducidas.put("barba", "beard");
		palabrasTraducidas.put("brazo", "arm");
		palabrasTraducidas.put("cerebro", "brain");
		palabrasTraducidas.put("idioma", "language");
		palabrasTraducidas.put("correr", "run");
		palabrasTraducidas.put("canción", "song");

		System.out.println("Introduce 5 palabras en español:");
		for (int i = 0; i < 5; i++) {
			listaPalabrasEspañol[i] = entrada.nextLine();
		}
		
		System.out.println("Introduce las traducciones en inglés:");
		for (int i = 0; i < 5; i++) {
			listaPalabrasIngles[i] = entrada.nextLine();
		}
		
		for (int i = 0; i < 5; i++) {
			if (listaPalabrasIngles[i].equals(palabrasTraducidas.get(listaPalabrasEspañol[i]))) {
				contadorCorrectas++;
			}
		}
		
		System.out.println("Palabras correctas: " + contadorCorrectas);
		
		entrada.close();
	}

}
