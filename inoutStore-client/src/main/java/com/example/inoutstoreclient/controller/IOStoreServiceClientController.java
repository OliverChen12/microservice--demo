package com.example.inoutstoreclient.controller;

import com.example.inoutstoreclient.client.IOStoreServiceClient;
import com.example.inoutstoreclient.model.Product;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@AllArgsConstructor
@RestController
@Slf4j
public class IOStoreServiceClientController {
    @Autowired
    private final IOStoreServiceClient IOStoreServiceClient;

    @GetMapping("/findByProductId/{productId}")
    public Product findByProductId(@PathVariable Long productId) {
        Product product = IOStoreServiceClient.findByProductId(productId);
        log.info("-------------In client findByProductId---------------");
        return product;
    }

    @GetMapping("/addStockByProductId/{productId}")
    public String addStockByProductId(@PathVariable Long productId){
        log.info("-------------In client addStockByProduct---------------");
        return IOStoreServiceClient.addStockByProduct(productId);
    }

    @GetMapping("/subStockByProductId/{productId}")
    public String subStockByProductId(@PathVariable Long productId){
        log.info("-------------In client subStockByProduct---------------");
        return IOStoreServiceClient.subStockByProduct(productId);
    }

}
