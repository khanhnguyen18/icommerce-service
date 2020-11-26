package org.icommerce.data.jpa.spec.processor;

import org.icommerce.data.jpa.entity.ProductEntity;
import org.icommerce.domain.vo.ProductCriteria;
import org.springframework.data.jpa.domain.Specification;

public interface ProductCriteriaProcessor {
    boolean needBuild(ProductCriteria productCriteria);

    Specification<ProductEntity> build(ProductCriteria productCriteria);
}
