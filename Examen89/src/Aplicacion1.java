
public class Aplicacion1 {

	public static void main(String[] args) {
		Equipo e1 = new Equipo("Mirandés", "Paco", 1949);

		e1.añadirJugador(new Jugador("Pepe", 4));
		e1.añadirJugador(new Jugador("Roberto", 12));
		e1.añadirJugador(new Jugador("Manuel", 10));
		e1.añadirJugador(new Jugador("Rafael", 2));
		e1.añadirJugador(new Jugador("Rafael", 7));

		System.out.println(e1);

		e1.ordenarJugadoresPorNombre();
		System.out.println(e1);

		e1.ordenarJugadoresPorNumero();
		System.out.println(e1);
	}

}
