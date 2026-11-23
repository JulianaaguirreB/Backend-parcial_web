package co.javeriana.bodegas.service;

import co.javeriana.bodegas.dto.*;
import co.javeriana.bodegas.entity.Bodega;
import co.javeriana.bodegas.repository.BodegaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class BodegaService {
    private final BodegaRepository repository;

    public BodegaService(BodegaRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public BodegaResponse registrar(BodegaRequest request) {
        return convertir(repository.save(new Bodega(request.nombre().trim(), request.ubicacion().trim())));
    }

    @Transactional(readOnly = true)
    public List<BodegaResponse> consultar() {
        return repository.findAllByOrderByIdAsc().stream().map(this::convertir).toList();
    }

    private BodegaResponse convertir(Bodega bodega) {
        var productos = bodega.getProductos().stream()
            .map(p -> new ProductoResponse(p.getId(), p.getNombre(), p.getDescripcion(), p.getPrecio(), p.getCantidad()))
            .toList();
        return new BodegaResponse(bodega.getId(), bodega.getNombre(), bodega.getUbicacion(), productos);
    }
}
