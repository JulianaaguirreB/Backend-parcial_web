Backend de bodegas y productos.

Requiere Java 21 y Maven.
Para iniciar, abrir una terminal en esta carpeta y ejecutar: mvn spring-boot:run
La direccion es http://localhost:8080

POST /bodegas registra una bodega con nombre y ubicacion.
GET /bodegas consulta las bodegas con sus productos.

Al iniciar por primera vez se guardan dos bodegas y tres productos de ejemplo.
Los datos quedan guardados en la carpeta data.
