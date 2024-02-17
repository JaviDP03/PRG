package tema6.practica2.despensa;

import tema6.practica2.utilidades.Generador;
/**
 * Clase Ingrediente que contiene información acerca de distintos ingredientes.
 */
public class Ingrediente {
	// Propiedades de la instancia
	private String codigo;
	private String nombre;
	private int peso;

	// Constructores
	public Ingrediente() {
		codigo = Generador.nuevoCodigo();
		nombre = Generador.nuevoNombre();
		peso = Generador.nuevoPeso();

		codigo = normalizar(codigo);
		nombre = normalizar(nombre);
	}

	public Ingrediente(String nombre) {
		codigo = Generador.nuevoCodigo();
		this.nombre = nombre;
		peso = Generador.nuevoPeso();

		codigo = normalizar(codigo);
		this.nombre = normalizar(this.nombre);
	}

	public Ingrediente(String codigo, String nombre, int peso) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.peso = peso;

		this.codigo = normalizar(this.codigo);
		this.nombre = normalizar(this.nombre);
	}

	public Ingrediente(Ingrediente otroIngrediente) {
		codigo = otroIngrediente.codigo;
		nombre = otroIngrediente.nombre;
		peso = otroIngrediente.peso;

		this.codigo = normalizar(this.codigo);
		this.nombre = normalizar(this.nombre);
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;

		this.nombre = normalizar(this.nombre);
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	// toString
	public String toString() {
		return String.format("%s - %s (%d)", codigo, nombre, peso);
	}

	/**
	 * Método que normaliza un string, haciendo la primera letra mayúscula y el resto minúscula.
	 * @param cadenaANormalizar
	 * @return
	 */
	private static String normalizar(String cadenaANormalizar) {
		return cadenaANormalizar.substring(0, 1).toUpperCase() + cadenaANormalizar.substring(1);
	}

}
