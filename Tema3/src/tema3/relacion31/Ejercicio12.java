package tema3.relacion31;

import java.util.Scanner;

public class Ejercicio12 {

	/**
	 * Realiza un minicuestionario con 10 preguntas tipo test sobre los módulos
	 * (asignaturas) que se imparten en el curso. Cada pregunta acertada sumará un
	 * punto. El programa mostrará al final la calificación obtenida. Pásale el
	 * minicuestionario a tus compañeros y pídeles que lo hagan para ver qué tal
	 * andan de conocimientos en las diferentes asignaturas del curso.
	 */
	public static void main(String[] args) {
		// Introducción de variables
		Scanner entrada = new Scanner(System.in);
		int puntos = 0;
		String respuesta;

		// Pregunta 1
		System.out.println("1. ¿Cuál de estas no es una distribución Linux?");
		System.out.println("a) Ubuntu\nb) Fedora\nc) Windows");
		respuesta = entrada.nextLine();
		if (respuesta.equalsIgnoreCase("c")) {
			puntos++;
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		}

		// Pregunta 2
		System.out.println("2. ¿Cuál de estos es considerado como un IDE?");
		System.out.println("a) Eclipse\nb) Notepad++\nc) Bloc de notas");
		respuesta = entrada.nextLine();
		if (respuesta.equalsIgnoreCase("a")) {
			puntos++;
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		}

		// Pregunta 3
		System.out.println("3. ¿Cómo es considerado Java?");
		System.out.println("a) Compilado\nb) Interpretado\nc) Ambos");
		respuesta = entrada.nextLine();
		if (respuesta.equalsIgnoreCase("c")) {
			puntos++;
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		}

		// Pregunta 4
		System.out.println("4. El lenguaje ensamblador es ejecutado directamente por la máquina");
		System.out.println("a) Verdadero\nb) Falso");
		respuesta = entrada.nextLine();
		if (respuesta.equalsIgnoreCase("b")) {
			puntos++;
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		}

		// Pregunta 5
		System.out.println("5. ¿Es una pantalla táctil un dispositivo de entrada?");
		System.out.println("a) Sí\nb) No\nc) Es de entrada y salida");
		respuesta = entrada.nextLine();
		if (respuesta.equalsIgnoreCase("c")) {
			puntos++;
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		}

		// Pregunta 6
		System.out.println("6. ¿Cómo se llama el lenguaje utilizado en bases de datos?");
		System.out.println("a) SQL\nb) Java\nc) Python");
		respuesta = entrada.nextLine();
		if (respuesta.equalsIgnoreCase("a")) {
			puntos++;
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		}

		// Pregunta 7
		System.out.println("7. ¿Cuál es la última versión de HTML?");
		System.out.println("a) HTML 7.2\nb) HTML 5\nc) HTML 4.01");
		respuesta = entrada.nextLine();
		if (respuesta.equalsIgnoreCase("b")) {
			puntos++;
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		}

		// Pregunta 8
		System.out.println("8. En XML, las etiquetas pueden empezar por un número (1, 2 ,3...)");
		System.out.println("a) Verdadero\nb) Falso");
		respuesta = entrada.nextLine();
		if (respuesta.equalsIgnoreCase("b")) {
			puntos++;
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		}

		// Pregunta 9
		System.out.println("9. Las unidades SSD son mucho más rápidas que las HDD");
		System.out.println("a) Verdadero\nb) Falso");
		respuesta = entrada.nextLine();
		if (respuesta.equalsIgnoreCase("a")) {
			puntos++;
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		}
		
		// Pregunta 10
		System.out.println("10. ¿Cuál de los siguientes en un programa de virtualización?");
		System.out.println("a) VirtualBox\nb) LibreOffice\nc) Firefox");
		respuesta = entrada.nextLine();
		if (respuesta.equalsIgnoreCase("a")) {
			puntos++;
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		}
		
		// Resultado
		System.out.printf("Puntuación: %d/10\n", puntos);
		
		// Liberación del scanner
		entrada.close();
	}

}