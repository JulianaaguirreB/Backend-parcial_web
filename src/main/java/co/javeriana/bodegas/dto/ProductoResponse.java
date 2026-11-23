package co.javeriana.bodegas.dto;

import java.math.BigDecimal;

public record ProductoResponse(Long id, String nombre, String descripcion, BigDecimal precio, Integer cantidad) {}
