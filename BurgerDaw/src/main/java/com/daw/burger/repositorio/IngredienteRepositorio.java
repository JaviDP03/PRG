package com.daw.burger.repositorio;

import java.util.Collection;

import com.daw.burger.modelo.Ingrediente;

public interface IngredienteRepositorio {
	Collection<Ingrediente> getAll();
	Ingrediente getById(Long id);
	void create(Ingrediente item);
	Ingrediente update(Ingrediente item);
	void delete(Ingrediente item);
}
