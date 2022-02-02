package app.service;

import app.entity.Proveedore;
import app.repository.ProveedoreRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ProveedoreService {
    private ProveedoreRepository proveedoreRepository;

    public Proveedore find(String id){
        return  proveedoreRepository.find(id);

    }
    public Proveedore save(Proveedore proveedore){
        return  proveedoreRepository.save(proveedore);
    }
    public void delete(String id){
        proveedoreRepository.delete(id);
    }
    public List<Proveedore> findAll(){
        return proveedoreRepository.findAll();
    }
}
