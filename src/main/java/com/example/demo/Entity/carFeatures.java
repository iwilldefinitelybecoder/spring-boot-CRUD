package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;


@Data
@Entity
public class carFeatures{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long carId;
    private String carBrand;
    private String carModel;
    private Integer year;
    private String color;
    private String engineType;
    private String transmissionType;
    private String fuelType;
    private Integer horsepower;
    private Integer torque;
    private BigDecimal acceleration;
    private Integer topSpeed;
    private BigDecimal fuelEfficiencyCity;
    private BigDecimal fuelEfficiencyHighway;
    private Integer seatingCapacity;
    private Integer numberOfDoors;
   private Boolean sunroof;
    private Boolean gpsNavigation;
    private Boolean airConditioning;
  private Boolean bluetooth;
  private Boolean cruiseControl;
    private Boolean powerWindows;
   private Boolean powerLocks;
   private Boolean leatherSeats;
  private Boolean heatedSeats;
  private Boolean backupCamera;
    private Boolean parkingSensors;
    private BigDecimal price;
   private String imageLink;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
