package tema6.practica2.cocina;

import tema6.practica2.despensa.Ingrediente;
/**
 * Clase recera que contiene información acerca de un conjunto de ingredientes.
 */
public class Receta {
	// Propiedades de la instancia
	private String nombre;
	private Ingrediente[] listaIngredientes;

	// Constructor
	public Receta(String nombreReceta, int capacidadMaxima) {
		nombre = nombreReceta;
		listaIngredientes = new Ingrediente[capacidadMaxima];
	}

	/**
	 * Método que añade un ingrediente a la lista a través de un parámetro.
	 * @param unIngrediente
	 */
	public void añadirIngrediente(Ingrediente unIngrediente) {
		for (int i = 0; i < listaIngredientes.length; i++) {
			if (listaIngredientes[i] == null) {
				listaIngredientes[i] = unIngrediente;
				break;
			}
		}
	}

	// Getters y Setters
	public String getNombreReceta() {
		return nombre;
	}

	public void setNombreReceta(String nombreReceta) {
		nombre = nombreReceta;
	}

	public int getCapacidadReceta() {
		return listaIngredientes.length;
	}

	public int getNumeroIngredientes() {
		for (int i = 0; i < listaIngredientes.length; i++) {
			if (listaIngredientes[i] == null) {
				return i;
			}
		}

		return listaIngredientes.length;
	}

	public Ingrediente getIngrediente(int indice) {
		if (indice > listaIngredientes.length) {
			return null;
		}

		return listaIngredientes[indice];
	}

}
