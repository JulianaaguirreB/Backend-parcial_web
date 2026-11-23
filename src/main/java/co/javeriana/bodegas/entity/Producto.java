package co.javeriana.bodegas.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String descripcion;
    @Column(nullable = false, precision = 14, scale = 2)
    private BigDecimal precio;
    @Column(nullable = false)
    private Integer cantidad;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "bodega_id", nullable = false)
    private Bodega bodega;

    public Producto() {}

    public Producto(String nombre, String descripcion, BigDecimal precio, Integer cantidad, Bodega bodega) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.bodega = bodega;
    }

    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public BigDecimal getPrecio() { return precio; }
    public Integer getCantidad() { return cantidad; }
    public Bodega getBodega() { return bodega; }
}
