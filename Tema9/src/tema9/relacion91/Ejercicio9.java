package tema9.relacion91;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Map<String, String> palabrasTraducidas = new HashMap<>();

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

		System.out.println("Introduce una palabra en español para traducirla al inglés:");
		System.out.println(palabrasTraducidas.get(entrada.nextLine()));
		
		entrada.close();
	}

}
