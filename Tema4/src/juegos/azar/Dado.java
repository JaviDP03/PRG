package juegos.azar;

public class Dado {
	// Propiedades de la instancia
	private int puntuacion;

	// Constructor
	public Dado() {
		puntuacion = (int) (Math.random() * 6) + 1;
	}

	// Getter
	public int getPuntuacion() {
		return puntuacion;
	}

	// toString
	public String toString() {
		return "Dado [puntuacion=" + puntuacion + "]";
	}
	
	// Método lanzar
	public void lanzar() {
		puntuacion = (int) (Math.random() * 6) + 1;
	}
	
	// main
	public static void main(String[] args) {
		Dado unDado = new Dado();
		
		System.out.println(unDado.getPuntuacion());
		unDado.lanzar();
		System.out.println(unDado.getPuntuacion());
		
		unDado.lanzar();
		System.out.println(unDado.getPuntuacion());
		
		unDado.lanzar();
		System.out.println(unDado.getPuntuacion());
	}
}