package tema6.relacion63;

public class Fraccion {
	// Propiedades de la instancia
	private int numerador;
	private int denominador;

	// Constructores
	public Fraccion() {
		numerador = 1;
		denominador = 1;
	}

	public Fraccion(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}

	// toString
	public String toString() {
		return "(" + numerador + " / " + denominador + ")";
	}

	// Método sumar
	public Fraccion sumar(Fraccion fraccionSumar) {
		Fraccion resultado = new Fraccion();

		resultado.denominador = this.denominador * fraccionSumar.denominador;
		resultado.numerador = this.numerador * fraccionSumar.denominador + this.denominador * fraccionSumar.numerador;
		
		return resultado;
	}

	// main
	public static void main(String[] args) {
		Fraccion x = new Fraccion(1, 2);
		Fraccion y = new Fraccion(3, 4);
		Fraccion suma = x.sumar(y);
		System.out.println("Sumando x = " + x);
		System.out.println("Sumando y = " + y);
		System.out.println("Suma = " + suma);
	}

}
