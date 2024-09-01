package com.kso;

import com.kso.entities.Product;
import com.kso.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ProductServiceApplication implements CommandLineRunner {

	@Autowired
	private ProductRepo repo;

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		List<Product> list = Arrays.asList(
				new Product("Biscuit",50.0),
				new Product("Paper",200.46),
				new Product("Table",200.68),
				new Product("Printer",500.50),
				new Product("Pen",20.0),
				new Product("Book",250.20),

				new Product("Chair",100.0)
		);
		repo.saveAll(list);

		List<Product> products = repo.findAll();
		products.forEach(System.out::println);

	}
}
