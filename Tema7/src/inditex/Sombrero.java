package inditex;

public class Sombrero extends Prenda implements Lavable {
	private int anchoAla;

	public Sombrero(int talla, String color, String composicion, int codigo, double precio, int anchoAla) {
		super(talla, color, composicion, codigo, precio);
		this.anchoAla = anchoAla;
	}

	@Override
	public void doblar() {
		// super.doblar();
		System.out.println("No puedes doblar un sombrero");
	}

	@Override
	public String toString() {
		return "Camiseta [anchoAla=" + anchoAla + ", getTalla()=" + getTalla() + ", getColor()=" + getColor()
				+ ", getComposicion()=" + getComposicion() + ", getCodigo()=" + getCodigo() + ", getPrecio()="
				+ getPrecio() + "]";
	}

	// Getter
	public int getAnchoAla() {
		return anchoAla;
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

}
