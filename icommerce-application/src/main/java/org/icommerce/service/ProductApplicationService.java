package org.icommerce.service;

import lombok.AllArgsConstructor;
import org.icommerce.domain.entity.Product;
import org.icommerce.domain.repository.ProductRepository;
import org.icommerce.domain.vo.ProductCriteria;

import java.util.List;

@AllArgsConstructor
public class ProductApplicationService {

    ProductRepository productRepository;

    public List<Product> search(ProductCriteria productCriteria) {
        return productRepository.search(productCriteria);
    }

    public Product getDetail(Long id){
        return productRepository.getDetail(id);
    }

}
