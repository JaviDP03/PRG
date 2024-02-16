package tema7.tarea73;

public class TrianguloRectangulo extends Figura implements Dibujo {
	private double base;
	private double altura;
	private double x;
	private double y;

	public TrianguloRectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
		this.x = 0;
		this.y = 0;
	}

	public TrianguloRectangulo(double base, double altura, double x, double y) {
		this.base = base;
		this.altura = altura;
		this.x = x;
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

	@Override
	public double calcularSuperficie() {
		// TODO Auto-generated method stub
		return (altura * base) / 2;
	}

	@Override
	public double calcularPerimetro() {
		double hipotenusa = Math.sqrt(altura * altura + base * base);
		return altura + base + hipotenusa;
	}

	@Override
	public void desplazar(double x, double y) {
		this.x += x;
		this.y += y;
	}

	@Override
	public String toString() {
		return "TrianguloRectangulo [base=" + base + ", altura=" + altura + ", x=" + x + ", y=" + y + "]";
	}

	@Override
	public void pintar() {
		// pantalla[linea][columna]
		char[][] pantalla = new char[11][11];

		// Primero relleno todo el array con espacios en blanco
		for (int fila = 0; fila < pantalla.length; fila++) {
			for (int columna = 0; columna < pantalla[0].length; columna++) {
				pantalla[fila][columna] = ' ';
			}
		}

		// Ahora pinto asteriscos por todo el área que cubre el rectángulo
		for (int fila = (int) x; fila <= altura; fila++) {
			for (int columna = (int) x; columna <= base; columna++) {
				pantalla[fila][columna] = '*';
			}
		}

		// Construyo la "imagen" que voy a imrimir
		System.out.print("   0 1 2 3 4 5 6 7 8 9 A\n");
		System.out.print("   +-+-+-+-+-+-+-+-+-+-+- x\n");

		for (int fila = 0; fila < pantalla.length; fila++) {
			if (fila < 10)
				System.out.print(" ");

			System.out.print(fila);
			System.out.print("+");

			// System.out.printf("[%.2f]", (base/altura)*fila);
			for (int columna = 0; columna < pantalla[0].length; columna++) {
				if (columna < (base / altura) * fila) {
					System.out.print(pantalla[fila][columna]);
					System.out.print(pantalla[fila][columna]);
				}
			}

			System.out.print("\n");
		}
		System.out.print("  y");
	}

}
