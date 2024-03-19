package tema9.ejemplos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PruebaOrden {

	public static void main(String[] args) {
		List<Persona> listaPersonas = new ArrayList<>();

		listaPersonas.add(new Persona("Pepe", "11110000A", 21));
		listaPersonas.add(new Persona("Manué", "22220000B", 19));
		listaPersonas.add(new Persona("Jaime", "33330000C", 20));
		listaPersonas.add(new Persona("Sullivan", "44440000D", 18));
		
		System.out.println("Antes de ordenar...");
		for (Persona persona : listaPersonas) {
			System.out.println(persona);
		}
		
		// Orden natural (por defecto)
//		listaPersonas.sort(null);
//		Collections.sort(listaPersonas);
		
		// Orden alternativo
//		ComparadorPersonasPorNombre comparador = new ComparadorPersonasPorNombre();
//		listaPersonas.sort(comparador);
		listaPersonas.sort(new Persona.ComparadorNombre());
		listaPersonas.sort(Collections.reverseOrder(new Persona.ComparadorNombre()));
//		Collections.reverse(listaPersonas);
		
		System.out.println("\nDespués de ordenar...");
		for (Persona persona : listaPersonas) {
			System.out.println(persona);
		}
	}

}
