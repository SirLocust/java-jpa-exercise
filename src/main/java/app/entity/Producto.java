package app.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "PRODUCTOS")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Producto {
    @Id
    @Column(name = "ID_PRODUCTO", nullable = false,length = 50)
    private String id;

    @Column(name = "DESCRIPCION", nullable = false, length = 50)
    private String descripcion;

    @Column(name = "PRECIO", nullable = false)
    private Double precio;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_CATEGORIA", nullable = false)
    private Categoria idCategoria;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_PROVEEDOR", nullable = false)
    private Proveedore idProveedor;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Producto producto = (Producto) o;
        return id != null && Objects.equals(id, producto.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}