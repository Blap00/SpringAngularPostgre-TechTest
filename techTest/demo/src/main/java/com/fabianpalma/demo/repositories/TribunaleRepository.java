package com.fabianpalma.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fabianpalma.demo.models.Tribunales;

@Repository
public interface TribunaleRepository extends JpaRepository<Tribunales, Long> {

}
