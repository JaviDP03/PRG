package tema8.practica81;

import java.io.Serializable;

/**
 * Clase Vehiculo que implementa la interfaz Serializable.
 */
public class Vehiculo implements Serializable {
	// Propiedades de clase
	private static int numeroVehiculos;
	private static final long serialVersionUID = 1L;

	// Propiedades de la instancia
	private String marca;
	private String modelo;
	private int peso;
	private int potenciaCaballos;

	// Constructor
	public Vehiculo(String marca, String modelo, int peso, int potenciaCaballos) {
		this.marca = marca;
		this.modelo = modelo;
		this.peso = peso;
		this.potenciaCaballos = potenciaCaballos;
		numeroVehiculos++;
	}

	// Getters y Setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getPotenciaCaballos() {
		return potenciaCaballos;
	}

	public void setPotenciaCaballos(int potenciaCaballos) {
		this.potenciaCaballos = potenciaCaballos;
	}

	public static int getNumeroVehiculos() {
		return numeroVehiculos;
	}

	// toString
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", peso=" + peso + ", potenciaCaballos="
				+ potenciaCaballos + "]";
	}

}
