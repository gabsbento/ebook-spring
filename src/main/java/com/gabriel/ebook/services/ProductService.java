package com.gabriel.ebook.services;

import com.gabriel.ebook.model.dtos.ProductReceivedDTO;
import com.gabriel.ebook.model.entities.Product;
import com.gabriel.ebook.repositories.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(ProductReceivedDTO productReceivedDTO){
        Product product = new Product();
        product.setName(productReceivedDTO.getName());
        product.setPrice(productReceivedDTO.getPrice());
        product.setQuantity(productReceivedDTO.getQuantity());
        return productRepository.save(product);
    }
}
