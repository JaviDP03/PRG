package inditex;

public class Tienda {
	public static void main(String[] args) {
		Prenda[] listaPrendas = new Prenda[4];

		listaPrendas[0] = new Camiseta(42, "Roja", "100% Algodón", 2, 21.50, false);
		listaPrendas[1] = new Pantalon(42, "Gris", "100% Algodón", 3, 22.50, false);
		listaPrendas[2] = new Chistera(42, "Negro", "100% Algodón", 4, 23.50, 6, 10);
		listaPrendas[3] = new Gorra(42, "Negro", "100% Algodón", 4, 23.50, 6, "I LOVE NY");

		for (Prenda prenda : listaPrendas) {
			prenda.doblar();
		}
	}
}