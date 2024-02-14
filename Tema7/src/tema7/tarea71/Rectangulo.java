package tema7.tarea71;

/*
* ----------------------------------------------------------------
* Clase Rectangulo
* ----------------------------------------------------------------
*/
public class Rectangulo {
// Atributos de clase
	private static int numeroDeRectangulos; // Número total de rectángulos creados
	public static final String nombreDeLaFigura = "Rectángulo"; // Nombre de la clase
	public static final double PI = 3.1416; // Constante PI
// Atributos de objeto
	private String nombre; // Nombre del rectángulo
	public double x1, y1; // Vértice inferior izquierdo
	public double x2, y2; // Vértice superior derecho
//--------------------------------------
// Constructores que no asignan nombre
//--------------------------------------

	public Rectangulo() {
		this.x1 = 0.0;
		this.y1 = 0.0;
		this.x2 = 1.0;
		this.y2 = 1.0;
	}

	public Rectangulo(double x1, double y1, double x2, double y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public Rectangulo(double base, double altura) {
		this.x1 = 0.0;
		this.y1 = 0.0;
		this.x2 = base;
		this.y2 = altura;
	}

//-----------------------------------------------------------------
// Constructores que asignan nombre, reutilizando los anteriores
//-----------------------------------------------------------------
	public Rectangulo(String nombre) {
		this();
		this.nombre = nombre;
	}

	public Rectangulo(double x1, double y1, double x2, double y2, String nombre) {
		this(x1, y1, x2, y2);
		this.nombre = nombre;
	}

	public Rectangulo(double base, double altura, String nombre) {
		this(base, altura);
		this.nombre = nombre;
	}

//-------------------------------
// Métodos estáticos (de clase)
//-------------------------------
// Métodos de estáticos públicos
// -----------------------------
// Método obtenerNumeroDeRectangulos
	public static int obtenerNumeroDeRectangulos() {
		return Rectangulo.numeroDeRectangulos;
	}

//-------------------
// Métodos de objeto
//-------------------
//Métodos públicos
//-----------------
// Método getNombre
	public String getNombre() {
		return this.nombre;
	}

// Método setNombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

// Método calcularSuperficie
	public double calcularSuperficie() {
		double area, base, altura;
// Cálculo de la base
		base = this.x2 - this.x1;
// Cálculo de la altura
		altura = this.y2 - this.y1;
// Cálculo del área
		area = base * altura;
// Devolución del valor de retorno
		return area;
	}

// Método calcularPerimetro
	public double calcularPerimetro() {
		double perimetro, base, altura;
// Cálculo de la base
		base = this.x2 - this.x1;
// Cálculo de la altura
		altura = this.y2 - this.y1;
// Cálculo del perímetro
		perimetro = 2 * base + 2 * altura;
// Devolución del valor de retorno
		return perimetro;
	}

// Método desplazar
	public void desplazar(double x, double y) {
// Desplazamiento en el eje X
		this.x1 += x;
		this.x2 += x;
// Desplazamiento en el eje X
		this.y1 += y;
		this.y2 += y;
	}
}