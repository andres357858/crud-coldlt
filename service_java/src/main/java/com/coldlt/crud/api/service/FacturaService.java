/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coldlt.crud.api.service;

import com.coldlt.crud.api.model.Factura;
import org.springframework.stereotype.Component;

/**
 *
 * @author ANDRES
 */
public interface FacturaService {

    /**
     * Metodo para realizar el registro de una factura
     * @param factura
     * @return 
     */
    Factura registrarFactura(Factura factura);

}
