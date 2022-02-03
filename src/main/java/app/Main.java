package app;

import app.controller.*;
import app.entity.Cliente;
import app.entity.Producto;
import app.entity.Proveedore;
import app.repository.ProductoRepository;
import app.service.ProductoService;
import app.utils.HibernateUtil;
import org.hibernate.Session;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {
    public static void main(String[] args) {
        HibernateUtil.buildSessionFactory();
        Session session = HibernateUtil.getCurrentSession().getSession();

        ProductoController productoController = new ProductoController(session);
        ClienteController clienteController = new ClienteController(session);
        ProveedoreController proveedoreController = new ProveedoreController(session);
        CategoriaController categoriaController = new CategoriaController(session);
        FacturaController facturaController = new FacturaController(session);
        VentaController ventaController = new VentaController(session);

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
