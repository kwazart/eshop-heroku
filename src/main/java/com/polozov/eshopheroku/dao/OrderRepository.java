package com.polozov.eshopheroku.dao;

import com.polozov.eshopheroku.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
