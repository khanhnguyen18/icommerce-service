package org.icommerce.mapper;

import org.icommerce.domain.entity.Order;
import org.icommerce.domain.entity.OrderDetail;
import org.icommerce.dto.OrderDTO;
import org.icommerce.dto.OrderDetailDTO;
import org.mapstruct.Mapper;

import java.util.List;

import static org.mapstruct.NullValueCheckStrategy.ALWAYS;
import static org.mapstruct.NullValuePropertyMappingStrategy.SET_TO_NULL;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = SET_TO_NULL,
        nullValueCheckStrategy = ALWAYS
)
public interface OrderDTOMapper {
    Order map(OrderDTO orderDTO);

    OrderDetail mapOrderDetail(OrderDetailDTO orderDetailDTO);

    List<OrderDetail> mapOrderDetailList(List<OrderDetailDTO> orderDetailDTO);
}
