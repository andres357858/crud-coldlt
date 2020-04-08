package com.coldlt.crud.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coldlt.crud.api.model.Factura;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


public interface FacturaRepository extends JpaRepository<Factura, Integer> {


}
