package com.coldlt.crud.api.main;

import com.coldlt.crud.api.dao.FacturaRepository;
import com.coldlt.crud.api.dao.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.coldlt.crud.api.model.Factura;
import com.coldlt.crud.api.model.Producto;
import com.coldlt.crud.api.service.FacturaService;
import com.coldlt.crud.api.service.ProductoService;
import com.coldlt.crud.api.serviceImpl.FacturaServiceImpl;
import com.coldlt.crud.api.serviceImpl.ProductoServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.MediaType;



@SpringBootApplication()
@RestController
@CrossOrigin(origins = "*")
@EntityScan(basePackages = {"com.coldlt.crud.api.model"})
@EnableJpaRepositories(basePackages = {"com.coldlt.crud.api.dao"})
@ComponentScan(basePackages = {"com.coldlt.crud.api.serviceImpl"})
public class CrudServiceApplication {

    @Autowired
    private ProductoService productoService;

    @Autowired
    private FacturaService facturaService;

    public static void main(String[] args) {
        SpringApplication.run(CrudServiceApplication.class, args);
    }

    @PostMapping("/registrarProducto")
    public String registrarProducto(@RequestBody Producto producto) {
        productoService.registarProducto(producto);
        return "Producto registrado: " + producto.getNombre();
    }

    @PostMapping(value = "/registrarFactura")
    public Factura registrarFactura(@RequestBody Factura factura) {
      
        return   facturaService.registrarFactura(factura);
    }

    @PutMapping("/editarProducto/{id}")
    public List<Producto> editar(@RequestBody Producto producto, @PathVariable("id") int id) {
        producto.setId(id);
        return productoService.editarProducto(producto);
    }

    @GetMapping("/consultarProductos")
    public List<Producto> consultarProductos() {

        return productoService.consultarProductos();
    }

    @DeleteMapping("/eliminarProducto/{id}")
    public List<Producto> eliminarProducto(@PathVariable int id) {

        productoService.eliminarProductos(id);

        return productoService.consultarProductos();
    }

}
