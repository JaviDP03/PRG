package tema7.practica71;

public class Chistera extends Sombrero {
	private int alturaCopa;

	// Constructor
	public Chistera(int talla, String color, String composicion, int codigo, double precio, int anchoAla,
			int alturaCopa) {
		super(talla, color, composicion, codigo, precio, anchoAla);

		this.alturaCopa = alturaCopa;
	}

	// Getter
	public int getAlturaCopa() {
		return alturaCopa;
	}

}
