package com.fabianpalma.techtest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fabianpalma.techtest.models.Charge_Points;

@Repository
public interface Charge_PointsRepository extends JpaRepository<Charge_Points, Long> {

    @Query(value = "SELECT *, "
            + "ACOS(SIN(RADIANS(?1)) * SIN(RADIANS(latitude)) + "
            + "COS(RADIANS(?1)) * COS(RADIANS(latitude)) * COS(RADIANS(?2) - RADIANS(longitude))) "
            + "* 6371 AS distance "
            + "FROM electromobility.charge_points "
            + "ORDER BY distance ASC "
            + "LIMIT 1", nativeQuery = true)
    Charge_Points findNearestChargePoint(double latitude, double longitude);
	    
	
    @Query("SELECT c, c.power FROM Charge_Points c ORDER BY c.power DESC LIMIT 1")
    Charge_Points findChargePointWithMaxPower();

}
