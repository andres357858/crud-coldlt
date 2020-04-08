/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coldlt.crud.api.service;

import com.coldlt.crud.api.model.Item;
import java.util.ArrayList;
import org.springframework.stereotype.Component;

/**
 *
 * @author ANDRES
 */

public interface ItemService {
    
    /**
     * Metodo para registrar los items de una factura
     * @param item 
     */
    void registrarItem (ArrayList<Item> item);
    
}
