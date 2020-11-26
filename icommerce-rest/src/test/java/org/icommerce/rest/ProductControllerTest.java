package org.icommerce.rest;

import org.icommerce.mapper.ProductCriteriaMapper;
import org.icommerce.mapper.ProductDTOMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class ProductControllerTest {

    @InjectMocks
    private ProductController productController;

    @Mock
    private ProductDTOMapper productDTOMapper;

    @Mock
    private ProductCriteriaMapper productCriteriaMapper;

    @Test
    public void search_should_work_correctly(){
        // Given
        // When
        // Then
    }
}