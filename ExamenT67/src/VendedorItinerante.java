/**
 * Clase VendedorItinerante (subclase de Vendedor) que representan vendedores
 * que son itinerantes.
 */
public class VendedorItinerante extends Vendedor implements Itinerante {
	// Propiedades de la instancia
	private String[] listaDestinos = new String[5];

	// Constructores
	public VendedorItinerante(String nombre, String especialidad, int añosExperiencia) {
		super(nombre, especialidad, añosExperiencia);
	}

	public VendedorItinerante(String nombre, String especialidad) {
		this(nombre, especialidad, 5);
	}

	@Override
	public String toString() {
		return "VendedorItinerante [nombre=" + getNombre() + ", L=" + listaDestinos[0] + ", M=" + listaDestinos[1]
				+ ", X=" + listaDestinos[2] + ", J=" + listaDestinos[3] + ", V=" + listaDestinos[4] + "]";
	}

	@Override
	public String getDestino(char dia) throws Exception {
		if (dia != 'L' && dia != 'M' && dia != 'X' && dia != 'J' && dia != 'V') {
			throw new Exception("El día de la semana (" + dia + ") no es válido");
		}

		int indiceLista = -1;
		switch (dia) {
		case 'L':
			indiceLista = 0;
			break;
		case 'M':
			indiceLista = 1;
			break;
		case 'X':
			indiceLista = 2;
			break;
		case 'J':
			indiceLista = 3;
			break;
		case 'V':
			indiceLista = 4;
			break;
		}

		return listaDestinos[indiceLista];
	}

	@Override
	public void setDestino(char dia, String localidad) throws Exception {
		if (dia != 'L' && dia != 'M' && dia != 'X' && dia != 'J' && dia != 'V') {
			throw new Exception("El día de la semana (" + dia + ") no es válido");
		}

		int indiceLista = -1;
		switch (dia) {
		case 'L':
			indiceLista = 0;
			break;
		case 'M':
			indiceLista = 1;
			break;
		case 'X':
			indiceLista = 2;
			break;
		case 'J':
			indiceLista = 3;
			break;
		case 'V':
			indiceLista = 4;
			break;
		}

		listaDestinos[indiceLista] = localidad;
	}

}
