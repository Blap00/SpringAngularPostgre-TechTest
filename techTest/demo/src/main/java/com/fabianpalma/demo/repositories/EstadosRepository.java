package com.fabianpalma.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fabianpalma.demo.models.Estados;

@Repository
public interface EstadosRepository extends JpaRepository<Estados, Long> {

}
