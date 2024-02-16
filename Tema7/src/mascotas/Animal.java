package mascotas;

public class Animal {
	public enum Sexo {MACHO, HEMBRA};
	private Sexo sexo;
	
	public Animal() {
	}

	public Sexo getSexo() {
		return sexo;
	}
}
