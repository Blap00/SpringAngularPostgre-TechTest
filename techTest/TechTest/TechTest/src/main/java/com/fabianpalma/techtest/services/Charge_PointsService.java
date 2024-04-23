package com.fabianpalma.techtest.services;

import com.fabianpalma.techtest.models.Charge_Points;
import com.fabianpalma.techtest.repositories.Charge_PointsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Charge_PointsService {

    @Autowired
    private Charge_PointsRepository charge_PointsRepository;

    public Charge_Points createChargePoint(Charge_Points chargePoint) {
        return charge_PointsRepository.save(chargePoint);
    }

    public List<Charge_Points> getAllChargePoints() {
        return charge_PointsRepository.findAll();
    }

    public Optional<Charge_Points> getChargePointById(Long id) {
        return charge_PointsRepository.findById(id);
    }
    
}
