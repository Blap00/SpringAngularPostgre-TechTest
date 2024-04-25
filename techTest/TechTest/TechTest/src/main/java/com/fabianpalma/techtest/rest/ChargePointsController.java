package com.fabianpalma.techtest.rest;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fabianpalma.techtest.models.Charge_Points;
import com.fabianpalma.techtest.services.Charge_PointsService;

@RestController
@RequestMapping("/APIchargePoints")
public class ChargePointsController {
    
    @Autowired
    private Charge_PointsService charge_PointsService;


    @PostMapping
    public Charge_Points createChargePoint(@RequestBody Charge_Points chargePoint) {
         return charge_PointsService.createChargePoint(chargePoint);
    }

    @GetMapping
    public List<Charge_Points> getAllChargePoints() {
         return charge_PointsService.getAllChargePoints();
    }

    @GetMapping("/{id}")
    public Optional<Charge_Points> getChargePointById(@PathVariable Long id) {
         return charge_PointsService.getChargePointById(id);
         
    }
    
    @GetMapping("/bestChargingOption")
    public ResponseEntity<Map<String, Object>> getCombinedChargePointResults(@RequestParam double latitude, @RequestParam double longitude) {
        Map<String, Object> combinedResults = charge_PointsService.getCombinedChargePointResults(latitude, longitude);
        return ResponseEntity.ok(combinedResults);
    }
}
