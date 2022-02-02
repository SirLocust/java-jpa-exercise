package app.controller;

import app.repository.FacturaRepository;

import app.service.FacturaService;


import javax.persistence.EntityManager;


public class FacturaController {

    private final FacturaService facturaService;
    public FacturaController(EntityManager em){
        this.facturaService = new FacturaService(new FacturaRepository(em));
    }

    public String getFactura(String id){
        return facturaService.find(id).toString();
    }
    public String getFacturaAll(){
        return facturaService.findAll().toString();
    }
}
