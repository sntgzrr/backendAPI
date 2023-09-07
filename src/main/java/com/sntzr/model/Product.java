package com.sntzr.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

//"Tabla de una Base de Datos. En este caso, Product"
@Data // Sirve para adquirir los Getters, Setters, ToString, RequiredConstructor, EqualsAndHashCode, HasCode (es un identificador).
@AllArgsConstructor //Genera constructor con parámetros.
@NoArgsConstructor  //Genera constructor sin parámetros.
public class Product {

    private int id;
    private String name;
    private boolean status;
}