package com.fabianpalma.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fabianpalma.demo.models.Servicios;

@Repository
public interface ServicioRepository extends JpaRepository<Servicios, Long> {

}
