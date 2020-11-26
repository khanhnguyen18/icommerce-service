package org.icommerce.config;

        import org.icommerce.domain.repository.ProductRepository;
        import org.icommerce.service.ProductApplicationService;
        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationServiceConfiguration {

    @Bean
    ProductApplicationService productApplicationService(ProductRepository productRepository) {
        return new ProductApplicationService(productRepository);
    }
}
