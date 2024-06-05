package com.example.crudproduto.repository;

import com.example.crudproduto.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
