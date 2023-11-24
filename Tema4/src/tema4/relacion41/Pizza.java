package tema4.relacion41;

public class Pizza {
	// Propiedades de la instancia
	private String tamaño;
	private String tipo;

	private enum Estado {
		pedida, servida
	};

	private Estado estado;

	// Métodos de la instancia
	/**
	 * @param tamaño
	 * @param tipo
	 * @param estado
	 */
	public Pizza(String tamaño, String tipo) {
		this.tamaño = tamaño;
		this.tipo = tipo;
		this.estado = Estado.pedida;
	}

	public String toString() {
		return "Pizza " + tipo + " " + tamaño + ", " + estado;
	}

	/**
	 * Si la pizza no se ha servido, se marca como servida. En caso de ya estar
	 * servida lo informa con un mensaje
	 */
	public void sirve() {
		if (estado == Estado.pedida) {
			estado = Estado.servida;
		} else {
			System.out.println("La pizza " + tipo + " " + tamaño + " ya se ha servido");
		}
	}
}
