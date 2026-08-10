package co.javeriana.productos.controller;

import co.javeriana.productos.model.Producto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductoController {

    @GetMapping("/productos")
    public String listarProductos(Model model) {

        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Computador", 2500000, "Tecnología"));
        productos.add(new Producto("Teclado", 120000, "Tecnología"));
        productos.add(new Producto("Escritorio", 750000, "Oficina"));
        productos.add(new Producto("Silla", 450000, "Oficina"));
        productos.add(new Producto("Monitor", 980000, "Tecnología"));
        productos.add(new Producto("Lámpara de escritorio", 85000, "Oficina"));

        model.addAttribute("productos", productos);

        return "productos";
    }
}
