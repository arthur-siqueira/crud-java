package com.example.crud.domain.product.repositories;

import com.example.crud.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, String> {
}
