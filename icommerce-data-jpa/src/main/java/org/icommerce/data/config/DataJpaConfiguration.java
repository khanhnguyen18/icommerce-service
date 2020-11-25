package org.icommerce.data.config;

import org.icommerce.data.adapter.ProductRepositoryAdapter;
import org.icommerce.data.jpa.entity.ProductEntity;
import org.icommerce.data.jpa.repository.ProductJpaRepository;
import org.icommerce.data.mapper.ProductDataMapper;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackageClasses = ProductEntity.class)
@EnableJpaRepositories(basePackageClasses = ProductJpaRepository.class)
public class DataJpaConfiguration {

    @Bean
    public ProductRepositoryAdapter productRepositoryAdapter(ProductJpaRepository productJpaRepository,
                                                             ProductDataMapper mapper) {
        return new ProductRepositoryAdapter(productJpaRepository, mapper);
    }

}
