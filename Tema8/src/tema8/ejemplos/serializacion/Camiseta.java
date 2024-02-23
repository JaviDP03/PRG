package tema8.ejemplos.serializacion;

public class Camiseta extends Prenda implements Lavable, Planchable {
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

	@Override
	public int getMaxTempAgua() {
		// TODO Auto-generated method stub
		return 70;
	}

	@Override
	public boolean getAdmiteLejia() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void aplicarProducto(String unProducto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void frotar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enjuagar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getMaxTempPlancha() {
		return 120;
	}

	@Override
	public boolean getRequiereApresto() {
		return true;
	}

	@Override
	public void rociar(String unProducto) {
		System.out.println("Se ha rociado " + unProducto + " en la camiseta.");
	}

	@Override
	public void quitarArrugas() {
		System.out.println("La plancha ha pasado todas las arrugas de la camiseta.");
	}

}
