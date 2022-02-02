package app.service;

import app.entity.Factura;
import app.repository.ClienteRepository;
import app.repository.FacturaRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class FacturaService {
    private FacturaRepository facturaRepository;

    public Factura find(String id){
        return  facturaRepository.find(id);

    }
    public Factura save(Factura factura){
        return  facturaRepository.save(factura);
    }
    public void delete(String id){
        facturaRepository.delete(id);
    }
    public List<Factura> findAll(){
        return facturaRepository.findAll();
    }
}
