package com.ecommerceprueba.ecommerceprueba.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Stock {
    
    @Id  
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_generator")
    @SequenceGenerator(name = "employee_generator", sequenceName = "employee_seq", allocationSize = 1)
    private Long idstock;
    private Long idproducto;
    private String nompro;
    private Float cantidad;

    public Stock() {
    }

    public Stock(Long idstock, Long idproducto, String nompro, Float cantidad) {
        this.idstock = idstock;
        this.idproducto = idproducto;
        this.cantidad = cantidad;
    }
    
    
    
}
