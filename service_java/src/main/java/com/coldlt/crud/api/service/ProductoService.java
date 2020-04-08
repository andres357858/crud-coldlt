/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coldlt.crud.api.service;

import com.coldlt.crud.api.model.Producto;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author ANDRES
 */
public interface ProductoService {

    /**
     * Metodo para registrar un producto
     * @param producto 
     */
    void registarProducto(Producto producto);

    /**
     * Metodo para editar un producto
     * @param producto
     * @return 
     */
    List<Producto> editarProducto(Producto producto);

    /**
     * Metodo para consultar los productos registrados
     * @return 
     */
    List<Producto> consultarProductos();

    /**
     * Metodo para eliminar un producto
     * @param id
     * @return 
     */
    List<Producto> eliminarProductos(int id);

}
