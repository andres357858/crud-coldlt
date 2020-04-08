package com.coldlt.crud.api.dao;

import com.coldlt.crud.api.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ItemRepository extends JpaRepository<Item, Integer> {


}
