package app.controller;

import app.repository.CategoriaRepository;
import app.repository.VentaRepository;
import app.service.CategoriaService;

import javax.persistence.EntityManager;


public class CategoriaController {

    private final CategoriaService categoriaService;
    public CategoriaController(EntityManager em){
        this.categoriaService = new CategoriaService(new CategoriaRepository(em));
    }

    public String getCategoria(String id){
        return categoriaService.find(id).toString();
    }
    public String getCategoriaAll(){
        return categoriaService.findAll().toString();
    }
}
