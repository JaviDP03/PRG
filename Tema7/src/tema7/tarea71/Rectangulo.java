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
	private Punto vertice1; // Vértice inferior izquierdo
	private Punto vertice2; // Vértice superior derecho
//--------------------------------------
// Constructores que no asignan nombre
//--------------------------------------

	public Rectangulo() {
		vertice1 = new Punto(0, 0);
		vertice2 = new Punto(1, 1);
	}

	public Rectangulo(int x1, int y1, int x2, int y2) throws Exception {
		if (x2 <= x1 || y2 <= y1) {
			throw new Exception("El vértice 2 es menor que el vértice 1");
		}
		
		if (x1 > 9 || x2 > 9 || y1 > 9 || y2 > 9) {
			throw new Exception("El rectángulo sale de los límites");
		}
		
		vertice1 = new Punto(x1, y1);
		vertice2 = new Punto(x2, y2);
		
	}

	public Rectangulo(int base, int altura) {
		vertice1 = new Punto(0, 0);
		vertice2 = new Punto(base, altura);
	}

//-----------------------------------------------------------------
// Constructores que asignan nombre, reutilizando los anteriores
//-----------------------------------------------------------------
	public Rectangulo(String nombre) {
		this();
		this.nombre = nombre;
	}

	public Rectangulo(int x1, int y1, int x2, int y2, String nombre) throws Exception {
		this(x1, y1, x2, y2);
		this.nombre = nombre;
	}

	public Rectangulo(int base, int altura, String nombre) {
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
	public int calcularSuperficie() {
		int area, base, altura;
// Cálculo de la base
		base = vertice2.getX() - vertice1.getX();
// Cálculo de la altura
		altura = vertice2.getY() - vertice1.getY();
// Cálculo del área
		area = base * altura;
// Devolución del valor de retorno
		return area;
	}

// Método calcularPerimetro
	public int calcularPerimetro() {
		int perimetro, base, altura;
// Cálculo de la base
		base = vertice2.getX() - vertice1.getX();
// Cálculo de la altura
		altura = vertice2.getY() - vertice1.getY();
// Cálculo del perímetro
		perimetro = 2 * base + 2 * altura;
// Devolución del valor de retorno
		return perimetro;
	}

// Método desplazar
	public void desplazar(int x, int y) {
// Desplazamiento en el eje X
		vertice1.setX(vertice1.getX() + x);
		vertice2.setX(vertice2.getX() + x);
// Desplazamiento en el eje Y
		vertice1.setY(vertice1.getY() + y);
		vertice2.setY(vertice2.getY() + y);
	}

	// toString
	public String toString() {
		int x1 = vertice1.getX();
		int x2 = vertice2.getX();
		int y1 = vertice1.getY();
		int y2 = vertice2.getY();
		char[][] tablaRectangulo = new char[10][10];
		StringBuilder cadena = new StringBuilder();

		for (int i = 0; i < tablaRectangulo.length; i++) {
			for (int j = 0; j < tablaRectangulo[0].length; j++) {
				tablaRectangulo[i][j] = ' ';
			}
		}
		
		for (int i = y1; i <= y2; i++) {
			for (int j = x1; j <= x2; j++) {
				tablaRectangulo[i][j] = '*';
			}
		}

		cadena.append("   0 1 2 3 4 5 6 7 8 9 A\n");
		cadena.append("   +-+-+-+-+-+-+-+-+-+-+- x\n");
		for (int i = 0; i < tablaRectangulo.length; i++) {
			cadena.append(i);
			cadena.append("+ ");
			for (int j = 0; j < tablaRectangulo[0].length; j++) {
				cadena.append(tablaRectangulo[i][j]);
				cadena.append(' ');
			}
			cadena.append("\n");
		}

		return cadena.toString();
	}

}