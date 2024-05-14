package com.daw.burger.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Pan {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PAN_SEQ")
	@SequenceGenerator(name = "PAN_SEQ", allocationSize = 1)
	private Long id;

	@Column
	private String descripcion;

	@Column
	private boolean gluten;

	@OneToMany(mappedBy = "pan", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Hamburguesa> hamburguesas = new ArrayList<>();

	public Pan() {
	}

	public Pan(Long id, String descripcion, boolean gluten) {
		this.id = id;
		this.descripcion = descripcion;
		this.gluten = gluten;
	}

	public Pan(String descripcion, boolean gluten) {
		this.descripcion = descripcion;
		this.gluten = gluten;
	}

	public Long getId() {
		return id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public boolean isGluten() {
		return gluten;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setGluten(boolean gluten) {
		this.gluten = gluten;
	}

	public List<Hamburguesa> getHamburguesas() {
		return hamburguesas;
	}

	public List<String> getNombresHamburguesas() {
		List<String> listaNombres = new ArrayList<>();

		for (Hamburguesa hamburguesa : hamburguesas) {
			listaNombres.add(hamburguesa.getNombre());
		}
		return listaNombres;
	}

	public void addHamburguesa(Hamburguesa hamburguesa) {
		hamburguesas.add(hamburguesa);
		hamburguesa.setPan(this);
	}

	public void removeHamburguesa(Hamburguesa hamburguesa) {
		hamburguesas.remove(hamburguesa);
		hamburguesa.setPan(null);
	}

	@Override
	public String toString() {
		return "Pan [id=" + id + ", descripcion=" + descripcion + ", gluten=" + gluten + "]";
	}

	@Override
	public int hashCode() {
		// return Objects.hash(descripcion, gluten, id);
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
		Pan other = (Pan) obj;
		// return Objects.equals(descripcion, other.descripcion) &&
		// gluten == other.gluten && id == other.id;
		return id == other.id;
	}
}