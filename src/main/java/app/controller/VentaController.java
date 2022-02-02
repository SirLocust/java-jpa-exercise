package app.controller;

import app.repository.ProductoRepository;
import app.repository.VentaRepository;
import app.service.VentaService;


import javax.persistence.EntityManager;


public class VentaController {

    private final VentaService ventaService;
    public VentaController(EntityManager em){
        this.ventaService = new VentaService(new VentaRepository(em));
    }

    public String getVenta(String id){
        return ventaService.find(id).toString();
    }
    public String getVentaAll(){
        return ventaService.findAll().toString();
    }
}
