package com.daw.burger.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.daw.burger.model.Ingrediente;

import jakarta.annotation.PostConstruct;

@Repository
@Qualifier("memoria")
public class IngredienteRepositoryMemoriaImpl implements IngredienteRepository {
	private List<Ingrediente> listaIngredientes;

	@PostConstruct
	void init() {
		listaIngredientes = new ArrayList<>();
		listaIngredientes.add(new Ingrediente(1L, "Carne", false));
		listaIngredientes.add(new Ingrediente(2L, "Queso", true));
		listaIngredientes.add(new Ingrediente(3L, "Tomate", false));
		listaIngredientes.add(new Ingrediente(4L, "Lechuga", false));
	}

	@Override
	public Collection<Ingrediente> getAll() {
		return listaIngredientes;
	}

	@Override
	public Ingrediente getById(Long id) {
		/*
		return listaIngredientes.stream()
				.filter(p -> p.getId() == id)
				.findFirst()
				.orElse(null);
		*/
		
		for (Ingrediente Ingrediente : listaIngredientes) {
			if (Ingrediente.getId() == id)
				return Ingrediente;
		}
		
		return null;
	}

	@Override
	public void create(Ingrediente item) {
		if (getById(item.getId()) == null)
			listaIngredientes.add(item);
	}

	@Override
	public Ingrediente update(Ingrediente item) {
		int posicion = listaIngredientes.indexOf(item);
		if (posicion >= 0) {
			listaIngredientes.set(posicion, item);
			return item;
		}
		return null;
	}

	@Override
	public void delete(Ingrediente item) {
		listaIngredientes.remove(item);
	}
}
