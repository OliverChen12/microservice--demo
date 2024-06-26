package com.example.productclient.client;

import com.example.productclient.client.ProductServiceFallback;
import com.example.productclient.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@FeignClient(name="product-service", fallback = ProductServiceFallback.class)
public interface ProductServiceClient {

    @GetMapping("/findByProductId/{productId}")
    Product findByProductId(@RequestParam(value = "productId") Long productId);

    @GetMapping("/queryAllProduct")
    List<Product> queryAllProduct();
    @PostMapping("/addProduct")
    String addProduct(@RequestBody Product product);

}
