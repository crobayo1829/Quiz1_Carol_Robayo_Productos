# Productos App

Aplicación web con Spring Boot y Thymeleaf que muestra un listado de productos.

## Requisitos

- Java 17 o superior
- Maven 3.6 o superior

## Ejecución

```bash
mvn spring-boot:run
```

También puedes generar y ejecutar un JAR:

```bash
mvn clean package
java -jar target/productos-app-1.0.0.jar
```

## Uso

Una vez iniciada la aplicación, abre en el navegador:

```
http://localhost:8080/productos
```

Verás una tabla con los productos (nombre, precio y categoría).

## Estructura

- `src/main/resources/templates/productos.html` – vista
- `src/main/resources/static/css/estilos.css` – estilos
- `src/main/java/co/javeriana/productos/` – código fuente