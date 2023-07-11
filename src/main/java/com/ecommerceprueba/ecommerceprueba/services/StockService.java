package com.ecommerceprueba.ecommerceprueba.services;

import com.ecommerceprueba.ecommerceprueba.exception.StockNoEncontradoException;
import com.ecommerceprueba.ecommerceprueba.models.Stock;
import com.ecommerceprueba.ecommerceprueba.repository.StockRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StockService {
    
    private final StockRepo stockRepo;
    
    @Autowired
    public StockService(StockRepo stockRepo){
        this.stockRepo = stockRepo;
    }
    
    public Stock addStock(Stock stock){
        return this.stockRepo.save(stock);
    }
    
    public List<Stock> getStock(){
        return this.stockRepo.findAll();
    }
    
    public Stock getStock(Long idstock){
        return this.stockRepo.findById(idstock).orElseThrow(()-> new StockNoEncontradoException("Stock no encontrado."));
    }
    
    public Stock updateStock(Stock stock){
        Stock idStock = stockRepo.findById(stock.getIdstock()).get();
        idStock.setNompro(stock.getNompro());
        idStock.setCantidad(stock.getCantidad());
        
        return this.stockRepo.save(idStock);
    }
    
    public void deleteStock(Long id){
        this.stockRepo.deleteById(id);
    }
    
}
