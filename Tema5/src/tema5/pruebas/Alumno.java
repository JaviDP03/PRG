package tema5.pruebas;

public class Alumno {
	enum Sexo {
		VARON, MUJER
	};

	private String nombre;
	private int edad;
	private Sexo sexo;

	public Alumno(String nombre, int edad, Sexo sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + "]";
	}

}
