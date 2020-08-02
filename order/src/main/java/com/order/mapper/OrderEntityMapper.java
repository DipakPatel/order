package com.order.mapper;

import com.order.entity.Order;
import com.order.model.OrderRequest;
import org.springframework.stereotype.Component;

@Component
public class OrderEntityMapper {
    public Order map(OrderRequest orderRequest) {
        return new Order(orderRequest.getCustomerName(), orderRequest.getOrderDate()
        , orderRequest.getAddress(), orderRequest.getTotal());
    }
}
