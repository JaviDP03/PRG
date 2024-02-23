package tema7.practica71;

public class Toalla implements Lavable {
	// Propiedades de la instancia
	private int largo;
	private int ancho;
	private String color;
	private String composicion;

	// Constructor
	public Toalla(int largo, int ancho, String color, String composicion) {
		super();
		this.largo = largo;
		this.ancho = ancho;
		this.color = color;
		this.composicion = composicion;
	}

	// Getters y Setters
	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getComposicion() {
		return composicion;
	}

	public void setComposicion(String composicion) {
		this.composicion = composicion;
	}

	@Override
	public int getMaxTempAgua() {
		// TODO Auto-generated method stub
		return 80;
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
