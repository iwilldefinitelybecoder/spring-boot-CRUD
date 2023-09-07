package com.example.demo.controller;

import com.example.demo.Entity.carFeatures;
import com.example.demo.ServiceLayer.ProcessCars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class Cars {

    @Autowired
    ProcessCars cars;

    @GetMapping("/allcars")
    public ResponseEntity<List<carFeatures>> getAllCars(){
        return ResponseEntity.ok(cars.getAllCars());
    }

    @GetMapping("brands/{brand}")
    public ResponseEntity<List<carFeatures>> getBrandCars(@PathVariable String brand){
        System.out.println(brand);
        return ResponseEntity.ok(cars.getCarsByBrand(brand));
    }
}
