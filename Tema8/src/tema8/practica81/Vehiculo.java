package tema8.practica81;

public class Vehiculo {
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

	// toString
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", peso=" + peso + ", potenciaCaballos="
				+ potenciaCaballos + "]";
	}
	
}
