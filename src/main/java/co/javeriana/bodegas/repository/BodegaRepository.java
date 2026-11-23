package co.javeriana.bodegas.repository;

import co.javeriana.bodegas.entity.Bodega;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BodegaRepository extends JpaRepository<Bodega, Long> {
    @EntityGraph(attributePaths = "productos")
    List<Bodega> findAllByOrderByIdAsc();
}
