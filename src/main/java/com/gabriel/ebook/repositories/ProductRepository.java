package com.gabriel.ebook.repositories;

import com.gabriel.ebook.model.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
}
