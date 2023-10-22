package com.fabianpalma.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fabianpalma.demo.models.Tipos;

@Repository
public interface TiposRepository extends JpaRepository<Tipos, Long> {

}
