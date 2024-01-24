package ejemplos;

class Rectangulo {
	static int numeroDeRectangulos = 0;
	static final double PI = 3.1416;
	
	double x1;
	double y1;
	double x2;
	double y2;
	String nombre;
	String nombreFigura;

	public Rectangulo(double x1, double y1, double x2, double y2, String nombre) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.nombre = nombre;
		nombreFigura = "Rectángulo";
		numeroDeRectangulos++;
	}
	
	
}
