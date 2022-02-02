package app.entity;

import javax.persistence.*;

@Entity
@Table(name = "VENTAS")
public class Venta {
    @Id
    @Column(name = "ID_VENTA", nullable = false, length = 50)
    private String id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_FACTURA", nullable = false)
    private Factura idFactura;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_PRODUCTO", nullable = false)
    private Producto idProducto;

    @Column(name = "CANTIDAD", nullable = false, length = 50)
    private String cantidad;

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    public Factura getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Factura idFactura) {
        this.idFactura = idFactura;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}