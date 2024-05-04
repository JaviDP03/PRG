package com.daw.burger.model;

import java.util.Objects;

public class Pan {
	private Long id;
	private String descripcion;
	private boolean gluten;

	public Pan() {
	}

	public Pan(Long id, String descripcion, boolean gluten) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Pan [id=" + id + ", descripcion=" + descripcion + ", gluten=" + gluten + "]";
	}

	@Override
	public int hashCode() {
		//return Objects.hash(descripcion, gluten, id);
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