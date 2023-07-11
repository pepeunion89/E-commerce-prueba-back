package com.ecommerceprueba.ecommerceprueba.services;

import com.ecommerceprueba.ecommerceprueba.models.Venta;
import com.ecommerceprueba.ecommerceprueba.repository.VentaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class VentaService {
    
    private final VentaRepo ventaRepo;
    
    @Autowired
    public VentaService(VentaRepo ventaRepo){
        this.ventaRepo = ventaRepo;
    }
    
    public Venta addVenta(Venta venta){
        return this.ventaRepo.save(venta);
    }
    
    public List<Venta> getVentas(){
        return this.ventaRepo.findAll();
    }
    
    public void deleteVenta(Long idventa){
        this.ventaRepo.deleteById(idventa);
    }
    
}
