package juegos.habilidad;

public class Marcianito {
	// Propiedades de la instancia
	private static int totalCreados = 0;
	private static int totalConVida = 0;
	private int id;
	private int posicionX;
	private int posicionY;
	private int vida;

	public Marcianito(int posicionX, int posicionY) {
		id = ++totalCreados;
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		vida = 10;
		totalConVida++;
	}

	// toString
	public String toString() {
		return "Marcianito [id=" + id + ", posicionX=" + posicionX + ", posicionY=" + posicionY + ", vida=" + vida
				+ "]";
	}
	
	// Getters y Setters
	
	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}
	
	public int getId() {
		return id;
	}

	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}
	
	public void getPosicion() {
		System.out.println("Posicion X: " + posicionX);
		System.out.println("Posicion Y: " + posicionY);
	}
	
	// Método llamar
	public void llamar(Marcianito unMarcianito1, Marcianito unMarcianito2) {
		System.out.println("Marcianito número " + unMarcianito1.getId() + " llamando a Marcianito número " + unMarcianito2.getId());
	}

	// main
	public static void main(String[] args) {
		Marcianito marcianito1 = new Marcianito(3, 2);
		Marcianito marcianito2 = new Marcianito(7, 1);
		System.out.println(marcianito1);
		System.out.println(marcianito2);
		
		System.out.println("Marcianitos creados: " + totalCreados);
		System.out.println("Marcianitos con vida: " + totalConVida);
		
		marcianito1.getPosicion();
		marcianito1.setPosicionX(8);
		marcianito1.setPosicionX(1);
		marcianito2.getPosicion();
		marcianito2.setPosicionX(2);
		marcianito2.setPosicionY(5);

	}

}
