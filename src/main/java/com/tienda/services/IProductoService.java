package com.tienda.services;

import com.tienda.entities.Producto;
import java.util.List;
import java.util.Optional;

public interface IProductoService {

    Producto save(Producto producto);

    List<Producto> findAll();

    Optional<Producto> getById(Long id);

    Optional<Producto> delete(Long id);

    Optional<Producto> update(Long id, Producto producto);
}