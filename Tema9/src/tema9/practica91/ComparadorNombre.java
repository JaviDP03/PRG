package tema9.practica91;

import java.util.Comparator;

/**
 * Clase ComparadorNombre que compara los nombres de los productos para poder
 * ordenarlos en la lista.
 */
public class ComparadorNombre implements Comparator<Producto> {
	public int compare(Producto o1, Producto o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}
}
