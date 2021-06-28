package com.polozov.eshopheroku.service;

import com.polozov.eshopheroku.dto.ProductDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> getAll();

    void addToUserBucket(Long productId, String username);

    void addProduct(ProductDto dto);

    ProductDto getById(Long id);
}
