package com.kso.services;

import com.kso.entities.Product;
import com.kso.repo.ProductRepo;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService{

    private ProductRepo productRepo;

    
    @Override
    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        Product existingProduct = findByProductId(product.getPid());

        BeanUtils.copyProperties(existingProduct,Product.class);
        existingProduct.setPname(product.getPname());
        existingProduct.setPrice(product.getPrice());
        
        return productRepo.save(existingProduct);
    }

    @Override
    public List<Product> findAllProduct() {
        return productRepo.findAll();
    }

    @Override
    public Product findByProductId(Integer pid) {
        Optional<Product> existingProduct = productRepo.findById(pid);
        if (existingProduct.isEmpty()) {
            throw new NoSuchElementException("The Product ID is Found");
        }
        return existingProduct.get();
    }

    @Override
    public String deleteProductById(Integer pid) {
        Product existProduct = findByProductId(pid);
        productRepo.delete(existProduct);
        return "Product Deleted Successfully";
    }
}
