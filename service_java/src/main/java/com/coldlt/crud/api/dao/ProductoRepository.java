package com.coldlt.crud.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coldlt.crud.api.model.Producto;

import java.util.List;
import org.springframework.stereotype.Component;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


public interface ProductoRepository extends JpaRepository<Producto, Integer> {

    List<Producto> findByNombre(String nombre);

}
