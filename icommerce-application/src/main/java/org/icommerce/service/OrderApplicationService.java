package org.icommerce.service;

import lombok.AllArgsConstructor;
import org.icommerce.domain.entity.Order;
import org.icommerce.domain.entity.Product;
import org.icommerce.domain.repository.OrderRepository;
import org.icommerce.domain.repository.ProductRepository;
import org.icommerce.domain.vo.ProductCriteria;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@AllArgsConstructor
public class OrderApplicationService {

    OrderRepository orderRepository;

    public void makeOrder(Order order) {
        orderRepository.makeOrder(order);
    }

}
