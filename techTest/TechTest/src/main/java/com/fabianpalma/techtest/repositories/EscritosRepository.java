package com.fabianpalma.techtest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fabianpalma.techtest.models.Escritos;

@Repository
public interface EscritosRepository extends JpaRepository<Escritos,Long>{

}
