/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.services;

import com.tienda.entities.Producto;
import com.tienda.repositories.ProductoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

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
        return this.productoRepository.save(Producto);
    
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
    @Transactional
    public Optional<Producto> delete(Long id){
        Optional<Producto> producto = this.getById(id);
        if (producto.isPresent()){
            this.productoRepository.deleteById(id);
        }
        return producto;
    }
    
    
    @Override
    @Transactional
    public Optional<Producto> update(Long id, Producto producto) {
        Optional<Producto> producto1 = this.getById(id);
        if(producto1.isPresent()){
            Producto prod = producto1.orElseThrow();
            
            prod.setNombre(producto.getNombre());
            prod.setPrecio(prod.getPrecio());
            
            return Optional.of(this.productoRepository.save(producto));
        }
        
        return producto1;
    }
    
    
}
