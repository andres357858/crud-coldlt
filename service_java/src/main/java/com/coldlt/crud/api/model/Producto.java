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
import org.springframework.stereotype.Component;

/**
 *
 * @author ANDRES
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="PRODUCTO")
public class Producto implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String codigo;
    private String nombre;
    private int valor;
}
