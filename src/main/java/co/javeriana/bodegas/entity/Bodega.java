package co.javeriana.bodegas.entity;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Bodega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 100)
    private String nombre;
    @Column(nullable = false, length = 200)
    private String ubicacion;
    @OneToMany(mappedBy = "bodega")
    private List<Producto> productos = new ArrayList<>();

    public Bodega() {}

    public Bodega(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public String getUbicacion() { return ubicacion; }
    public List<Producto> getProductos() { return productos; }
}
