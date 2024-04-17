package com.example.productclient.client;
import com.example.productclient.model.Product;
import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name="product-service")
public interface ProductServiceClient {

    @GetMapping("/findByProductId/{productId}")
    Product findByProductId(@RequestParam(value = "productId") Long productId);

    @GetMapping("/queryAllProduct")
    List<Product> queryAllProduct();
    @GetMapping("/addProductByProductName/{productName}")
    String addProductByProductName(@RequestParam(value = "productName") String productName);

}