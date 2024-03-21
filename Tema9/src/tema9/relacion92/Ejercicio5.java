package tema9.relacion92;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {
	private static Alumno procesarLinea(String linea) {
		Alumno unAlumno;
		String[] partes = linea.split(";");

		try {
			unAlumno = new Alumno();

			unAlumno.setNombre(partes[0]);
			unAlumno.setApellidos(partes[1]);
			unAlumno.setFechaNacimiento(LocalDate.parse(partes[2]));
			unAlumno.setDni(partes[3]);
		} catch (Exception e) {
			unAlumno = null;
		}

		return unAlumno;
	}

	public static void main(String[] args) {
		try {
			BufferedReader entrada = new BufferedReader(new FileReader("/home/usuario/alumnos.txt"));

			String linea;
			Alumno unAlumno;
			List<Alumno> listaAlumnos = new ArrayList<>();

			while ((linea = entrada.readLine()) != null) {
				// System.out.println(linea);
				unAlumno = procesarLinea(linea);

				if (unAlumno != null) {
					listaAlumnos.add(unAlumno);
				}
			}

			entrada.close();

			for (Alumno alumno : listaAlumnos) {
				System.out.println(alumno);
			}
		} catch (FileNotFoundException e) {
			System.err.println("Archivo no encontrado");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
