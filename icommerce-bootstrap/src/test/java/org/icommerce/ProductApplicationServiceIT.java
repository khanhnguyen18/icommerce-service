package org.icommerce;

import org.icommerce.domain.entity.Product;
import org.icommerce.domain.vo.ProductCriteria;
import org.icommerce.service.ProductApplicationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = {ICommerceApplication.class})
class ProductApplicationServiceIT {

    @Autowired
    private ProductApplicationService productApplicationService;

    @Test
    void search_should_return_correct_list() {
        // Given
        ProductCriteria productCriteria = new ProductCriteria();
        productCriteria.setName("1");
        // When
        List<Product> products = productApplicationService.search(productCriteria);
        // Then
        assertThat(products).hasSize(1);
        assertThat(products.get(0).getName()).isEqualTo("Product 1");
        assertThat(products.get(0).getPrice()).isEqualTo(300);
    }

    @Test
    void getDetail_should_get_lastest_price() {
        // When
        Product product = productApplicationService.getDetail(1L);
        // Then
        assertThat(product.getPrice()).isEqualTo(300);
    }

}