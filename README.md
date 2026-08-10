# Productos App

Aplicación web con Spring Boot y Thymeleaf que muestra un listado de productos.

## Ejecución

```bash
mvn spring-boot:run
```

## Uso

Una vez iniciada la aplicación, abrir en el navegador:

```
http://localhost:8080/productos
```

Mostrará una tabla con los productos (nombre, precio y categoría).

## Estructura

- `src/main/resources/templates/productos.html` – vista
- `src/main/resources/static/css/estilos.css` – estilos
- `src/main/java/co/javeriana/productos/` – código fuente
