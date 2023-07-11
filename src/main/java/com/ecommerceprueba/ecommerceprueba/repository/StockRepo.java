package com.ecommerceprueba.ecommerceprueba.repository;

import com.ecommerceprueba.ecommerceprueba.models.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepo extends JpaRepository<Stock, Long>{
    
}
