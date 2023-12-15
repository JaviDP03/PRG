package figuras.planas;

public class Circulo {
	// Propiedades de la instancia
	private double radio;
	private double x;
	private double y;
	
	// Constructor
	public Circulo(double radio, double x, double y) {
		this.radio = radio;
		this.x = x;
		this.y = y;
	}

	// toString
	public String toString() {
		return "Circulo [radio=" + radio + ", x=" + x + ", y=" + y + "]";
	}

	// Getters y Setters
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

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
	
	// Método calcularArea
	public double calcularArea() {
		return Math.PI*Math.pow(radio, 2);
	}
}
