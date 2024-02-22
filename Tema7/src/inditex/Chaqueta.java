package inditex;

public class Chaqueta extends Prenda implements Lavable, Planchable {

	public Chaqueta(int talla, String color, String composicion, int codigo, double precio) {
		super(talla, color, composicion, codigo, precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getMaxTempPlancha() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean getRequiereApresto() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void rociar(String unProducto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quitarArrugas() {
		// TODO Auto-generated method stub
		
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
