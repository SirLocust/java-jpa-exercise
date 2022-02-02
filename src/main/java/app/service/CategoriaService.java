package app.service;

import app.entity.Categoria;
import app.repository.CategoriaRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class CategoriaService {
    private CategoriaRepository categoriaRepository;

    public Categoria find(String id){
        return  categoriaRepository.find(id);

    }
    public Categoria save(Categoria categoria){
        return  categoriaRepository.save(categoria);
    }
    public void delete(String id){
        categoriaRepository.delete(id);
    }
    public List<Categoria> findAll(){
        return categoriaRepository.findAll();
    }
}
