package inditex;

public class Camiseta extends Prenda {
	private boolean mangaLarga;

	// Constructor
	public Camiseta(int talla, String color, String composicion, int codigo, double precio, boolean mangaLarga) {
		super(talla, color, composicion, codigo, precio);
		this.mangaLarga = mangaLarga;
	}

	@Override
	public void doblar() {
		// super.doblar();
		System.out.println("Doblando camiseta con el método Seldom Cooper");
	}

	@Override
	public String toString() {
		return "Camiseta [mangaLarga=" + mangaLarga + ", getTalla()=" + getTalla() + ", getColor()=" + getColor()
				+ ", getComposicion()=" + getComposicion() + ", getCodigo()=" + getCodigo() + ", getPrecio()="
				+ getPrecio() + "]";
	}

	// Getter
	public boolean esMangaLarga() {
		return mangaLarga;
	}

}
