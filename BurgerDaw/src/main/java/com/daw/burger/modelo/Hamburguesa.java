package com.daw.burger.modelo;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Hamburguesa {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HAMBURGUESA_SEQ")
	@SequenceGenerator(name = "HAMBURGUESA_SEQ", allocationSize = 1)
	private Long id;
	private String nombre;
	private double precio;

	@ManyToOne
	@JoinColumn(name = "idp")
	private Pan pan;

	public Hamburguesa() {
	}

	public Hamburguesa(Long id, String nombre, double precio, Pan pan) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.pan = pan;
	}

	public Hamburguesa(String nombre, double precio, Pan pan) {
		this.nombre = nombre;
		this.precio = precio;
		this.pan = pan;
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Pan getPan() {
		return pan;
	}

	public void setPan(Pan pan) {
		this.pan = pan;
	}

	@Override
	public String toString() {
		return "Hamburguesa [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", pan=" + pan + "]";
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
		Hamburguesa other = (Hamburguesa) obj;
		return Objects.equals(id, other.id);
	}

}
