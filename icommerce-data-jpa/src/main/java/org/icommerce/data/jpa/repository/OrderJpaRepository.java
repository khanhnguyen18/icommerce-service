package org.icommerce.data.jpa.repository;

import org.icommerce.data.jpa.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderJpaRepository extends JpaRepository<OrderEntity, Long> {
}
