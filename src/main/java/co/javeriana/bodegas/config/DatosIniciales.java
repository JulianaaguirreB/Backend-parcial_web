package co.javeriana.bodegas.config;

import co.javeriana.bodegas.entity.*;
import co.javeriana.bodegas.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import java.math.BigDecimal;
import java.util.List;

@Component
public class DatosIniciales implements CommandLineRunner {
    private final BodegaRepository bodegas;
    private final ProductoRepository productos;

    public DatosIniciales(BodegaRepository bodegas, ProductoRepository productos) {
        this.bodegas = bodegas;
        this.productos = productos;
    }

    @Override
    @Transactional
    public void run(String... args) {
        if (bodegas.count() != 0) return;
        Bodega norte = bodegas.save(new Bodega("Bodega Norte", "Bogotá - Norte"));
        Bodega sur = bodegas.save(new Bodega("Bodega Sur", "Bogotá - Sur"));
        productos.saveAll(List.of(
            new Producto("Computador portátil", "Computador para oficina", new BigDecimal("2500000"), 15, norte),
            new Producto("Monitor", "Monitor de 24 pulgadas", new BigDecimal("750000"), 20, norte),
            new Producto("Impresora", "Impresora multifuncional", new BigDecimal("1200000"), 8, sur)
        ));
    }
}
