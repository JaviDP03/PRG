package com.daw.burger.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daw.burger.modelo.Hamburguesa;

@Repository
public interface HamburguesaRepositorio extends JpaRepository<Hamburguesa, Long> {

}
