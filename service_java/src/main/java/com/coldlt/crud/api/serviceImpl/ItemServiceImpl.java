/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coldlt.crud.api.serviceImpl;

import com.coldlt.crud.api.dao.FacturaRepository;
import com.coldlt.crud.api.dao.ItemRepository;
import com.coldlt.crud.api.model.Item;
import com.coldlt.crud.api.service.ItemService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author ANDRES
 */
@Component
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public void registrarItem(ArrayList<Item> item) {

        /**
         * Se realiza una iteracion del ArrayList 
         * para almacenar en base de datos 
         */
        item.forEach(x -> itemRepository.save(x));
        
    }

}
