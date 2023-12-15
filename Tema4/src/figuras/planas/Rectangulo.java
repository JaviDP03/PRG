package figuras.planas;

public class Rectangulo {
	private double x;
	private double y;
	private double base;
	private double altura;

	// Constructor
	public Rectangulo(double x, double y, double base, double altura) {
		this.x = x;
		this.y = y;
		this.base = base;
		this.altura = altura;
	}

	// toString
	public String toString() {
		return "Rectangulo [x=" + x + ", y=" + y + ", base=" + base + ", altura=" + altura + "]";
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

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	// Método calcularArea
	public double calcularArea() {
		return base * altura;
	}
}
