package com.example.pasteleria_backend.controller;

import com.example.pasteleria_backend.model.Producto;
import com.example.pasteleria_backend.repository.ProductoRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
@CrossOrigin(origins = "*")
@Tag(name = "Gestión de Productos", description = "Operaciones CRUD del catálogo de pastelería y repostería")
public class ProductoController {

    @Autowired
    private ProductoRepository productoRepository;

    @GetMapping
    @Operation(summary = "Listar todos los productos", description = "Obtiene el listado completo de productos disponibles en el catálogo.")
    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener producto por ID", description = "Busca y retorna el detalle de un producto específico mediante su identificador.")
    public ResponseEntity<Producto> obtenerProducto(@PathVariable Long id) {
        return productoRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @Operation(summary = "Registrar nuevo producto", description = "Crea un nuevo producto en la base de datos asociado a una categoría.")
    public Producto crearProducto(@RequestBody Producto producto) {
        return productoRepository.save(producto);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Actualizar producto existente", description = "Modifica los datos (código, nombre, descripción, precio, stock o categoría) de un producto.")
    public ResponseEntity<Producto> actualizarProducto(@PathVariable Long id, @RequestBody Producto datos) {
        return productoRepository.findById(id)
                .map(prod -> {
                    prod.setCodigo(datos.getCodigo());
                    prod.setNombre(datos.getNombre());
                    prod.setDescripcion(datos.getDescripcion());
                    prod.setPrecio(datos.getPrecio());
                    prod.setStock(datos.getStock());
                    if (datos.getCategoria() != null) {
                        prod.setCategoria(datos.getCategoria());
                    }
                    return ResponseEntity.ok(productoRepository.save(prod));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar producto", description = "Elimina permanentemente un producto del catálogo según su ID.")
    public ResponseEntity<Void> eliminarProducto(@PathVariable Long id) {
        if (!productoRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        productoRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}