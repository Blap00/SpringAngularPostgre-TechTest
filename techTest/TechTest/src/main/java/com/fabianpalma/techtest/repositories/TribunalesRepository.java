package com.fabianpalma.techtest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fabianpalma.techtest.models.Tribunales;

@Repository
public interface TribunalesRepository extends JpaRepository<Tribunales,Long>{

}
