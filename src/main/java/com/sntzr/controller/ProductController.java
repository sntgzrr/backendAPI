package com.sntzr.controller;

import com.sntzr.model.Product;
import com.sntzr.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //API REST.
@RequestMapping("/products") //URL "/products"
@RequiredArgsConstructor //Crear constructores
public class ProductController {

    private final ProductService service; //Inyección de dependencias.

//Métodos HTTP.
    @GetMapping
    public List<Product> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable("id") int id){ //PathVariable define a un parámetro como variable dentro de la URL.
        return service.findById(id);
    }

    @PostMapping
    public int save(@RequestBody Product product){ //RequestBody permite enviar información del cuerpo del producto al servidor.
        return service.save(product);
    }

    @PutMapping
    public int update(@RequestBody Product product){
        return service.update(product);
    }

    @DeleteMapping("/{id}")
    public int deleteById(@PathVariable("id") int id){
        return service.deleteBydId(id);
    }
}