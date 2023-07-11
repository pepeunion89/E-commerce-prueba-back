package com.ecommerceprueba.ecommerceprueba.controller;

import com.ecommerceprueba.ecommerceprueba.models.Stock;
import com.ecommerceprueba.ecommerceprueba.services.StockService;
import java.util.List;
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
@RequestMapping("/stock")
@CrossOrigin(origins = "http://localhost:4200")
//@CrossOrigin(origins = "https://portfoliofrontend-716b2.web.app") este va a ser para el deploy
public class StockController {
    
    private final StockService stockService;
    
    public StockController(StockService stockService){
        this.stockService = stockService;
    }
    
    @PostMapping("/add")
    public ResponseEntity<Stock> addStock(@RequestBody Stock stock){
        
        Stock nuevoStock = this.stockService.addStock(stock);
        return new ResponseEntity<>(nuevoStock, HttpStatus.CREATED);
        
    }
    
    @PutMapping("/update")
    public ResponseEntity<Stock> updateStock(@RequestBody Stock stock){
        
        Stock modificarStock = stockService.updateStock(stock);
        return new ResponseEntity<>(modificarStock, HttpStatus.OK);
        
    }    
    
    @GetMapping("/lista")
    public ResponseEntity<List<Stock>> getStock(){
        
        List<Stock> listStock = stockService.getStock();
        return new ResponseEntity<>(listStock, HttpStatus.OK);
        
    }    
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Stock> deleteStock(@PathVariable Long idstock){
        
        stockService.deleteStock(idstock);
        return new ResponseEntity<>(HttpStatus.OK);
        
    }
    
}
