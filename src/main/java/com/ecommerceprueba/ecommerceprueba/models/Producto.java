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
public class Producto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "employee_generator", sequenceName = "employee_seq", allocationSize = 1)
    private Long idproducto;
    private String nompro;
    private Float precio;

    public Producto() {
    }

    public Producto(Long idproducto, String nompro, Float precio) {
        this.idproducto = idproducto;
        this.nompro = nompro;
        this.precio = precio;
    }
    
    
    
}
