package com.order.mapper;

import com.order.entity.Order;
import com.order.model.OrderItemResponse;
import com.order.model.OrderResponse;

import java.util.List;

public class OrderResponseMapper {
    public OrderResponse map(Order order, List<OrderItemResponse> orderItemResponse) {
        return new OrderResponse(
                order.getOrderId(),
                order.getCustomerName(),
                order.getOrderDate(),
                order.getAddress(),
                orderItemResponse,
                order.getTotal()
        );
    }
}
