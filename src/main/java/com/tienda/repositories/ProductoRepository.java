/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.repositories;

import com.tienda.entities.Producto;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Chuz
 Esta claseINTERFACE define los metodos que tiene una clase pero no explica como se van a realizar.
 */
public interface ProductoRepository extends CrudRepository<Producto, Long> {
    
}
