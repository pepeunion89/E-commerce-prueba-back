package com.ecommerceprueba.ecommerceprueba.repository;

import com.ecommerceprueba.ecommerceprueba.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepo extends JpaRepository<Producto, Long>{
    
}
