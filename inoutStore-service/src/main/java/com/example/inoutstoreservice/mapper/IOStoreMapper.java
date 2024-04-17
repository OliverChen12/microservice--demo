package com.example.inoutstoreservice.mapper;


import com.example.inoutstoreservice.po.Product;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


public interface IOStoreMapper {
    @Select("select p.product_name as productName,p.price as price,p.stock as stock,p.id as id from product p where id = #{productId}")
    Product findByProductId(@Param("productId") Long productId);

    @Update("update product set stock = stock + 1 where id = #{productId}")
    void addStockByProductId(@Param("productId") Long productId);

    @Update("update product set stock = stock - 1 where id = #{productId}")
    void subStockByProductId(@Param("productId") Long productId);

}