package tema8.relacion82;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDate;

public class Ejercicio5 {

	public static void main(String[] args) {
		Alumno[] listaAlumnos = new Alumno[3];
		listaAlumnos[0] = new Alumno("Pepe", "Muñoz Pérez", LocalDate.of(2001, 12, 01));
		listaAlumnos[1] = new Alumno("Jesús", "Rodríguez García", LocalDate.of(1999, 07, 25));
		listaAlumnos[2] = new Alumno("Paco", "Díaz López", LocalDate.of(1993, 03, 13));

		try {
			BufferedWriter salida = new BufferedWriter(new FileWriter("/home/usuario/salida.txt"));

			for (int i = 0; i < listaAlumnos.length; i++) {
				salida.write(listaAlumnos[i].getNombre() + "," + listaAlumnos[i].getApellidos() + ","
						+ listaAlumnos[i].getFechaNacimiento() + "\n");
			}

			salida.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class Alumno {
	// Propiedades de la instancia
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;

	// Constructor
	public Alumno(String nombre, String apellidos, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

}
