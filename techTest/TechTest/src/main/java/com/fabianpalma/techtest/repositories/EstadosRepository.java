package com.fabianpalma.techtest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fabianpalma.techtest.models.Estados;

@Repository
public interface EstadosRepository extends JpaRepository<Estados,Long>{

}
