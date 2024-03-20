package tema9.relacion92;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
	// Propiedades de la instancia
	List<Elemento> listaElementos = new ArrayList<>();

	// Constructor
	public Carrito() {
	}
	
	// Métodos
	public void agrega(Elemento elementoNuevo) {
		listaElementos.add(elementoNuevo);
	}
	
	public int numeroDeElementos() {
		return listaElementos.size();
	}
}
