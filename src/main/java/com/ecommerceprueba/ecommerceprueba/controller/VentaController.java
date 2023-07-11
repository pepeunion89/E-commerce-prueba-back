package com.ecommerceprueba.ecommerceprueba.controller;

import com.ecommerceprueba.ecommerceprueba.models.Venta;
import com.ecommerceprueba.ecommerceprueba.services.VentaService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/venta")
@CrossOrigin(origins="http://localhost:4200")
//@CrossOrigin(origins = "https://portfoliofrontend-716b2.web.app") este va a ser para el deploy
public class VentaController {
    
    private final VentaService ventaService;
    
    public VentaController(VentaService ventaService){
        this.ventaService = ventaService;
    }
    
    @PostMapping("/add")
    public ResponseEntity<Venta> addVenta(@RequestBody Venta venta){
        
        Venta nuevaVenta = ventaService.addVenta(venta);
        return new ResponseEntity<>(nuevaVenta, HttpStatus.CREATED);
        
    }
    
    
    @GetMapping("/lista")
    public ResponseEntity<List<Venta>> getVentas(){
        
        List<Venta> listVenta = ventaService.getVentas();
        return new ResponseEntity<>(listVenta, HttpStatus.OK);
        
    }
    
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Venta> deleteVenta(@PathVariable Long idventa){
        
        ventaService.deleteVenta(idventa);
        return new ResponseEntity<>(HttpStatus.OK);
        
    }
    
}
