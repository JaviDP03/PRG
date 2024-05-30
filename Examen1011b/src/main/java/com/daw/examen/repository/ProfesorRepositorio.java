package com.daw.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daw.examen.model.Profesor;

@Repository
public interface ProfesorRepositorio extends JpaRepository<Profesor, Long> {

}
