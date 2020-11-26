package org.icommerce;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.springframework.http.HttpMethod.GET;
import static org.springframework.http.HttpMethod.POST;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.request;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = {ICommerceApplication.class},
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class ICommerceApplicationIT {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void search_should_return_list_products() throws Exception {
        // Then
//        mockMvc.perform(request(POST, "/rest/api/v1/products/search"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$", hasSize(2)));
    }

    @Test
    void getById_should_get_product_with_latest_price() throws Exception {
        // Then
        mockMvc.perform(request(GET, "/rest/api/v1/products/1/detail"))
                .andExpect(status().isOk());

    }

    @Test
    void should_implement_search_feature_correctly() throws Exception {

    }
}