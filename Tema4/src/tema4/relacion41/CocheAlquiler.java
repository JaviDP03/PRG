package tema4.relacion41;

public class CocheAlquiler {
	// Propiedades de instacia
	private String matricula;
	private String marca;
	private String modelo;
	private int numeroPuertas;
	private String color;
	private double tarifa;
	private boolean disponible;

	// Métodos de instancia
	/**
	 * Constructor de CocheAlquiler
	 * @param matricula
	 * @param marca
	 * @param modelo
	 * @param numeroPuertas
	 * @param color
	 * @param tarifa
	 * @param disponible
	 */
	public CocheAlquiler(String matricula, String marca, String modelo, int numeroPuertas, String color, double tarifa,
			String disponibleTexto) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.numeroPuertas = numeroPuertas;
		this.color = color;
		this.tarifa = tarifa;
		this.disponible = disponibleTexto.equalsIgnoreCase("Si");
	}

	/**
	 * Devuelve una representación como cadena del CocheAlquiler
	 */
	public String toString() {
		String disponibleTexto = disponible ? "Si" : "No";
		return "CocheAlquiler [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", numeroPuertas="
				+ numeroPuertas + ", color=" + color + ", tarifa=" + tarifa + ", disponible=" + disponibleTexto + "]";
	}

	/**
	 * Getter para matricula
	 * @return matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * Setter para matricula
	 * @param matricula
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * Getter para marca
	 * @return marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * Setter para marca
	 * @param marca
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * Getter para modelo
	 * @return modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * Setter para modelo
	 * @param modelo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * Getter para numeroPuertas
	 * @return numeroPuertas
	 */
	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	/**
	 * Setter para numeroPuertas
	 * @param numeroPuertas
	 */
	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	/**
	 * Getter para color
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Setter para color
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Getter para tarifa
	 * @return tarifa
	 */
	public double getTarifa() {
		return tarifa;
	}

	/**
	 * Setter para tarifa
	 * @param tarifa
	 */
	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	/**
	 * Getter para disponible
	 * @return disponible
	 */
	public String estaDisponible() {
		return (disponible ? "Si" : "No");
	}

	/**
	 * Setter para disponible
	 * @param disponible
	 */
	public void setDisponible(String disponibleTexto) {
		this.disponible = disponibleTexto.equalsIgnoreCase("Si");
	}
	
	

}
