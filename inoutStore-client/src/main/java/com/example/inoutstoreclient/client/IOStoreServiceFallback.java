package com.example.inoutstoreclient.client;
import com.example.inoutstoreclient.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import java.util.List;
@Slf4j
@Component
public class IOStoreServiceFallback implements IOStoreServiceClient {
    @Override
    public Product findByProductId(Long productId) {
        log.info("findByProductId callback");
        return null;
    }

    @Override
    public String addStockByProduct(Long productId) {
        log.info("addStockByProduct callback");
        return null;
    }

    @Override
    public String subStockByProduct(Long productId) {
        log.info("subStockByProduct callback");
        return null;
    }


}
