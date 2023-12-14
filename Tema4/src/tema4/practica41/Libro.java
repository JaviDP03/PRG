package tema4.practica41;

/**
 * Clase Libro que permite controlar los ejemplares que se pueden prestar
 */
public class Libro {
	private String isbn;
	private String titulo;
	private String nombreAutor;
	private int numeroEjemplaresDisponibles;
	private int numeroEjemplaresPrestados;

	// Constructor
	public Libro(String isbn, String titulo, String nombreAutor, int numeroEjemplaresDisponibles) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.nombreAutor = nombreAutor;
		this.numeroEjemplaresDisponibles = numeroEjemplaresDisponibles;
		this.numeroEjemplaresPrestados = 0;
	}

	// toString
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", nombreAutor=" + nombreAutor
				+ ", numeroEjemplaresDisponibles=" + numeroEjemplaresDisponibles + ", numeroEjemplaresPrestados="
				+ numeroEjemplaresPrestados + "]";
	}

	// Getters y Setters
	public int getNumeroEjemplaresDisponibles() {
		return numeroEjemplaresDisponibles;
	}

	public void setNumeroEjemplaresDisponibles(int numeroEjemplaresDisponibles) {
		this.numeroEjemplaresDisponibles = numeroEjemplaresDisponibles;
	}

	public int getNumeroEjemplaresPrestados() {
		return numeroEjemplaresPrestados;
	}

	// Método solicitarPrestamo
	public void solicitarPrestamo(int cantidad) {
		if (cantidad > numeroEjemplaresDisponibles) {
			System.out.println("ERROR: No se puede realizar el préstamo");
		} else {
			System.out.println("Se han prestado " + cantidad + " ejemplares de " + titulo);
			numeroEjemplaresDisponibles -= cantidad;
			numeroEjemplaresPrestados += cantidad;
		}
	}

	// Método realizarDevolucion
	public void realizarDevolucion(int cantidad) {
		if (cantidad > numeroEjemplaresPrestados) {
			System.out.println("ERROR: No se puede realizar la devolución");
		} else {
			System.out.println("Se han devuelto " + cantidad + " ejemplares de " + titulo);
			numeroEjemplaresDisponibles += cantidad;
			numeroEjemplaresPrestados -= cantidad;
		}
	}
}
