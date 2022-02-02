package app.repository;

import app.entity.Factura;
import lombok.AllArgsConstructor;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@AllArgsConstructor
public class FacturaRepository {

    private EntityManager em;

    public Factura find(String id){
        return  em.find(Factura.class, id);
    }
    public Factura save(Factura factura){
        em.persist(factura);
        return factura;
    }
    public Factura update(Factura factura){
        em.merge(factura);
        return factura;
    }
    public void delete(String id){
        Factura factura = find(id);
        if(factura != null){
            em.remove(factura);
        }
    }
    public List<Factura> findAll(){
        Query query = em.createQuery("SELECT f FROM Factura f");
        return  (List<Factura>) query.getResultList();
    }
}
