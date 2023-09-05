package com.sntzr.service;

import com.sntzr.mapper.ProductMapper;
import com.sntzr.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
//Servicio de hacer las consultas en la Base de Datos en Mapper.
@Service //Estereotipo para decir que es un Servicio. Esto nos ahorra el conectase a varios repositorios, agrupar funcionalidad, etc.
@RequiredArgsConstructor// Crear constructores
public class ProductServiceImpl implements ProductService{

    private final ProductMapper mapper; //Inyección de dependencias.

    @Override
    public List<Product> findAll() {
        return mapper.findAll();
    }

    @Override
    public Product findById(int id) {
        return mapper.findById(id);
    }

    @Override
    public int deleteBydId(int id) {
        return mapper.deleteById(id);
    }

    @Override
    public int save(Product item) {
        return mapper.save(item);
    }

    @Override
    public int update(Product item) {
        return mapper.update(item);
    }
}