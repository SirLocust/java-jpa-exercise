package app.repository;

import app.entity.Categoria;
import lombok.AllArgsConstructor;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@AllArgsConstructor
public class CategoriaRepository {

    private EntityManager em;

    public Categoria find(String id){
        return  em.find(Categoria.class, id);
    }
    public Categoria save(Categoria categoria){
        em.persist(categoria);
        return categoria;
    }
    public Categoria update(Categoria categoria){
        em.merge(categoria);
        return categoria;
    }
    public void delete(String id){
        Categoria categoria = find(id);
        if(categoria != null){
            em.remove(categoria);
        }
    }
    public List<Categoria> findAll(){
        Query query = em.createQuery("SELECT c FROM Categoria c");
        return  (List<Categoria>) query.getResultList();
    }
}
