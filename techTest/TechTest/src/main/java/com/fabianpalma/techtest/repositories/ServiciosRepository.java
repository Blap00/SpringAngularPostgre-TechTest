package com.fabianpalma.techtest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fabianpalma.techtest.models.Servicios;

@Repository
public interface ServiciosRepository extends JpaRepository<Servicios,Long>{

}
