package com.coldlt.crud.api.model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ANDRES
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="ITEM")
public class Item implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String producto;
    private int cantidad;
    private int valorTotal;
}