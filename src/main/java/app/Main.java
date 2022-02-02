package app;

import app.controller.*;
import app.entity.Cliente;
import app.entity.Producto;
import app.entity.Proveedore;
import app.repository.ProductoRepository;
import app.service.ProductoService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaexample");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        ProductoController productoController = new ProductoController(em);
        ClienteController clienteController = new ClienteController(em);
        ProveedoreController proveedoreController = new ProveedoreController(em);
        CategoriaController categoriaController = new CategoriaController(em);
        FacturaController facturaController = new FacturaController(em);
        VentaController ventaController = new VentaController(em);

        System.out.println(productoController.getProductAll());
        System.out.println("-----------------------------------");
        System.out.println(clienteController.getClienteAll());
        System.out.println("-----------------------------------");
        System.out.println(proveedoreController.getProveedoreAll());
        System.out.println("-----------------------------------");
        System.out.println(ventaController.getVentaAll());
        System.out.println("-----------------------------------");
        System.out.println(categoriaController.getCategoriaAll());
        System.out.println("-----------------------------------");
        System.out.println(facturaController.getFacturaAll());







    }
}
