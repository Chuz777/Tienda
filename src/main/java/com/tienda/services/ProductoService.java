/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.services;

import com.tienda.entities.Producto;
import com.tienda.repositories.ProductoRepository;
import jakarta.transaction.Transactional;
import javax.lang.model.SourceVersion;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Chuz
 */
@Service
public class ProductoService implements IProductoService{
    @Autowired
    ProductoRepository productoRepository;
    @Override
    @Transactional
    public Producto save(Producto Producto){
        return this.productoRepository.save(producto);
    
    }

    @Override
    @Transactional(readOnly = true)
    public List<Producto> findAll(){
        return (List<Producto>) this.productoRepository.findAll();
        
        
    }
    @Override
    @Transactional(readOnly = true)
    public Optional<Producto> getById(Long id){
        return this.productoRepository.findById(id);
    }
    
    @Override
    @Transactional(readOnly = true)
    public Optional<Producto> delete(Long id){
        Optional<Producto> producto = this.getById(id);
        if (producto.isPresent()){
            this.productoRepository.deleteById(id);
        }
        return producto;
    }
    
    
}
