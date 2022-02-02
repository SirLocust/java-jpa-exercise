package app.repository;

import app.entity.Venta;
import lombok.AllArgsConstructor;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@AllArgsConstructor
public class VentaRepository {

    private EntityManager em;

    public Venta find(String id){
        return  em.find(Venta.class, id);
    }
    public Venta save(Venta venta){
        em.persist(venta);
        return venta;
    }
    public Venta update(Venta venta){
        em.merge(venta);
        return venta;
    }
    public void delete(String id){
        Venta venta = find(id);
        if(venta != null){
            em.remove(venta);
        }
    }
    public List<Venta> findAll(){
        Query query = em.createQuery("SELECT v FROM Venta v");
        return  (List<Venta>) query.getResultList();
    }
}
