package com.ecommerceprueba.ecommerceprueba.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Venta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)   
    private Long idventa;
    private Long idventafecha;
    private Long idproducto;
    private String nompro;
    private Float precio;
    private Float cantidad;
    private Float total;
    
    public Venta(){        
    }
    
    public Venta(Long idventa, Long idventafecha, Long idproducto, String nompro, Float precio, Float cantidad, Float total){
        this.idventa = idventa;
        this.idventafecha = idventafecha;
        this.idproducto = idproducto;
        this.nompro = nompro;
        this.precio = precio;
        this.cantidad = cantidad;
        this.total = total;
    }
    
}
