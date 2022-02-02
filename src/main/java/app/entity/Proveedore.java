package app.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "PROVEEDORES")
@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class Proveedore {
    @Id
    @Column(name = "ID_PROVEEDOR", nullable = false, length = 50)
    private String id;

    @Column(name = "NOMBRE", nullable = false, length = 50)
    private String nombre;

    @Column(name = "DIRECCION", nullable = false, length = 50)
    private String direccion;

    @Column(name = "TELEFONO", nullable = false, length = 50)
    private String telefono;

    @OneToMany( mappedBy = "idProveedor" ,cascade =CascadeType.ALL )
    private List<Producto> productoList;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Proveedore that = (Proveedore) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}