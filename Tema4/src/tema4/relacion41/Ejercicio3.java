package tema4.relacion41;

public class Ejercicio3 {

	public static void main(String[] args) {
		Alumno unAlumno;
		unAlumno = new Alumno("Josete", "12345678P", "Ecija", 25, 11, 2003, 0);
		
		System.out.println(unAlumno);
		
		System.out.println("Edad: " + unAlumno.edad());
		
		unAlumno.añadirHoras(6); // Día 1
		unAlumno.añadirHoras(6); // Día 2
		unAlumno.añadirHoras(6); // Día 3
		unAlumno.añadirHoras(6); // Día 4
		unAlumno.añadirHoras(6); // Día 5
		System.out.println("Horas: " + unAlumno.getHorasAsistencia());
		
		unAlumno.quitarHoras(7);
		System.out.println("Horas: " + unAlumno.getHorasAsistencia());
		
		unAlumno.darDeBaja();
		System.out.println(unAlumno);
	}

}
