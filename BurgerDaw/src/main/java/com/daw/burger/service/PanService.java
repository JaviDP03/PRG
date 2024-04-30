package com.daw.burger.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.daw.burger.model.Pan;
import com.daw.burger.repository.PanRepository;

@Service
public class PanService {
	@Autowired
	@Qualifier("memoria")
	private PanRepository panRepository;

	public Collection<Pan> getAll() {
		return panRepository.getAll();
	}

	public Pan getById(Long id) {
		return panRepository.getById(id);
	}

	public void create(Pan item) {
		/*
		long maximo = panRepository.getAll().stream()
				.mapToLong(Pan::getId)
				.max()
				.orElse(0);
		*/
		
		Collection<Pan> listaPanes = panRepository.getAll();
		long maximo = 0;
		
		for (Pan pan : listaPanes) {
			if (pan.getId() > maximo)
				maximo = pan.getId();
		}
		
		item.setId(maximo + 1);
		panRepository.create(item);
	}

	public Pan update(Pan item) {
		return panRepository.update(item);
	}

	public void delete(Pan item) {
		panRepository.delete(item);
	}

	public void deleteById(Long id) {
		Pan item = new Pan();
		item.setId(id);
		panRepository.delete(item);
	}

}
