package com.daw.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daw.examen.model.Alumno;

@Repository
public interface AlumnoRepositorio extends JpaRepository<Alumno, Long> {

}
