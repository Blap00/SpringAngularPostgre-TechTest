package com.fabianpalma.techtest.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Charge_Points {
	//GENERATE ID From SPRING
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;  //PK
	
	//Set STATUS VALUE from Spring
	@Column(nullable = false)
	private String status;
	
	//Set operator VALUE from Spring
	@Column(nullable = false)
	private String operator;
	
	//Set connections VALUE from Spring
	@Column(nullable = false)
	private Integer connections;
	
	//Set latitude VALUE from Spring
	@Column(nullable = false)
	private String latitude;
	
	//Set country VALUE from Spring
	@Column(nullable = false)
	private String country;
		
	//Set longitude VALUE from Spring
	@Column(nullable = false)
	private String longitude;
	
	//Set power VALUE from Spring //Corresponde a máxima potencia de carga en W
	@Column(nullable = false)
	private Integer power;
	
	//This TECH TEST CAN BE NORMALIZED, set country into other table, status too, and operator too.
	
	// Constructors
    public Charge_Points() {
    }

    public Charge_Points(String status, String operator, Integer connections, String latitude, String longitude, String country, Integer power) {
        this.status = status;
        this.operator = operator;
        this.connections = connections;
        this.latitude = latitude;
        this.longitude = longitude;
        this.country = country;
        this.power = power;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Integer getConnections() {
		return connections;
	}

	public void setConnections(Integer connections) {
		this.connections = connections;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public Integer getPower() {
		return power;
	}

	public void setPower(Integer power) {
		this.power = power;
	}
    
    
}
