package com.daw.burger.servicio;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.daw.burger.modelo.Ingrediente;
import com.daw.burger.repositorio.IngredienteRepositorio;

@Service
public class IngredienteServicio {
	@Autowired
	@Qualifier("memoria")
	private IngredienteRepositorio IngredienteRepository;

	public Collection<Ingrediente> getAll() {
		return IngredienteRepository.getAll();
	}

	public Ingrediente getById(Long id) {
		return IngredienteRepository.getById(id);
	}

	public void create(Ingrediente item) {
		/*
		 * long maximo = IngredienteRepository.getAll().stream()
		 * .mapToLong(Ingrediente::getId) .max() .orElse(0);
		 */

		Collection<Ingrediente> listaIngredientes = IngredienteRepository.getAll();
		long maximo = 0;

		for (Ingrediente Ingrediente : listaIngredientes) {
			if (Ingrediente.getId() > maximo)
				maximo = Ingrediente.getId();
		}

		item.setId(maximo + 1);
		IngredienteRepository.create(item);
	}

	public Ingrediente update(Ingrediente item) {
		return IngredienteRepository.update(item);
	}

	public void delete(Ingrediente item) {
		IngredienteRepository.delete(item);
	}

	public void deleteById(Long id) {
		Ingrediente item = new Ingrediente();
		item.setId(id);
		IngredienteRepository.delete(item);
	}

}
