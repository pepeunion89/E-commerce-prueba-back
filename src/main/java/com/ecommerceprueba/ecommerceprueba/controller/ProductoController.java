package com.ecommerceprueba.ecommerceprueba.controller;

import com.ecommerceprueba.ecommerceprueba.models.Producto;
import com.ecommerceprueba.ecommerceprueba.services.ProductoService;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producto")
@CrossOrigin(origins = "http://localhost:4200")
//@CrossOrigin(origins = "https://portfoliofrontend-716b2.web.app") este va a ser para el deploy
public class ProductoController {
    
    private final ProductoService productoService; 
    
    public ProductoController(ProductoService productoService){
        this.productoService = productoService;
    }
    
    @PostMapping("/add")
    public ResponseEntity<Producto> addProducto(@RequestBody Producto producto){
        
        Producto nuevoProducto = productoService.addProducto(producto);
        return new ResponseEntity<>(nuevoProducto, HttpStatus.CREATED);
        
    }
    
    @PutMapping("/update")
    public ResponseEntity<Producto> updateProducto(@RequestBody Producto producto){
        
        Producto modificarProducto = productoService.updateProducto(producto);
        return new ResponseEntity<>(modificarProducto, HttpStatus.OK);
        
    }
    
    
    @GetMapping("/lista")
    public ResponseEntity<List<Producto>> getProductos(){
        
        List<Producto> listProducto = productoService.getProductos();
        return new ResponseEntity<>(listProducto, HttpStatus.OK);
    }
    
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Producto> deleteProducto(@PathVariable Long id){
        
        productoService.deleteProducto(id);
        
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    
}
