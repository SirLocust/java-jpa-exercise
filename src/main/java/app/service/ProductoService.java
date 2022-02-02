package app.service;

import app.entity.Producto;
import app.repository.ProductoRepository;
import app.repository.VentaRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ProductoService {
    private ProductoRepository productoRepository;

    public Producto find(String id){
        return  productoRepository.find(id);

    }
    public Producto save(Producto producto){
        return  productoRepository.save(producto);
    }
    public void delete(String id){
        productoRepository.delete(id);
    }
    public List<Producto> findAll(){
        return productoRepository.findAll();
    }
}
