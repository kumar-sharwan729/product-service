package com.kso.services;

import java.util.List;

import com.kso.entities.Product;

public interface ProductService {

    Product saveProduct(Product product);
    Product updateProduct(Product product);
    List<Product> findAllProduct();
    Product findByProductId(Integer pid);
    String deleteProductById(Integer pid);


}
