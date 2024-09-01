package com.kso.services;

import com.kso.entities.Product;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public interface ProductService {

    Product saveProduct(Product product);
    Product updateProduct(Product product);
    Product findAllProduct();
    Product findByProductId(Integer pid);
    Product deleteProductById(Integer pid);


}
