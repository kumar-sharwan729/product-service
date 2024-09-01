package com.kso.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer pid;

    @Column(name = "product_name", nullable = false)
    private String pname;

    @Column(name = "product_price")
    private Double price;

    public Product(String pname, Double price){
        this.pname = pname;
        this.price = price;
    }


    /**
     * production.products
     * * product_id
     * product name
     * brand id
     * category_id
     * model_year
     * list_price
     */
}
