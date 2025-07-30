/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.repositories;

import com.tienda.entities.Persona;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Chuz
 */
public interface PersonaRepository extends CrudRepository<Persona, Long> {
    
}
