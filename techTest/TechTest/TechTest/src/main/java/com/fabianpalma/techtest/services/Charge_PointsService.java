package com.fabianpalma.techtest.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabianpalma.techtest.models.Charge_Points;
import com.fabianpalma.techtest.repositories.Charge_PointsRepository;

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
    
    public Map<String, Object> getCombinedChargePointResults(double latitude, double longitude) {
        // Obtener el punto de carga más cercano
        Charge_Points nearestChargePoint = charge_PointsRepository.findNearestChargePoint(latitude, longitude);
        double distance = calculateDistance(latitude, longitude, nearestChargePoint.getLatitude(), nearestChargePoint.getLongitude());
        // Obtener el punto de carga con la mayor potencia
        Charge_Points chargePointWithMaxPower = charge_PointsRepository.findChargePointWithMaxPower();
        
        // Formatear los resultados en un mapa
        Map<String, Object> combinedResults = new HashMap<>();
        combinedResults.put("chargePointBestDistance", formatDistancePoint(nearestChargePoint, distance));
        combinedResults.put("chargePointBestPower", formatChargePoint(chargePointWithMaxPower)); // No necesitamos pasar la potencia
        return combinedResults;
    }

    private Map<String, Object> formatDistancePoint(Charge_Points chargePoint, double distance) {
        // Formatear el punto de carga como un mapa con las propiedades deseadas
        Map<String, Object> formattedChargePoint = new HashMap<>();
        formattedChargePoint.put("id", chargePoint.getId());
        formattedChargePoint.put("distance", distance); // En metros
        // Agregar otras propiedades que desees incluir
        return formattedChargePoint;
    }
    
    private Map<String, Object> formatChargePoint(Charge_Points chargePoint) {
        // Formatear el punto de carga como un mapa con las propiedades deseadas
        Map<String, Object> formattedChargePoint = new HashMap<>();
        formattedChargePoint.put("id", chargePoint.getId());
        formattedChargePoint.put("power", chargePoint.getPower()); // En poder
        // Agregar otras propiedades que desees incluir
        return formattedChargePoint;
    }

    private double calculateDistance(double lat1, double lon1, String string, String string2) {

    	double stringlat1= Double.parseDouble(string);
    	double stringlon2= Double.parseDouble(string2);
        // Cálculo de la distancia utilizando la fórmula de Haversine
        final int R = 6371; // Radio de la Tierra en kilómetros
        double dLat = Math.toRadians(stringlat1 - lat1);
        double dLon = Math.toRadians(stringlon2 - lon1);
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(stringlat1)) * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c * 1000; // Convertir a metros
        return distance;
    }
}
