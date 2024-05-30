package com.daw.examen.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daw.examen.model.Clase;
import com.daw.examen.repository.ClaseRepositorio;

@Service
public class ClaseServicio {
	@Autowired
	private ClaseRepositorio claseRepositorio;
	
	public Collection<Clase> getAll() {
		return claseRepositorio.findAll();
	}
	
	public Clase getById(Long id) {
		final Clase item = claseRepositorio.findById(id).orElse(null);
		
		return item;
	}
	
	public Clase create(Clase item) {
		return claseRepositorio.save(item);
	}

	public Clase update(Clase item) {
		return claseRepositorio.save(item);
	}
	
	public void delete(Clase item) {
		claseRepositorio.delete(item);
	}
	
	public void deleteById(Long id) {
		claseRepositorio.deleteById(id);
	}

}
