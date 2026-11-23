# Bodegas - Backend

API REST con Java 21, Spring Boot, JPA y H2. Incluye entidades, repositorios, servicio y controlador de bodegas.

## Ejecución

Requiere Java 21 y Maven. Desde la carpeta del proyecto:

```bash
mvn spring-boot:run
```

Disponible en `http://localhost:8080`.

| Método | Ruta | Función |
| --- | --- | --- |
| POST | `/bodegas` | Registrar una bodega con nombre y ubicación |
| GET | `/bodegas` | Consultar bodegas con sus productos |

Ejemplo de cuerpo para POST:

```json
{"nombre":"Bodega Centro","ubicacion":"Bogotá"}
```

Cada producto pertenece a una bodega. En el primer inicio se guardan dos bodegas y tres productos de ejemplo. Los datos permanecen en `data/` entre ejecuciones. El frontend se conecta desde `http://localhost:4200`.
