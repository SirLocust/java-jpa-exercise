package app.controller;

import app.repository.ProveedoreRepository;
import app.service.ProveedoreService;

import javax.persistence.EntityManager;


public class ProveedoreController {

    private final ProveedoreService proveedoreService;
    public ProveedoreController(EntityManager em){
        this.proveedoreService = new ProveedoreService(new ProveedoreRepository(em));
    }

    public String getProveedore(String id){
        return proveedoreService.find(id).toString();
    }
    public String getProveedoreAll(){
        return proveedoreService.findAll().toString();
    }
}
