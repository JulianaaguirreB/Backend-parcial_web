package co.javeriana.bodegas.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record BodegaRequest(
    @NotBlank @Size(max = 100) String nombre,
    @NotBlank @Size(max = 200) String ubicacion
) {}
