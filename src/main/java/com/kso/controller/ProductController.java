package com.kso.controller;

import com.kso.entities.Product;
import com.kso.services.ProductServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductController {

    Logger log = LoggerFactory.getLogger(ProductController.class);

    private final ProductServiceImpl productService;
    public ProductController(ProductServiceImpl productService) {
        this.productService = productService;
    }

    public void addProduct(@RequestBody Product product){
        productService.saveProduct(product);
        log.info("addProduct");
    }
}
