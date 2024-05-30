package com.daw.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daw.examen.model.Clase;

@Repository
public interface ClaseRepositorio extends JpaRepository<Clase, Long> {

}
