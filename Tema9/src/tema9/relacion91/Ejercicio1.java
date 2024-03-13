package tema9.relacion91;

import java.util.ArrayList;
import java.util.List;

/**
 * Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación,
 * muestra esos nombres por pantalla. Utiliza para ello un bucle for que recorra
 * todo el ArrayList sin usar ningún índice.
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		List<String> listaAlumnos = new ArrayList<>();

		listaAlumnos.add("Manuel");
		listaAlumnos.add("Mireya");
		listaAlumnos.add("Javier");
		listaAlumnos.add("Nerea");
		listaAlumnos.add("Iván");
		listaAlumnos.add("Rubén");

		for (String alumno : listaAlumnos) {
			System.out.println(alumno);
		}
	}

}
