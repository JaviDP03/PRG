package tema4.relacion41;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Alumno {
	// Propiedades de la instancia
	private String nombre;
	private String dni;
	private String localidad;
	private int dia;
	private int mes;
	private int año;
	private int horasAsistencia;

	// Métodos de la instancia
	/**
	 * @param nombre
	 * @param dni
	 * @param localidad
	 * @param dia
	 * @param mes
	 * @param año
	 */
	public Alumno(String nombre, String dni, String localidad, int dia, int mes, int año, int horasAsistencia) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.localidad = localidad;
		this.dia = dia;
		this.mes = mes;
		this.año = año;
		this.horasAsistencia = horasAsistencia;
	}

	public String toString() {
		return "Alumno [nombre=" + nombre + ", dni=" + dni + ", localidad=" + localidad + ", fechaNacimiento=" + dia
				+ "/" + mes + "/" + año + ", horasAsistencia=" + horasAsistencia + "]";
	}

	/**
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return localidad
	 */
	public String getLocalidad() {
		return localidad;
	}

	/**
	 * @param localidad
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	/**
	 * @return dia
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * @param dia
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}

	/**
	 * @return mes
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * @param mes
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}

	/**
	 * @return año
	 */
	public int getAño() {
		return año;
	}

	/**
	 * @param año
	 */
	public void setAño(int año) {
		this.año = año;
	}

	/**
	 * @return horasAsistencia
	 */
	public int getHorasAsistencia() {
		return horasAsistencia;
	}

	/**
	 * @param horasAsistencia
	 */
	public void setHorasAsistencia(int horasAsistencia) {
		this.horasAsistencia = horasAsistencia;
	}

	/**
	 * Calcular la edad del alumno
	 */
	public int edad() {
		Date hoy = new Date();
		SimpleDateFormat formatoDia = new SimpleDateFormat("dd");
		int diaHoy = Integer.parseInt(formatoDia.format(hoy));
		SimpleDateFormat formatoMes = new SimpleDateFormat("MM");
		int mesHoy = Integer.parseInt(formatoMes.format(hoy));
		SimpleDateFormat formatoAño = new SimpleDateFormat("yyyy");
		int añoHoy = Integer.parseInt(formatoAño.format(hoy));
		
		return (mesHoy > mes) || (diaHoy >= dia) ? (añoHoy - año) : (añoHoy - año - 1);
	}

	/**
	 * Añadir horas de asistencia
	 * @param horas
	 */
	public void añadirHoras(int horas) {
		horasAsistencia += horas;
	}

	/**
	 * Descontar horas de asistencia
	 * @param horas
	 */
	public void quitarHoras(int horas) {
		horasAsistencia -= horas;
	}

	/**
	 * Dar de baja al alumno
	 */
	public void darDeBaja() {
		horasAsistencia = 0;
	}
}
