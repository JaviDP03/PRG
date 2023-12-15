package figuras.tridimensionales;

public class Esfera {
	private double x;
	private double y;
	private double z;
	private double radio;

	// Constructor
	public Esfera(double x, double y, double z, double radio) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.radio = radio;
	}

	// toString
	public String toString() {
		return "Esfera [x=" + x + ", y=" + y + ", z=" + z + ", radio=" + radio + "]";
	}

	// Getters y Setters
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	// Método calcularVolumen
	public double calcularVolumen() {
		return (4 / 3) * Math.PI * Math.pow(radio, 3);
	}
}
