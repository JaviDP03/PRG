package com.daw.examen.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Clase {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CLASE_SECUENCIA")
	@SequenceGenerator(name = "CLASE_SECUENCIA", allocationSize = 1)
	private Long id;
	private String fecha;
	private int duracion;
	private double precio;
	private boolean pagada;

	@ManyToOne
	@JoinColumn(name = "ID_Profesor")
	private Profesor profesor;


	@ManyToOne
	@JoinColumn(name = "ID_Alumno")
	private Alumno alumno;

	public Clase() {
	}

	public Clase(Long id, String fecha, int duracion, double precio, boolean pagada) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.duracion = duracion;
		this.precio = precio;
		this.pagada = pagada;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isPagada() {
		return pagada;
	}

	public void setPagada(boolean pagada) {
		this.pagada = pagada;
	}
	
	public Profesor getProfesor() {
		return profesor;
	}
	
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	
	public Alumno getAlumno() {
		return alumno;
	}
	
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clase other = (Clase) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Clase [id=" + id + ", fecha=" + fecha + ", duracion=" + duracion + ", precio=" + precio + ", pagada="
				+ pagada + "]";
	}

}
