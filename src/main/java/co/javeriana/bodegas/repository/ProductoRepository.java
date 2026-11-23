package co.javeriana.bodegas.repository;

import co.javeriana.bodegas.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {}
