package com.gabriel.ebook.controllers;

import com.gabriel.ebook.model.dtos.ProductReceivedDTO;
import com.gabriel.ebook.model.entities.Product;
import com.gabriel.ebook.services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody ProductReceivedDTO productReceivedDTO){
        Product product = productService.createProduct(productReceivedDTO);
        return new ResponseEntity<>(product, HttpStatus.CREATED);
    }
}
