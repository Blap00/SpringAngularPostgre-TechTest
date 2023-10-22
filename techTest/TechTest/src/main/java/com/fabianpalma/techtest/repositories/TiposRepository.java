package com.fabianpalma.techtest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fabianpalma.techtest.models.Tipos;

@Repository
public interface TiposRepository extends JpaRepository<Tipos,Long>{

}
