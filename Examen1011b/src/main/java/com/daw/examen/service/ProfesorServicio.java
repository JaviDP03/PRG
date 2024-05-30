package com.daw.examen.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daw.examen.model.Profesor;
import com.daw.examen.repository.ProfesorRepositorio;

@Service
public class ProfesorServicio {
	@Autowired
	private ProfesorRepositorio profesorRepositorio;

	public Collection<Profesor> getAll() {
		return profesorRepositorio.findAll();
	}

	public Profesor getById(Long id) {
		final Profesor item = profesorRepositorio.findById(id).orElse(null);

		return item;
	}

	public Profesor create(Profesor item) {
		return profesorRepositorio.save(item);
	}

	public Profesor update(Profesor item) {
		return profesorRepositorio.save(item);
	}

	public void delete(Profesor item) {
		profesorRepositorio.delete(item);
	}

	public void deleteById(Long id) {
		profesorRepositorio.deleteById(id);
	}

}
