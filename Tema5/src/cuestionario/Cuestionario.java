package cuestionario;

public class Cuestionario {
	// Propiedades de la instancia
	private Pregunta[] listaPreguntas;
	private double[] listaPuntuaciones;
	private int numeroPreguntas;

	/**
	 * Constructor
	 * 
	 * @param maxPreguntas
	 */
	public Cuestionario(int maxPreguntas) {
		listaPreguntas = new Pregunta[maxPreguntas];
		listaPuntuaciones = new double[maxPreguntas];
		numeroPreguntas = 0;
	}

	/**
	 * Añade una nueva pregunta al cuestionario y le asigna una puntuación.
	 * 
	 * @param nuevaPregunta es la pregunta que se va a añadir
	 * @param puntuacion    indica los puntos que vale la pregunta
	 */
	public void añadirPregunta(Pregunta nuevaPregunta, double puntuacion) {
		boolean estaLLeno = true;
		int posicion = 0;

		for (int i = 0; i < listaPreguntas.length; i++) {
			if (listaPreguntas[i] == null) {
				estaLLeno = false;
				posicion = i;
				break;
			}
		}

		if (estaLLeno) {
			;
		} else {
			listaPreguntas[posicion] = nuevaPregunta;
			listaPuntuaciones[posicion] = puntuacion;
			numeroPreguntas++;
		}
	}

	/**
	 * Permite conocer el número total de preguntas que contiene un cuestionario.
	 * 
	 * @return the numeroPreguntas devuelve un número >= 0
	 */
	public int getNumeroPreguntas() {
		return numeroPreguntas;
	}

	/**
	 * Permite conocer el enunciado de una pregunta del cuestionario.
	 * 
	 * @param indice
	 * @return enunciado
	 */
	public String getPregunta(int indice) {
		if (indice < 0 || indice >= listaPreguntas.length) {
			return "No existe";
		} else {
			return listaPreguntas[indice].getEnunciado();
		}
	}

	public double corregirPregunta(int indice, String respuestaUsuario) {
		if (indice < 0 || indice >= listaPreguntas.length) {
			return 0;
		} else {
			if (listaPreguntas[indice].comprobarRespuesta(respuestaUsuario)) {
				return listaPuntuaciones[indice];
			} else {
				return 0;
			}
		}
	}

}
