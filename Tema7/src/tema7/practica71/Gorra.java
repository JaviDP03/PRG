package tema7.practica71;

public class Gorra extends Sombrero {
	private String decoracion;

	// Constructor
	public Gorra(int talla, String color, String composicion, int codigo, double precio, int anchoAla,
			String decoracion) {
		super(talla, color, composicion, codigo, precio, anchoAla);

		this.decoracion = decoracion;
	}

	// Getter
	public String getDecoracion() {
		return decoracion;
	}

}
