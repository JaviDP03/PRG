package tema9.ejemplos;

import java.util.ArrayList;
import java.util.List;

public class EjemploList {

	public static void main(String[] args) {
		List<String> listaNombres = new ArrayList<>();
		
		listaNombres.add("Pepe");
		listaNombres.add("Manuel");
		listaNombres.add("Laura");
		
//		listaNombres.remove("Manuel");
//		listaNombres.add(1, "Manolo");
		listaNombres.set(1, "Manolo");
		
		listaNombres.removeIf(nombre -> nombre.contains("a"));
		
		for (String nombre : listaNombres) {
			System.out.println(nombre);
		}
	}

}
