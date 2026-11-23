Backend de bodegas y productos.

API REST desarrollada con Java 21, Spring Boot, JPA y H2. El proyecto esta separado en entidades, repositorios, servicio y controlador de bodegas.

Para ejecutarlo se necesita Java 21 y Maven. Abrir una terminal en la carpeta del proyecto y ejecutar: mvn spring-boot:run

El backend queda disponible en http://localhost:8080

POST /bodegas permite registrar una bodega enviando su nombre y ubicacion. Por ejemplo: {"nombre":"Bodega Centro","ubicacion":"Bogota"}

GET /bodegas permite consultar las bodegas junto con sus productos. Cada producto incluye id, nombre, descripcion, precio y cantidad. La respuesta no repite la bodega dentro de cada producto.

Una bodega puede tener varios productos y cada producto pertenece obligatoriamente a una sola bodega. Hay un repositorio para cada entidad.

Al iniciar por primera vez se guardan Bodega Norte y Bodega Sur, junto con un computador portatil, un monitor y una impresora. Los datos se guardan mediante los repositorios y permanecen en la carpeta data entre ejecuciones.

El frontend se ejecuta por separado en http://localhost:4200 y consume los endpoints de bodegas. No se incluyen operaciones para editar o eliminar, autenticacion ni un controlador de productos.
