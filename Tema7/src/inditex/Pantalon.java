package inditex;

public class Pantalon extends Prenda {
	private boolean piernaLarga;

	// Constructor
	public Pantalon(int talla, String color, String composicion, int codigo, double precio, boolean piernaLarga) {
		super(talla, color, composicion, codigo, precio);
		this.piernaLarga = piernaLarga;
	}

	@Override
	public void doblar() {
		// super.doblar();
		System.out.println("Doblando pantalón con el método Seldom Cooper");
	}

	@Override
	public String toString() {
		return "Camiseta [piernaLarga=" + piernaLarga + ", getTalla()=" + getTalla() + ", getColor()=" + getColor()
				+ ", getComposicion()=" + getComposicion() + ", getCodigo()=" + getCodigo() + ", getPrecio()="
				+ getPrecio() + "]";
	}

	// Getter
	public boolean esPiernaLarga() {
		return piernaLarga;
	}

}
