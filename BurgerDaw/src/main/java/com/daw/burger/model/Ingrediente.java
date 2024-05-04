package com.daw.burger.model;

import java.util.Objects;

public class Ingrediente {
	private Long id;
	private String nombre;
	private boolean lactosa;

	public Ingrediente() {
	}

	public Ingrediente(Long id, String nombre, boolean lactosa) {
		this.id = id;
		this.nombre = nombre;
		this.lactosa = lactosa;
	}

	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public boolean isLactosa() {
		return lactosa;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setLactosa(boolean lactosa) {
		this.lactosa = lactosa;
	}

	@Override
	public String toString() {
		return "Pan [id=" + id + ", nombre=" + nombre + ", lactosa=" + lactosa + "]";
	}

	@Override
	public int hashCode() {
		//return Objects.hash(nombre, lactosa, id);
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
		// return Objects.equals(nombre, other.nombre) &&
		// lactosa == other.lactosa && id == other.id;
		return id == other.id;
	}
}