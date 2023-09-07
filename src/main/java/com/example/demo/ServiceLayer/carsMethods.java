package com.example.demo.ServiceLayer;
import com.example.demo.Entity.carFeatures;


import java.util.List;

public interface carsMethods {
    public List<carFeatures> getAllCars();
    public List<carFeatures> getCarsByBrand(String brand);
}
