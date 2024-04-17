package com.example.productservice.mapper;

import com.example.productservice.po.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
public interface ProductMapper {
    @Select("select p.product_name as productName,p.price as price,p.stock as stock,p.id as id from product p where id = #{productId}")
    Product findByProductId(@Param("productId") Long productId);
    @Select("select p.id,p.product_name as productName,p.price as price,p.stock as stock from product p")
    List<Product> queryAllProduct();

    @Insert("insert into product(product_name, stock, price) values (#{productName}, #{stock}, #{price})")
    void addProduct(Product product);
}