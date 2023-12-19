package tema5.pruebas;

public class Prueba1b {
	enum Sexo {
		VARON, MUJER
	};

	public static void main(String[] args) {
		int[] edades = { 16, 17, 18, 19, 20 };
		String[] nombres = { "Mireya", "Javier Duarte", "Gabriel", "Pastor", "Esteban Alfonso" };
		Sexo[] sexos = { Sexo.MUJER, Sexo.VARON, Sexo.VARON, Sexo.VARON, Sexo.VARON };

		for (int i = 0; i < edades.length; i++) {
			System.out.println(edades[i] + ", " + nombres[i] + ", " + sexos[i]);
		}
		
		for (String unNombre : nombres) {
			System.out.println(unNombre);
		}
	}

}
