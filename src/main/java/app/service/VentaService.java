package app.service;

import app.entity.Venta;
import app.repository.VentaRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class VentaService {
    private VentaRepository ventaRepository;

    public Venta find(String id){
        return  ventaRepository.find(id);

    }
    public Venta save(Venta venta){
        return  ventaRepository.save(venta);
    }
    public void delete(String id){
        ventaRepository.delete(id);
    }
    public List<Venta> findAll(){
        return ventaRepository.findAll();
    }
}
