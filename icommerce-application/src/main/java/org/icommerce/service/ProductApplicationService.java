package org.icommerce.service;

import lombok.AllArgsConstructor;
import org.icommerce.domain.entity.Product;
import org.icommerce.domain.repository.ProductRepository;

import java.util.List;

@AllArgsConstructor
public class ProductApplicationService {

    ProductRepository productRepository;

    public List<Product> search() {
        return productRepository.search();
    }
}
