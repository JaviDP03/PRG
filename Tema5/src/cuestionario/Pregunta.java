package cuestionario;

public class Pregunta {
	// Propiedades de la instancia
	private String enunciado;
	private String respuesta;
	
	/**
	 * Constructor
	 * @param enunciado
	 * @param respuesta
	 */
	public Pregunta(String enunciado, String respuesta) {
		super();
		this.enunciado = enunciado;
		this.respuesta = respuesta;
	}
	
	/**
	 * Comprobar la respuesta
	 * @param respuesta
	 * @return respuesta
	 */
	public boolean comprobarRespuesta(String respuesta) {
		return this.respuesta.equalsIgnoreCase(respuesta);
	}

	/**
	 * getEnunciado
	 * @return the enunciado
	 */
	public String getEnunciado() {
		return enunciado;
	}

	/**
	 * toString
	 */
	public String toString() {
		return "Pregunta [enunciado=" + enunciado + ", respuesta=" + respuesta + "]";
	}
	
	
}
