package app.repository;

import app.entity.Producto;
import lombok.AllArgsConstructor;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@AllArgsConstructor
public class ProductoRepository {

    private EntityManager em;

    public Producto find(String id){
        return  em.find(Producto.class, id);
    }
    public Producto save(Producto producto){
        em.persist(producto);
        return producto;
    }
    public Producto update(Producto producto){
        em.merge(producto);
        return producto;
    }
    public void delete(String id){
        Producto producto = find(id);
        if(producto != null){
            em.remove(producto);
        }
    }
    public List<Producto> findAll(){
        Query query = em.createQuery("SELECT p FROM Producto v");
        return  (List<Producto>) query.getResultList();
    }
}
