import java.util.ArrayList;
import java.util.List;

public class Equipo {
	// Propiedades de la clase
	private static final char[] ABECEDARIO = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
			'Ñ', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

	// Propiedades de la instancia
	private String nombre;
	private String presidente;
	private int añoFundacion;
	private List<Jugador> listaJugadores;

	// Constructor
	public Equipo(String nombre, String presidente, int añoFundacion) {
		this.nombre = nombre;
		this.presidente = presidente;
		this.añoFundacion = añoFundacion;
		listaJugadores = new ArrayList<>();
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPresidente() {
		return presidente;
	}

	public void setPresidente(String presidente) {
		this.presidente = presidente;
	}

	public int getAñoFundacion() {
		return añoFundacion;
	}

	public void setAñoFundacion(int añoFundacion) {
		this.añoFundacion = añoFundacion;
	}

	public List<Jugador> getListaJugadores() {
		return listaJugadores;
	}

	public void setListaJugadores(List<Jugador> listaJugadores) {
		this.listaJugadores = listaJugadores;
	}

	public int getNumeroJugadores() {
		return listaJugadores.size();
	}

	public void añadirJugador(Jugador jugador) {
		if (!listaJugadores.contains(jugador)) {
			listaJugadores.add(jugador);
		}
	}

	public void quitarJugador(Jugador jugador) {
		listaJugadores.remove(jugador);
	}

	public void ordenarJugadoresPorNombre() {
		listaJugadores.sort(null);
	}

	public void ordenarJugadoresPorNumero() {
		listaJugadores.sort(new Jugador.ComparadorNumero());
	}

	// toString
	public String toString() {
		StringBuilder equipoString = new StringBuilder();

		equipoString.append(String.format("EQUIPO: %s\n", nombre));
		equipoString.append(String.format("PRESIDENTE: %s\n", presidente));
		equipoString.append(String.format("AÑO: %d\n", añoFundacion));
		equipoString.append(String.format("JUGADORES (%d): \n", getNumeroJugadores()));

		for (int i = 0; i < getNumeroJugadores(); i++) {
			equipoString.append(String.format("%c. %s\n", ABECEDARIO[i], listaJugadores.get(i)));
		}

		return equipoString.toString();
	}

}
