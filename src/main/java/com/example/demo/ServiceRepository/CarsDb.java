package com.example.demo.ServiceRepository;
import com.example.demo.Entity.carFeatures;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarsDb extends JpaRepository<carFeatures, Long> {
         List<carFeatures> findByCarBrand(String brand);
}
