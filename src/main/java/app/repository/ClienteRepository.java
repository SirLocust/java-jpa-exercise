package app.repository;

import app.entity.Cliente;
import lombok.AllArgsConstructor;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
@AllArgsConstructor
public class ClienteRepository {

    private EntityManager em;

    public Cliente find(String id){
        return  em.find(Cliente.class, id);
    }
    public Cliente save(Cliente cliente){
        em.persist(cliente);
        return cliente;
    }
    public Cliente update(Cliente cliente){
        em.merge(cliente);
        return cliente;
    }
    public void delete(String id){
        Cliente cliente = find(id);
        if(cliente != null){
            em.remove(cliente);
        }
    }
    public List<Cliente> findAll(){
        Query query = em.createQuery("SELECT c FROM Cliente c");
        return  (List<Cliente>) query.getResultList();
    }
}
