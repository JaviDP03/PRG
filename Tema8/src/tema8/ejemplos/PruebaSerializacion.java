package tema8.ejemplos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.Arrays;

public class PruebaSerializacion {

	public static void main(String[] args) {
		Alumno[] listaAlumnos = new Alumno[5];

		listaAlumnos[0] = new Alumno("Antonio", "López", LocalDate.of(2004, 10, 1));
		listaAlumnos[1] = new Alumno("Pepe", "López", LocalDate.of(2004, 10, 2));
		listaAlumnos[2] = new Alumno("María", "López", LocalDate.of(2004, 10, 3));
		listaAlumnos[3] = new Alumno("Ana", "López", LocalDate.of(2004, 10, 4));
		listaAlumnos[4] = new Alumno("Raúl", "López", LocalDate.of(2004, 10, 5));

		try {
			ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("/home/usuario/objetos.bin"));

			salida.writeInt(5);
			salida.writeDouble(5.5);
			salida.writeObject("Hola");
			salida.writeObject(listaAlumnos);
			
			salida.close();

			ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("/home/usuario/objetos.bin"));

			// Tengo que leer en el mismo orden exacto en el que he escrito antes
			int entero = entrada.readInt();
			System.out.println(entero);

			double real = entrada.readDouble();
			System.out.println(real);

			String cadena;
			try {
				cadena = (String) entrada.readObject();
				System.out.println(cadena);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

			try {
				listaAlumnos = null;
				listaAlumnos = (Alumno[]) entrada.readObject();
				System.out.println(Arrays.toString(listaAlumnos));
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			entrada.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
