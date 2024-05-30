import java.util.Comparator;
import java.util.Objects;

public class Jugador implements Comparable<Jugador> {
	// Propiedades de la instancia
	private String nombre;
	private int numeroCamiseta;

	// Constructor
	public Jugador(String nombre, int numeroCamiseta) {
		this.nombre = nombre;
		this.numeroCamiseta = numeroCamiseta;
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroCamiseta() {
		return numeroCamiseta;
	}

	public void setNumeroCamiseta(int numeroCamiseta) {
		this.numeroCamiseta = numeroCamiseta;
	}

	// toString
	public String toString() {
		return nombre + " (" + numeroCamiseta + ")";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		return nombre.equals(other.nombre);
	}

	@Override
	public int compareTo(Jugador otroJugador) {
		return this.nombre.compareTo(otroJugador.nombre);
	}

	public static class ComparadorNumero implements Comparator<Jugador> {
		@Override
		public int compare(Jugador j1, Jugador j2) {
			return Integer.compare(j1.numeroCamiseta, j2.numeroCamiseta);
		}
	}

}
