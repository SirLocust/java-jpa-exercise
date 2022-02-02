package app;

import app.entity.Cliente;
import app.entity.Proveedore;
import app.service.ClienteService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaexample");
        EntityManager em = emf.createEntityManager();
    }
}
