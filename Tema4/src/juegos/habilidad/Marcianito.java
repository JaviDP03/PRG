package juegos.habilidad;

public class Marcianito {
	// Propiedades de la instancia
	private static int totalCreados = 0;
	private static int totalConVida = 0;
	private static int totalDestruidos;
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
		System.out.println("X:" + posicionX + " Y:" + posicionY);
	}

	// Método llamar
	public void llamar(Marcianito unMarcianito) {
		System.out.println("Marcianito número " + getId() + " llamando a Marcianito número " + unMarcianito.getId());
	}

	// Método transferirVida
	public void transferirVida(int cantidad, Marcianito otroMarcianito) {
		if (vida < cantidad) {
			otroMarcianito.vida += vida - (vida - 1);
			vida = vida - (vida - 1);
		} else {
			otroMarcianito.vida += cantidad;
			vida -= cantidad;
		}
	}
	
	// Método recibirDisparo
	public void recibirDisparo() {
		if (vida == 0) {
			;
		} else {
			vida--;
			if (vida == 0) {
				totalConVida--;
				totalDestruidos++;
			}
		}
	}

	// main
	public static void main(String[] args) {
		Marcianito marcianito1 = new Marcianito(3, 2);
		Marcianito marcianito2 = new Marcianito(7, 1);
		System.out.println(marcianito1);
		System.out.println(marcianito2);

		System.out.println("Marcianitos creados: " + totalCreados);
		System.out.println("Marcianitos con vida: " + totalConVida);
		System.out.println("Marcianitos destruidos: " + totalDestruidos);

		marcianito1.getPosicion();
		marcianito1.setPosicionX(8);
		marcianito1.setPosicionX(1);
		marcianito2.getPosicion();
		marcianito2.setPosicionX(2);
		marcianito2.setPosicionY(5);

		marcianito1.llamar(marcianito2);
		
		marcianito1.transferirVida(9, marcianito2);
		
		marcianito1.recibirDisparo();
		
		System.out.println(marcianito1);
		System.out.println(marcianito2);
		
		System.out.println("Marcianitos creados: " + totalCreados);
		System.out.println("Marcianitos con vida: " + totalConVida);
		System.out.println("Marcianitos destruidos: " + totalDestruidos);
	}

}
