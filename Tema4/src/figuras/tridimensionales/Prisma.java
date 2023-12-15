package figuras.tridimensionales;

public class Prisma {
	// Propiedades de la instancia
	private double x;
	private double y;
	private double z;
	private double lado1;
	private double lado2;
	private double altura;

	// Constructor
	public Prisma(double x, double y, double z, double lado1, double lado2, double altura) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.altura = altura;
	}

	// toString
	public String toString() {
		return "Prisma [x=" + x + ", y=" + y + ", z=" + z + ", lado1=" + lado1 + ", lado2=" + lado2 + ", altura="
				+ altura + "]";
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

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	// Método calcularVolumen
	public double calcularVolumen() {
		return lado1 * lado2 * altura;
	}
}
