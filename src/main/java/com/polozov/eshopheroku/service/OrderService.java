package com.polozov.eshopheroku.service;

import com.polozov.eshopheroku.domain.Order;

public interface OrderService {
    void saveOrder(Order order);
    Order getOrder(Long id);
}
