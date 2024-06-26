package com.example.productclient.controller;

import com.example.productclient.client.ProductServiceClient;

import com.example.productclient.model.Product;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@AllArgsConstructor
@RestController
@Slf4j
public class ProductServiceClientController {
    @Autowired
    private final ProductServiceClient prodServiceClient;

    @GetMapping("/findByProductId/{productId}")
    public Product findByProductId(@PathVariable Long productId) {
        Product product = prodServiceClient.findByProductId(productId);
        log.info("-------------In client findByProductId---------------");
        return product;
    }

    @GetMapping("/queryAllProduct")
    public List<Product> findByProductId() {
        List<Product> productList = prodServiceClient.queryAllProduct();
        log.info("--------------In client queryAllProduct--------------");
        return productList;
    }

    @PostMapping("/addProduct")
    public String addProductByProductName(Product product){
        log.info("-------------In client addProductByProductName---------------");
        return prodServiceClient.addProduct(product);
    }
}
