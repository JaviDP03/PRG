package com.daw.burger.servicio;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daw.burger.modelo.Hamburguesa;
import com.daw.burger.repositorio.HamburguesaRepositorio;

@Service
public class HamburguesaServicio {
	@Autowired
	private HamburguesaRepositorio hamburguesaRepository;

	public Collection<Hamburguesa> getAll() {
		return hamburguesaRepository.findAll();
	}

	public Hamburguesa getById(Long id) {
		return hamburguesaRepository.findById(id).orElse(null);
	}

	public Hamburguesa create(Hamburguesa item) {
		return hamburguesaRepository.save(item);
	}

	public Hamburguesa update(Hamburguesa item) {
		return hamburguesaRepository.save(item);
	}

	public void delete(Hamburguesa item) {
		hamburguesaRepository.delete(item);
	}

	public void deleteById(Long id) {
		hamburguesaRepository.deleteById(id);
	}

}
