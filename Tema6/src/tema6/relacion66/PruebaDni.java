package tema6.relacion66;

public class PruebaDni {

	public static void main(String[] args) {
		Dni unDni;
		unDni = new Dni();
		// unDni.setNumero(-1);
		unDni.setNumero(123456789);
		unDni.setDni("12345678X");
		// unDni.setDni("2345678X");
		unDni.setNumero(12345678);
		System.out.println(unDni.getNumero());
		System.out.println(unDni.getDni());
	}

}
