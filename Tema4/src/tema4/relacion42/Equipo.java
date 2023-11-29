package tema4.relacion42;

public class Equipo {
	// Propiedades de la instancia
	private String nombre;
	private int puntos;
	private int golesFavor;
	private int golesContra;

	// Constructor
	public Equipo(String nombre, int puntos, int golesFavor, int golesContra) {
		this.nombre = nombre;
		this.puntos = puntos;
		this.golesFavor = golesFavor;
		this.golesContra = golesContra;
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getGolesFavor() {
		return golesFavor;
	}

	public void setGolesFavor(int golesFavor) {
		this.golesFavor = golesFavor;
	}

	public int getGolesContra() {
		return golesContra;
	}

	public void setGolesContra(int golesContra) {
		this.golesContra = golesContra;
	}

	// toString
	public String toString() {
		return "Equipo [nombre=" + nombre + ", puntos=" + puntos + ", golesFavor=" + golesFavor + ", golesContra="
				+ golesContra + "]";
	}

	// Métodos de la instancia
	public void partido(int golesMarcados, int golesRecibidos) {
		golesFavor += golesMarcados;
		golesContra += golesRecibidos;
		
		if (golesMarcados > golesRecibidos) {
			puntos += 3;
		} else if (golesMarcados == golesRecibidos) {
			puntos++;
		}
	}
}
