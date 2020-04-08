/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coldlt.crud.api.serviceImpl;

import com.coldlt.crud.api.model.Producto;
import com.coldlt.crud.api.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.coldlt.crud.api.dao.ProductoRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author ANDRES
 */
@Component
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository repository;

    @Override
    public void registarProducto(Producto producto) {

        repository.save(producto);

    }

    @Override
    public List<Producto> editarProducto(Producto producto) {
        
        repository.save(producto);
         return  repository.findAll();
    }

    @Override
    public List<Producto> consultarProductos() {

        return repository.findAll();

    }

    @Override
    public List<Producto> eliminarProductos(int id) {

        repository.deleteById(id);

        return repository.findAll();
    }

}
