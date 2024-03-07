package tema8.practica81;

/**
 * Clase Moto implementa la interfaz Serializable porque la hereda de Vehiculo.
 */
public class Moto extends Vehiculo {
	// Propiedades de clase
	private static final long serialVersionUID = 1L;

	// Propiedades de la instancia
	private String modeloCasco;

	// Constructor
	public Moto(String marca, String modelo, int peso, int potenciaCaballos, String modeloCasco) {
		super(marca, modelo, peso, potenciaCaballos);
		this.modeloCasco = modeloCasco;
	}

	// Getters y Setters
	public String getModeloCasco() {
		return modeloCasco;
	}

	public void setModeloCasco(String modeloCasco) {
		this.modeloCasco = modeloCasco;
	}

	@Override
	public String toString() {
		return "Moto [marca=" + getMarca() + ", modelo=" + getModelo() + ", peso=" + getPeso() + ", potenciaCaballos="
				+ getPotenciaCaballos() + ", modeloCasco=" + modeloCasco + "]";
	}

}
