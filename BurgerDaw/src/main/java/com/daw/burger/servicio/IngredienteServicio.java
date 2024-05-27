package com.daw.burger.servicio;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daw.burger.modelo.Ingrediente;
import com.daw.burger.repositorio.IngredienteRepositorio;

@Service
public class IngredienteServicio {
	@Autowired
	private IngredienteRepositorio ingredienteRepository;

	public Collection<Ingrediente> getAll() {
		return ingredienteRepository.findAll();
	}

	public Ingrediente getById(Long id) {
		return ingredienteRepository.findById(id).orElse(null);
	}

	public Ingrediente create(Ingrediente item) {
		return ingredienteRepository.save(item);
	}

	public Ingrediente update(Ingrediente item) {
		return ingredienteRepository.save(item);
	}

	public void delete(Ingrediente item) {
		ingredienteRepository.delete(item);
	}

	public void deleteById(Long id) {
		ingredienteRepository.deleteById(id);
	}

}
