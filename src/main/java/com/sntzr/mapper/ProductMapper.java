package com.sntzr.mapper;

import com.sntzr.model.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;
//Uso de MyBatis para la interacción a consulta de datos.
@Mapper //"Librería MapScrtuct" (MAPEO DE OBJETOS).
public interface ProductMapper {

    @Select("SELECT * FROM Product")
    List<Product> findAll();

    @Select("SELECT * FROM Product WHERE id = #{id}")
    Product findById(@Param("id") int id); //Recibe un parámetro "id".

    @Delete("DELETE FROM Product WHERE id = #{id}")
    int deleteById(@Param("id") int id); //Recibe un parámetro "id".

    @Insert("INSERT INTO Product(name, status) VALUES (#{name}, #{status})")
    int save(Product item);

    @Update("UPDATE Product SET name=#{name}, status=#{status} WHERE id=#{id}")
    int update(Product item);
}