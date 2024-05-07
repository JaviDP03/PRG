package com.daw.burger.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daw.burger.modelo.Pan;

public interface PanRepositorio extends JpaRepository<Pan, Long> {

}
