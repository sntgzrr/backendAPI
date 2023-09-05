package com.sntzr.service;

import com.sntzr.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();
    Product findById(int id);
    int deleteBydId(int id);
    int save(Product item);
    int update(Product item);
}