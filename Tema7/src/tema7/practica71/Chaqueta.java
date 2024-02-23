package tema7.practica71;

public class Chaqueta extends Prenda implements Lavable, Planchable {
	private String grosor;

	public Chaqueta(int talla, String color, String composicion, int codigo, double precio, String grosor) {
		super(talla, color, composicion, codigo, precio);
		this.setGrosor(grosor);
	}

	// Getters y Setters
	public String getGrosor() {
		return grosor;
	}
	
	public void setGrosor(String grosor) {
		this.grosor = grosor;
	}
	
	@Override
	public int getMaxTempPlancha() {
		// TODO Auto-generated method stub
		return 120;
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
		return 50;
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
