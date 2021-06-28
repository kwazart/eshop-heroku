package com.polozov.eshopheroku.dao;

import com.polozov.eshopheroku.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
