package org.icommerce;

import org.icommerce.domain.entity.Order;
import org.icommerce.domain.entity.OrderDetail;
import org.icommerce.domain.entity.Product;
import org.icommerce.service.OrderApplicationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest(classes = {ICommerceApplication.class})
class OrderApplicationServiceIT {

    @Autowired
    private OrderApplicationService orderApplicationService;


    @Test
    void makeOrder_should_work_correctly() {
        // Given
        List<OrderDetail> orderDetails = new ArrayList<>();
        Product product = Product.builder().id(1L).build();
        OrderDetail orderDetail = OrderDetail.builder()
                .quantity(2)
                .product(product)
                .build();
        orderDetails.add(orderDetail);

        Order order = Order.builder().orderDetails(orderDetails).build();
        // When
        orderApplicationService.makeOrder(order);
    }

}