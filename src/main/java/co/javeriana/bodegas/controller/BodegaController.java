package co.javeriana.bodegas.controller;

import co.javeriana.bodegas.dto.*;
import co.javeriana.bodegas.service.BodegaService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/bodegas")
@CrossOrigin(origins = {"http://localhost:4200", "http://127.0.0.1:4200"})
public class BodegaController {
    private final BodegaService service;

    public BodegaController(BodegaService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BodegaResponse registrar(@Valid @RequestBody BodegaRequest request) {
        return service.registrar(request);
    }

    @GetMapping
    public List<BodegaResponse> consultar() {
        return service.consultar();
    }
}
