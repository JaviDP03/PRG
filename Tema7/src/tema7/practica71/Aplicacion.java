package tema7.practica71;

public class Aplicacion {

	public static void main(String[] args) {
		Camiseta unaCamiseta = new Camiseta(50, "Roja", "Algodón", 8239741, 12.45, false);
		Pantalon unPantalon = new Pantalon(42, "Marino", "Algodón", 654632, 10.20, true);
		Gorra unaGorra = new Gorra(12, "Blanco", "Algodón", 345345, 5.99, 8, "Estampado N.Y.");
		Toalla unaToalla = new Toalla(120, 60, "Blanco", "Algodón");
		// Crea aquí un objeto de la nueva subclase de Prenda
		Chaqueta unaChaqueta = new Chaqueta(30, "Negra", "Cuero", 1254637, 20.46, "Fino");

		// Lavar la ropa
		Lavadora.lavarNormal(unaCamiseta, "Micolor");
		System.out.println();
		Lavadora.lavarNormal(unPantalon, "Micolor");
		System.out.println();
		Lavadora.lavarNormal(unaGorra, "Micolor");
		System.out.println();
		Lavadora.lavarExtra(unaToalla, "Ariel");
		System.out.println();
		// Lava aquí el objeto de la nueva subclase de Prenda
		Lavadora.lavarExtra(unaChaqueta, "Norit");
		
		System.out.println();
		
		// Plancha tu ropita aquí
		Plancha.plancharNormal(unaCamiseta, "Agua");
		Plancha.plancharNormal(unPantalon, "Agua");
		Plancha.plancharVapor(unaChaqueta, "Agua");

		// Guardar la ropa
		alArmario(unaCamiseta);
		alArmario(unPantalon);
		alArmario(unaGorra);
		alArmario(unaChaqueta);
	}

	public static void alArmario(Prenda unaPrenda) {
		unaPrenda.doblar();
	}

}
