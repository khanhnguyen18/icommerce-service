package org.icommerce.domain.repository;

import org.icommerce.domain.entity.Order;

public interface OrderRepository {
    void makeOrder(Order order);
}
