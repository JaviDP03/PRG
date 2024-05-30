import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Aplicacion2 {

	public static void main(String[] args) {
		String linea;
		String[] lineaSeparada = new String[3];
		Equipo e1 = null;
		StringBuilder salidaEquipo = new StringBuilder();
		List<Jugador> listaJugadores = new ArrayList<>();

		// Leer archivo
		try {
			BufferedReader entrada = new BufferedReader(new FileReader("entrada_equipo.txt"));

			linea = entrada.readLine();
			lineaSeparada = linea.split(";");
			e1 = new Equipo(lineaSeparada[0], lineaSeparada[1], Integer.parseInt(lineaSeparada[2]));
			lineaSeparada = null;
			linea = entrada.readLine();

			while (linea != null) {
				lineaSeparada = linea.split(";");

				e1.añadirJugador(new Jugador(lineaSeparada[0], Integer.parseInt(lineaSeparada[1])));

				linea = entrada.readLine();
			}

			entrada.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se puede encontrar el archivo o no existe");
		} catch (IOException e) {
			System.out.println("Ha ocurrido un error al abrir el archivo");
		}

		// Escribir archivo
		try {
			BufferedWriter salida = new BufferedWriter(new FileWriter("salida_equipo.txt"));

			salidaEquipo.append(String.format("%s;%s;%d\n", e1.getNombre(), e1.getPresidente(), e1.getAñoFundacion()));

			listaJugadores = e1.getListaJugadores();

			for (int i = 0; i < e1.getNumeroJugadores(); i++) {
				if (listaJugadores.get(i).getNumeroCamiseta() % 2 != 0) {
					salidaEquipo.append(String.format("%s;%d\n", listaJugadores.get(i).getNombre(),
							listaJugadores.get(i).getNumeroCamiseta()));
				}

			}
			salida.write(salidaEquipo.toString());

			salida.close();
		} catch (IOException e) {
			System.out.println("Ha ocurrido un error escribiendo el archivo");
		}
	}

}
