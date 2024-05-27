package com.daw.burger.modelo;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Ingrediente {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "INGREDIENTE_SEQ")
	@SequenceGenerator(name = "INGREDIENTE_SEQ", allocationSize = 1)
	private Long id;
	private String descripcion;
	private double peso;

	public Ingrediente() {
	}

	public Ingrediente(Long id, String nombre, double peso) {
		this.id = id;
		this.descripcion = nombre;
		this.peso = peso;
	}

	public Long getId() {
		return id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public double getPeso() {
		return peso;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDescripcion(String nombre) {
		this.descripcion = nombre;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Pan [id=" + id + ", descripcion=" + descripcion + ", peso=" + peso + "]";
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
		Ingrediente other = (Ingrediente) obj;

		return id == other.id;
	}
}