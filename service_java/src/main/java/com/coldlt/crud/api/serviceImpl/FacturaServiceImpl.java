/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coldlt.crud.api.serviceImpl;

import com.coldlt.crud.api.dao.FacturaRepository;
import com.coldlt.crud.api.model.Factura;
import com.coldlt.crud.api.service.FacturaService;
import com.coldlt.crud.api.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author ANDRES
 */
@Component
public class FacturaServiceImpl implements FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    @Autowired
    private ItemService itemService;

    @Override
    public Factura registrarFactura(Factura factura) {

        /**
         * Se recorre el array de items para calacular el valor total de cada
         * item
         */
        factura.getItems().forEach(x -> x.setValorTotal(
                x.getCantidad() * x.getValorTotal()));

        /**
         * Se calcula el valor total de la factura y se le asigna a la variable
         * de valorTotal en la factura
         */
        int sum = factura.getItems().stream()
                .mapToInt(x -> x.getValorTotal())
                .sum();

        factura.setValorTotal(sum);

        /**
         * Se procede a almacenar en base de datos los items y la factura
         */
        itemService.registrarItem(factura.getItems());
        facturaRepository.save(factura);

        return factura;

    }



}
