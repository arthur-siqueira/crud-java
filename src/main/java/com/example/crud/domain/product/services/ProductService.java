package com.example.crud.domain.product.services;

import com.example.crud.domain.product.Product;
import com.example.crud.domain.product.ProductRequestDTO;
import com.example.crud.domain.product.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product createProduct(ProductRequestDTO productData) {
        Product newProduct = new Product(productData);
        return repository.save(newProduct);
    }

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

}
