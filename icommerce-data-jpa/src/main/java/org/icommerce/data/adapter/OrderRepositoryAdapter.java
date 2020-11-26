package org.icommerce.data.adapter;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.icommerce.data.jpa.entity.OrderDetailEntity;
import org.icommerce.data.jpa.entity.OrderEntity;
import org.icommerce.data.jpa.repository.OrderJpaRepository;
import org.icommerce.data.mapper.OrderDataMapper;
import org.icommerce.domain.entity.Order;
import org.icommerce.domain.repository.OrderRepository;

import java.time.LocalDateTime;

@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class OrderRepositoryAdapter implements OrderRepository {

    OrderJpaRepository orderJpaRepository;
    OrderDataMapper mapper;


    @Override
    public void makeOrder(Order order) {
        OrderEntity orderEntity = mapper.map(order);
        orderEntity.setDateTime(LocalDateTime.now());

        for (OrderDetailEntity detail : orderEntity.getOrderDetails()) {
            detail.setOrder(orderEntity);
        }
        orderJpaRepository.save(orderEntity);
    }
}
