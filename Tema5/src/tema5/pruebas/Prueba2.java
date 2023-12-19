package tema5.pruebas;

public class Prueba2 {

	public static void main(String[] args) {
		Alumno[] alumnos = new Alumno[5];

		alumnos[0] = new Alumno("Mireya", 16, Alumno.Sexo.MUJER);
		alumnos[1] = new Alumno("Javier Duarte", 17, Alumno.Sexo.VARON);
		alumnos[2] = new Alumno("Gabriel", 18, Alumno.Sexo.VARON);
		alumnos[3] = new Alumno("Pastor", 19, Alumno.Sexo.VARON);
		alumnos[4] = new Alumno("Esteban Alfonso", 20, Alumno.Sexo.VARON);

		for (int i = 0; i < alumnos.length; i++) {
			System.out.println(alumnos[i]);
		}
		
		for (Alumno unAlumno : alumnos) {
			System.out.println(unAlumno);
		}
	}

}
