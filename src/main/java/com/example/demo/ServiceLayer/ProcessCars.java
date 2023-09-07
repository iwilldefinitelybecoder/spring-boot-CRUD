package com.example.demo.ServiceLayer;

import com.example.demo.Entity.carFeatures;
import com.example.demo.ServiceRepository.CarsDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcessCars implements carsMethods {

    @Autowired
    CarsDb carsDb;
    public List<carFeatures> getAllCars() {
        return carsDb.findAll();
    }

    @Override
    public List<carFeatures> getCarsByBrand(String brand) {
        return carsDb.findByCarBrand(brand);
    }
}
