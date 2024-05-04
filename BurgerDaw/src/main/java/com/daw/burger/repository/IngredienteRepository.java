package com.daw.burger.repository;

import java.util.Collection;

import com.daw.burger.model.Ingrediente;

public interface IngredienteRepository {
	Collection<Ingrediente> getAll();
	Ingrediente getById(Long id);
	void create(Ingrediente item);
	Ingrediente update(Ingrediente item);
	void delete(Ingrediente item);
}
