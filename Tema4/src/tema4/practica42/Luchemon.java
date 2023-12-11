package tema4.practica42;

/**
 * Clase que define a unos seres llamados Luchemon que tienen una serie de
 * características
 */
public class Luchemon {
	// Propiedades de la instancia
	private String nombre;

	enum Tipo {
		AGUA, FUEGO, TIERRA, AIRE
	};

	private int fuerzaAtaque;
	private int precisionAtaque;
	private Tipo tipoLuchemon;
	private int nivelEnergia;

	// Constructor
	public Luchemon(String nombre, Tipo tipoLuchemon, int fuerzaAtaque, int precisionAtaque) {
		this.nombre = nombre;
		this.fuerzaAtaque = fuerzaAtaque;
		this.precisionAtaque = precisionAtaque;
		this.tipoLuchemon = tipoLuchemon;
		this.nivelEnergia = 100;
	}

	// Método getNivelAtaque
	public int getNivelAtaque() {
		int resultado = (int) (Math.random() * fuerzaAtaque) + precisionAtaque;
		return resultado;
	}

	// Método getNivelRefuerzoContra
	public int getNivelRefuerzoContra(Tipo tipoAdversario) {
		int resultado = 0;

		if (tipoLuchemon == Tipo.AGUA) {
			switch (tipoAdversario) {
			case FUEGO:
				resultado = 10;
				break;
			case TIERRA:
				resultado = 0;
				break;
			case AIRE:
				resultado = 0;
				break;
			}
		} else if (tipoLuchemon == Tipo.FUEGO) {
			switch (tipoAdversario) {
			case AGUA:
				resultado = 0;
				break;
			case TIERRA:
				resultado = 10;
				break;
			case AIRE:
				resultado = 0;
				break;
			}
		} else if (tipoLuchemon == Tipo.TIERRA) {
			switch (tipoAdversario) {
			case AGUA:
				resultado = 0;
				break;
			case FUEGO:
				resultado = 0;
				break;
			case AIRE:
				resultado = 10;
				break;
			}
		} else if (tipoLuchemon == Tipo.AIRE) {
			switch (tipoAdversario) {
			case AGUA:
				resultado = 10;
				break;
			case FUEGO:
				resultado = 0;
				break;
			case TIERRA:
				resultado = 0;
				break;
			}
		}

		return resultado;
	}

	// Método disminuirNivelEnergia
	public void disminuirNivelEnergia(int cantidad) {
		if (cantidad > nivelEnergia) {
			nivelEnergia -= nivelEnergia;
		} else {
			nivelEnergia -= cantidad;
		}
	}

	// Método lucharCon
	public void lucharCon(Luchemon otroLuchemon) {
		int nivelPropio = getNivelAtaque();
		int nivelOtro = otroLuchemon.getNivelAtaque();
		System.out.println(nombre + " ataca con nivel " + nivelPropio + " y " + otroLuchemon.nombre
				+ " responde con nivel " + nivelOtro);
		if (nivelPropio > nivelOtro) {
			otroLuchemon.disminuirNivelEnergia(nivelPropio - nivelOtro);
		} else {
			disminuirNivelEnergia(nivelOtro - nivelPropio);
		}
	}

	// Método estaDerrotado
	public boolean estaDerrotado() {
		if (nivelEnergia == 0) {
			System.out.println(nombre + " ha sido derrotado");
		}

		return nivelEnergia == 0;
	}

	// toString
	public String toString() {
		return "Luchemon [nombre=" + nombre + ", tipo=" + tipoLuchemon + ", fuerzaAtaque=" + fuerzaAtaque
				+ ", precisionAtaque=" + precisionAtaque + ", nivelEnergia=" + nivelEnergia + "]";
	}

}
