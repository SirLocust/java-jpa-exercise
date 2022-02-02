package app.repository;

import app.entity.Proveedore;
import lombok.AllArgsConstructor;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@AllArgsConstructor
public class ProveedoreRepository {

    private EntityManager em;

    public Proveedore find(String id){
        return  em.find(Proveedore.class, id);
    }
    public Proveedore save(Proveedore proveedore){
        em.persist(proveedore);
        return proveedore;
    }
    public Proveedore update(Proveedore proveedore){
        em.merge(proveedore);
        return proveedore;
    }
    public void delete(String id){
        Proveedore proveedore = find(id);
        if(proveedore != null){
            em.remove(proveedore);
        }
    }
    public List<Proveedore> findAll(){
        Query query = em.createQuery("SELECT pro FROM Proveedore pro");
        return  (List<Proveedore>) query.getResultList();
    }
}
