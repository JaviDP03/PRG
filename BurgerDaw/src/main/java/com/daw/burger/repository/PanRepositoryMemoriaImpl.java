package com.daw.burger.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.daw.burger.model.Pan;

import jakarta.annotation.PostConstruct;

@Repository
@Qualifier("memoria")
public class PanRepositoryMemoriaImpl implements PanRepository {
	private List<Pan> listaPanes;

	@PostConstruct
	void init() {
		listaPanes = new ArrayList<>();
		listaPanes.add(new Pan(1L, "Sésamo", true));
		listaPanes.add(new Pan(2L, "Chapata", true));
		listaPanes.add(new Pan(3L, "Cristal", true));
		listaPanes.add(new Pan(4L, "Maíz", false));
	}

	@Override
	public Collection<Pan> getAll() {
		return listaPanes;
	}

	@Override
	public Pan getById(Long id) {
		/*
		return listaPanes.stream()
				.filter(p -> p.getId() == id)
				.findFirst()
				.orElse(null);
		*/
		
		for (Pan pan : listaPanes) {
			if (pan.getId() == id)
				return pan;
		}
		
		return null;
	}

	@Override
	public void create(Pan item) {
		if (getById(item.getId()) == null)
			listaPanes.add(item);
	}

	@Override
	public Pan update(Pan item) {
		int posicion = listaPanes.indexOf(item);
		if (posicion >= 0) {
			listaPanes.set(posicion, item);
			return item;
		}
		return null;
	}

	@Override
	public void delete(Pan item) {
		listaPanes.remove(item);
	}
}
