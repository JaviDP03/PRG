package tema6.practica2.despensa;

import tema6.practica2.utilidades.Generador;

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
	}

	public Ingrediente(String codigo, String nombre, int peso) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.peso = peso;
	}
	
	public Ingrediente(Ingrediente otroIngrediente) {
		codigo = otroIngrediente.codigo;
		nombre = otroIngrediente.nombre;
		peso = otroIngrediente.peso;
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	
	// Métodos
	private static String normalizar(String cadenaANormalizar) {
		return cadenaANormalizar.substring(0, 1).toUpperCase() + cadenaANormalizar.substring(1);
	}
	
}
