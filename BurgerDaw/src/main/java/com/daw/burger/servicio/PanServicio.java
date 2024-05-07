package com.daw.burger.servicio;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daw.burger.modelo.Pan;
import com.daw.burger.repositorio.PanRepositorio;

@Service
public class PanServicio {
	@Autowired
	private PanRepositorio panRepository;

	public Collection<Pan> getAll() {
		return panRepository.findAll();
	}

	public Pan getById(Long id) {
		return panRepository.findById(id).orElse(null);
	}

	public Pan create(Pan item) {
		return panRepository.save(item);
	}

	public Pan update(Pan item) {
		return panRepository.save(item);
	}

	public void delete(Pan item) {
		panRepository.delete(item);
	}

	public void deleteById(Long id) {
		panRepository.deleteById(id);
	}

}
