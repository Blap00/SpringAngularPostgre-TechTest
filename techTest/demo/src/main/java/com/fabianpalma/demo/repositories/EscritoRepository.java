package com.fabianpalma.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fabianpalma.demo.models.Escritos;

@Repository
public interface EscritoRepository extends JpaRepository<Escritos, Long> {

}
