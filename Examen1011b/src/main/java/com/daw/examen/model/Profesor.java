package com.daw.examen.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Profesor {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PROFESOR_SECUENCIA")
	@SequenceGenerator(name = "PROFESOR_SECUENCIA", allocationSize = 1)
	private Long id;
	private String nombre;
	private String apellidos;
	private String especialidad;

	@OneToMany(mappedBy = "profesor", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Clase> clases = new ArrayList<>();

	public Profesor() {
	}

	public Profesor(Long id, String nombre, String apellidos, String especialidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.especialidad = especialidad;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public void addClase(Clase unaClase) {
		unaClase.setProfesor(this);
		clases.add(unaClase);
	}
	
	public void removeClase(Clase unaClase) {
		clases.remove(unaClase);
		unaClase.setProfesor(null);
	}
	
	public List<Clase> getClases() {
		return clases;
	}

	public int getNumeroClases() {
		List<Clase> listaClases = new ArrayList<>();

		for (Clase clase : clases) {
			listaClases.add(clase);
		}

		return listaClases.size();
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
		Profesor other = (Profesor) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Profesor [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", especialidad="
				+ especialidad + "]";
	};

}
