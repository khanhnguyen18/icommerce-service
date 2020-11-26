package org.icommerce.data.jpa.spec.processor;

import org.icommerce.data.jpa.entity.ProductEntity;
import org.icommerce.domain.vo.ProductCriteria;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;

import static org.apache.commons.lang3.StringUtils.isBlank;

public class ProductNameProcessor implements ProductCriteriaProcessor {

    @Override
    public boolean needBuild(ProductCriteria productCriteria) {
        return !isBlank(productCriteria.getName());
    }

    @Override
    public Specification<ProductEntity> build(ProductCriteria productCriteria) {
        return (root, query, criteriaBuilder) -> {
            Path<String> childPath = root.get("name");
            Predicate predicate = criteriaBuilder.like(criteriaBuilder.lower(childPath), String.format("%%%s%%", productCriteria.getName()));
            return criteriaBuilder.or(predicate);
        };
    }
}
