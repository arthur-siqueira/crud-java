package com.example.crud.domain.product.services;

import com.example.crud.domain.product.Product;
import com.example.crud.domain.product.ProductRequestDTO;
import com.example.crud.domain.product.repositories.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
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

    public Product updateProduct(String id, ProductRequestDTO productData) {
        Product product = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Product with ID " + id + " not found"));

        product.setName(productData.name());
        product.setPrice(productData.price());
        return repository.save(product);
    }

    public void deleteProduct(String id) {
        if (!repository.existsById(id)) {
            throw new EntityNotFoundException("Product with ID " + id + "not found");
        }
        repository.deleteById(id);
    }

}
