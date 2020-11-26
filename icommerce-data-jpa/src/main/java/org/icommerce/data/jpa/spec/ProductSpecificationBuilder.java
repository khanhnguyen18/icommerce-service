package org.icommerce.data.jpa.spec;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.icommerce.data.jpa.entity.ProductEntity;
import org.icommerce.data.jpa.spec.processor.ProductCriteriaProcessor;
import org.icommerce.domain.vo.ProductCriteria;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductSpecificationBuilder {

    List<ProductCriteriaProcessor> productCriteriaProcessors;

    public Specification<ProductEntity> build(ProductCriteria productCriteria) {
        Specification<ProductEntity> result = null;
        for (ProductCriteriaProcessor productCriteriaProcessor : productCriteriaProcessors) {
            if (productCriteriaProcessor.needBuild(productCriteria)) {
                Specification<ProductEntity> specification = productCriteriaProcessor.build(productCriteria);
                if (result == null) {
                    result = specification;
                } else {
                    result = result.and(specification);
                }
            }
        }
        return result;
    }
}
