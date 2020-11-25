package org.icommerce.data.jpa.repository;

import org.icommerce.data.jpa.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProductJpaRepository extends JpaRepository<ProductEntity, Long> {
}
