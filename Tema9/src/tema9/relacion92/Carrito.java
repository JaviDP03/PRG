package tema9.relacion92;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
	// Propiedades de la instancia
	List<Elemento> listaElementos = new ArrayList<>();

	// Constructor
	public Carrito() {
	}

	// toString
	public String toString() {
		StringBuilder carrito = new StringBuilder();
		
		carrito.append("Contenido del carrito\n");
		carrito.append("=====================\n");
		for (Elemento elemento : listaElementos) {
			carrito.append(elemento + "\n");
		}
		
		return carrito.toString();
	}

	// Métodos
	public void agrega(Elemento elementoNuevo) {
		listaElementos.add(elementoNuevo);
	}

	public int numeroDeElementos() {
		return listaElementos.size();
	}

	public double importeTotal() {
		double total = 0;

		for (Elemento elemento : listaElementos) {
			total += elemento.getSubtotal();
		}

		return total;
	}
}
