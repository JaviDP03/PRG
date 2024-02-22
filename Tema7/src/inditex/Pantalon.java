package inditex;

public class Pantalon extends Prenda implements Lavable, Planchable {
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

	@Override
	public int getMaxTempAgua() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean getAdmiteLejia() {
		// TODO Auto-generated method stub
		return false;
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
		return 180;
	}

	@Override
	public boolean getRequiereApresto() {
		return false;
	}

	@Override
	public void rociar(String unProducto) {
		System.out.println("Se ha rociado " + unProducto + " en el pantalón.");
	}

	@Override
	public void quitarArrugas() {
		System.out.println("Se ha pasado la plancha y quitado arrugas del pantalón.");
	}

}
