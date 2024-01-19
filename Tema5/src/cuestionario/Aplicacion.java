package cuestionario;

import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		Cuestionario unCuestionario;
		Pregunta unaPregunta;
		// Crear un cuestionario de 4 preguntas
		unCuestionario = new Cuestionario(4);
		// Crear preguntas una a una y añadirlas al cuestionario
		unaPregunta = new Pregunta("¿Cómo se llama la estrella del sistema solar?", "Sol");
		unCuestionario.añadirPregunta(unaPregunta, 2.5);
		unaPregunta = new Pregunta("¿Cuál es la raíz cuadrada de 25?", "5");
		unCuestionario.añadirPregunta(unaPregunta, 2.5);
		unaPregunta = new Pregunta("¿Cuál es la estación más fría del año?", "Invierno");
		unCuestionario.añadirPregunta(unaPregunta, 2.5);
		unaPregunta = new Pregunta("La guitarra española es un instrumento, ¿de qué tipo?", "Cuerda");
		unCuestionario.añadirPregunta(unaPregunta, 2.5);
		// Evaluar cuestionario
		evaluar(unCuestionario);
	}

	static void evaluar(Cuestionario c) {
		Scanner teclado = new Scanner(System.in);
		double puntuacionIndividual, puntuacionTotal;
		int numeroPreguntas;
		String respuestaUsuario;
		numeroPreguntas = c.getNumeroPreguntas();
		puntuacionTotal = 0;
		for (int i = 0; i < numeroPreguntas; i++) {
			System.out.println(c.getPregunta(i));
			respuestaUsuario = teclado.nextLine();
			puntuacionIndividual = c.corregirPregunta(i, respuestaUsuario);
			puntuacionTotal += puntuacionIndividual;
			if (puntuacionIndividual > 0)
				System.out.printf("Respuesta correcta: +%.2f\n\n", puntuacionIndividual);
			else
				System.out.printf("Respuesta incorrecta\n\n");
		}
		System.out.println("---");
		System.out.println("Cuestionario finalizado.");
		System.out.printf("Has obtenido un total de %.2f puntos", puntuacionTotal);

		teclado.close();
	}

}
