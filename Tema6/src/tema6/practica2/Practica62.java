package tema6.practica2;

import tema6.practica2.cocina.Receta;
import tema6.practica2.despensa.Ingrediente;

public class Practica62 {

	public static void main(String[] args) {
		Receta unaReceta;
		Ingrediente unIngrediente;

		System.out.println("Creando un ingrediente a mano...");
		unIngrediente = new Ingrediente("e-220", "harina de maíz", 50);
		System.out.println(unIngrediente);
		System.out.println();

		System.out.println("Creando la receta PASTEL con ingredientes al azar...");
		unaReceta = new Receta("PASTEL", 30);

		for (int i = 0; i < 20; i++) {
			unIngrediente = new Ingrediente();
			unaReceta.añadirIngrediente(unIngrediente);
		}

		for (int i = 0; i < unaReceta.getNumeroIngredientes(); i++) {
			System.out.println(unaReceta.getIngrediente(i));
		}

	}

}
