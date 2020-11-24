package org.icomemerce.data.jpa.repository;

import org.icomemerce.data.jpa.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductJpaRepository extends CrudRepository<ProductEntity, Long> {
}
