package org.icommerce.data.jpa.spec.processor;

import org.icommerce.data.jpa.entity.ProductEntity;
import org.icommerce.domain.vo.Colour;
import org.icommerce.domain.vo.ProductCriteria;
import org.springframework.data.jpa.domain.Specification;

public class ProductColourProcessor implements ProductCriteriaProcessor {

    @Override
    public boolean needBuild(ProductCriteria productCriteria) {
        return productCriteria.getColour() != Colour.UNKNOWN;
    }

    @Override
    public Specification<ProductEntity> build(ProductCriteria productCriteria) {
        return (root, query, criteriaBuilder)
                        -> criteriaBuilder.or(criteriaBuilder.equal(root.get("colour"), productCriteria.getColour()));
    }
}
