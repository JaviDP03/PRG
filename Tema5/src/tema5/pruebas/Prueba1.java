package tema5.pruebas;

public class Prueba1 {
	enum Sexo {
		VARON, MUJER
	};

	public static void main(String[] args) {
		int[] edades;
		String[] nombres = new String[5];
		Sexo[] sexos = new Sexo[5];

		edades = new int[5];

		edades[0] = 16;
		edades[1] = 17;
		edades[2] = 18;
		edades[3] = 19;
		edades[4] = 20;

		nombres[0] = "Mireya";
		nombres[1] = "Javier Duarte";
		nombres[2] = "Gabriel";
		nombres[3] = "Pastor";
		nombres[4] = "Esteban Alfonso";

		sexos[0] = Sexo.MUJER;
		sexos[1] = Sexo.VARON;
		sexos[2] = Sexo.VARON;
		sexos[3] = Sexo.VARON;
		sexos[4] = Sexo.VARON;

		System.out.println(edades[0]);
		System.out.println(nombres[0]);
		System.out.println(sexos[0]);
	}

}
