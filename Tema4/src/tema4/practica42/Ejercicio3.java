package tema4.practica42;

public class Ejercicio3 {

	public static void main(String[] args) {
		Luchemon l1 = new Luchemon("Delfinder", Luchemon.Tipo.AGUA, 10, 80);
		Luchemon l2 = new Luchemon("Fogachu", Luchemon.Tipo.FUEGO, 80, 10);
		Luchemon l3 = new Luchemon("Amigachu", Luchemon.Tipo.TIERRA, 30, 50);
		Luchemon l4 = new Luchemon("Gorrionder", Luchemon.Tipo.AIRE, 50, 30);

		System.out.println("Primera batalla...");
		while (!l1.estaDerrotado() && !l2.estaDerrotado()) {
			l1.lucharCon(l2);
		}
		System.out.println(l1);
		System.out.println(l2);

		System.out.println("\nSegunda batalla...");
		while (!l3.estaDerrotado() && !l4.estaDerrotado()) {
			l3.lucharCon(l4);
		}
		System.out.println(l1);
		System.out.println(l2);
	}

}
