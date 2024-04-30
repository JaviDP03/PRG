package com.daw.burger.repository;

import java.util.Collection;

import com.daw.burger.model.Pan;

public interface PanRepository {
	Collection<Pan> getAll();
	Pan getById(Long id);
	void create(Pan item);
	Pan update(Pan item);
	void delete(Pan item);
}
