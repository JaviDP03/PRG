package tema4.practica42;

/**
 * Simulación del funcionamiento de una tarjeta SIM para un teléfono móvil.
 */
public class TarjetaSim {
	// Propiedades de la instancia
	private int numeroTelefono;
	private int pinSecreto;
	private int numeroMaximoIntentos;
	private int numeroIntentos;

	// Constructor
	public TarjetaSim(int numeroTelefono, int pinSecreto, int numeroMaximoIntentos) {
		this.numeroTelefono = numeroTelefono;
		this.pinSecreto = pinSecreto;
		this.numeroMaximoIntentos = numeroMaximoIntentos;
		numeroIntentos = 0;
	}

	// Getter
	public int getIntentosDisponibles() {
		return numeroIntentos;
	}

	// Método estaBloqueada
	public boolean estaBloqueada() {
		return numeroIntentos == numeroMaximoIntentos;
	}

	// Método introducirPin
	public void introducirPin(int numeroPin) {
		if (estaBloqueada()) {
			System.out.println("ERROR: SIM bloqueada");
		} else {
			if (numeroPin == pinSecreto) {
				System.out.println("SIM del teléfono " + numeroTelefono + " utilizable");
			} else {
				System.out.println("ERROR: PIN incorrecto. Quedan ");
			}
		}
	}
}
