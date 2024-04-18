package com.example.inoutstoreclient.client;

import com.example.inoutstoreclient.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name="inoutStore-service",fallback = IOStoreServiceFallback.class)
public interface IOStoreServiceClient {

    @GetMapping("/findByProductId/{productId}")
    Product findByProductId(@RequestParam(value = "productId") Long productId);

    @GetMapping("/addStockByProductId/{productId}")
    String addStockByProduct(@RequestParam(value = "productId") Long productId);

    @GetMapping("/subStockByProductId/{productId}")
    String subStockByProduct(@RequestParam(value = "productId") Long productId);

}
