package juegos.azar;

public class ParejaDados {
	// Propiedades de la instancia
	private Dado dado1;
	private Dado dado2;

	// Constructor
	public ParejaDados() {
		dado1 = new Dado();
		dado2 = new Dado();
	}

	// Getter
	public int getPuntuacion() {
		return dado1.getPuntuacion() + dado2.getPuntuacion();
	}

	// toString
	public String toString() {
		return "ParejaDados [puntuacion=" + dado1 + dado2 + "]";
	}
	
	// Método lanzar
	public void lanzar() {
		dado1.lanzar();
		dado2.lanzar();
	}
	
	// main
	public static void main(String[] args) {
		ParejaDados pareja1 = new ParejaDados();
		ParejaDados pareja2 = new ParejaDados();
		
		System.out.println("Pareja 1: " + pareja1.getPuntuacion());
		System.out.println("Pareja 2: " + pareja2.getPuntuacion());
		
		if (pareja1.getPuntuacion() == pareja2.getPuntuacion()) {
			System.out.println("La puntuación es la misma");
		} else if (pareja1.getPuntuacion() > pareja2.getPuntuacion()) {
			System.out.println("Pareja 1 es mayor que Pareja 2");
		} else {
			System.out.println("Pareja 2 es mayor que Pareja 1");
		}
		
		System.out.println();
		
		pareja1.lanzar();
		pareja2.lanzar();
		
		System.out.println("Pareja 1: " + pareja1.getPuntuacion());
		System.out.println("Pareja 2: " + pareja2.getPuntuacion());
		
		if (pareja1.getPuntuacion() == pareja2.getPuntuacion()) {
			System.out.println("La puntuación es la misma");
		} else if (pareja1.getPuntuacion() > pareja2.getPuntuacion()) {
			System.out.println("Pareja 1 es mayor que Pareja 2");
		} else {
			System.out.println("Pareja 2 es mayor que Pareja 1");
		}
	}
}
