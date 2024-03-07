package tema8.practica81;

/**
 * Clase Coche que implementa la interfaz Serializable porque la hereda de
 * Vehiculo.
 */
public class Coche extends Vehiculo {
	// Propiedades de clase
	private static final long serialVersionUID = 1L;

	// Propiedades de la instancia
	private int diametroVolante;

	// Constructor
	public Coche(String marca, String modelo, int peso, int potenciaCaballos, int diametroVolante) {
		super(marca, modelo, peso, potenciaCaballos);
		this.diametroVolante = diametroVolante;
	}

	// Getters y Setters
	public int getDiametroVolante() {
		return diametroVolante;
	}

	public void setDiametroVolante(int diametroVolante) {
		this.diametroVolante = diametroVolante;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + getMarca() + ", modelo=" + getModelo() + ", peso=" + getPeso() + ", potenciaCaballos="
				+ getPotenciaCaballos() + ", diametroVolante=" + diametroVolante + "]";
	}

}
