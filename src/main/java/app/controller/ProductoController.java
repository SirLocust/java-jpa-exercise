package app.controller;

import app.repository.ProductoRepository;
import app.service.ProductoService;
import lombok.AllArgsConstructor;

import javax.persistence.EntityManager;


public class ProductoController {

    private final ProductoService productoService;
    public ProductoController(EntityManager em){
        this.productoService = new ProductoService(new ProductoRepository(em));
    }

    public String getProduct(String id){
        return productoService.find(id).toString();
    }
    public String getProductAll(){
        return productoService.findAll().toString();
    }
}
