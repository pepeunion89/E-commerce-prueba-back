package com.ecommerceprueba.ecommerceprueba.services;

import com.ecommerceprueba.ecommerceprueba.exception.ProductoNoEncontradoException;
import com.ecommerceprueba.ecommerceprueba.models.Producto;
import com.ecommerceprueba.ecommerceprueba.repository.ProductoRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ProductoService {
    
    private final ProductoRepo productoRepo; 
    
    @Autowired
    public ProductoService(ProductoRepo productoRepo){
        this.productoRepo = productoRepo;
    }
    
    public Producto addProducto(Producto producto){
        return this.productoRepo.save(producto);
    }
    
    public List<Producto> getProductos(){
        return this.productoRepo.findAll();
    }
    
    public Producto getProducto(Long idproducto){
        return this.productoRepo.findById(idproducto).orElseThrow(()->new ProductoNoEncontradoException("Producto no existe."));
    }
    
    public Producto updateProducto(Producto producto){
        Producto productoId = productoRepo.findById(producto.getIdproducto()).get();
        productoId.setNompro(producto.getNompro());
        productoId.setPrecio(producto.getPrecio());
        
        return this.productoRepo.save(productoId);
    }
    
    public void deleteProducto(Long idproducto){
        this.productoRepo.deleteById(idproducto);
    }
}
