package com.gabriel.ebook.services;

import com.gabriel.ebook.model.dtos.ProductReceivedDTO;
import com.gabriel.ebook.model.entities.Product;

public interface IProductService {
    Product createProduct(ProductReceivedDTO productReceivedDTO);
}
