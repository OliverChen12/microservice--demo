package com.example.productservice.controller;

import com.example.productservice.mapper.ProductMapper;
import com.example.productservice.po.Product;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * 商品的服务控制层
 */
@AllArgsConstructor
@RestController
@Slf4j
public class ProductController {
    private final ProductMapper productMapper;
    /**
     * 根据商品 id 查询商品
     */
    @GetMapping("/findByProductId/{productId}")
    public Product findByProductId(@PathVariable Long productId) {
        Product product = productMapper.findByProductId(productId);
        log.info("-------------OK /findByProductId/{productId}----------- ---------");
        return product;
    }
    /**
     * 查询所有商品
     */
    @GetMapping("/queryAllProduct")
    public List<Product> findByProductId() {
        List<Product> productList = productMapper.queryAllProduct();
        log.info("-------------OK queryAllProduct--------------------");
        return productList;
    }

    @PostMapping("/addProduct")
    public String addProduct(@RequestBody Product product){
        productMapper.addProduct(product);
        return "添加商品成功！";
    }
}