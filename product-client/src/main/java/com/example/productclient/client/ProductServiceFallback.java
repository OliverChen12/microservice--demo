package com.example.productclient.client;

import com.example.productclient.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import java.util.List;

@Slf4j
@Component
public class ProductServiceFallback implements ProductServiceClient {
    @Override
    public Product findByProductId(Long productId) {
        log.info("findByProductId callback");
        return null;
    }
    @Override
    public List<Product> queryAllProduct() {
        log.info("queryAllProduct callback");
        return null;
    }

    @Override
    public String addProduct(Product product) {
        log.info("addProduct callback");
        return null;
    }

}
