package com.example.inoutstoreservice.controller;


import com.example.inoutstoreservice.mapper.IOStoreMapper;
import com.example.inoutstoreservice.po.Product;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 商品的服务控制层
 */
@AllArgsConstructor
@RestController
@Slf4j
public class IOStoreController {
    private final IOStoreMapper IOStoreMapper;
    /**
     * 根据商品 id 查询商品
     */
    @GetMapping("/findByProductId/{productId}")
    public Product findByProductId(@PathVariable Long productId) throws InterruptedException{
        Product product = IOStoreMapper.findByProductId(productId);
        log.info("-------------OK /findByProductId/{productId}----------- ---------");
        return product;
    }

    @GetMapping("/addStockByProductId/{productId}")
    public String addStockByProductId(@PathVariable Long productId) throws InterruptedException{
        IOStoreMapper.addStockByProductId(productId);
        return "添加库存成功！";
    }

    @GetMapping("/subStockByProductId/{productId}")
    public String subStockByProductId(@PathVariable Long productId) throws InterruptedException{
        Product product = IOStoreMapper.findByProductId(productId);
        if(product.getStock() <= 0){
            return "库存不足，扣减失败！";
        } else {
            IOStoreMapper.subStockByProductId(productId);
            return "扣减库存成功！";
        }
    }

}