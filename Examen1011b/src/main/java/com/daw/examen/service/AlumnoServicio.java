package com.daw.examen.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daw.examen.model.Alumno;
import com.daw.examen.repository.AlumnoRepositorio;

@Service
public class AlumnoServicio {
	@Autowired
	private AlumnoRepositorio alumnoRepositorio;

	public Collection<Alumno> getAll() {
		return alumnoRepositorio.findAll();
	}

	public Alumno getById(Long id) {
		final Alumno item = alumnoRepositorio.findById(id).orElse(null);

		if (item == null) {
			throw new RuntimeException("No se ha podido encontrar el id");
		}

		return item;
	}

	public Alumno create(Alumno item) {
		return alumnoRepositorio.save(item);
	}

	public Alumno update(Alumno item) {
		return alumnoRepositorio.save(item);
	}

	public void delete(Alumno item) {
		alumnoRepositorio.delete(item);
	}

	public void deleteById(Long id) {
		alumnoRepositorio.deleteById(id);
	}

}
