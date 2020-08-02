package com.order.service;

import com.order.entity.Order;
import com.order.exceptions.OrderNotFoundException;
import com.order.mapper.OrderEntityMapper;
import com.order.mapper.OrderResponseMapper;
import com.order.model.OrderRequest;
import com.order.model.OrderResponse;
import com.order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    @Autowired
    OrderEntityMapper orderEntityMapper;

    @Autowired
    OrderResponseMapper orderResponseMapper;

    @Autowired
    OrderItemService orderItemService;

    public void saveOrder(OrderRequest orderRequest) {
        Order order = orderRepository.save(orderEntityMapper.map(orderRequest));
        orderItemService.addOrderItem(orderRequest.getOrderItemRequest(), order.getOrderId());
    }

    public OrderResponse getOrder(Long orderId) {
        Order order = orderRepository.getOne(orderId);
        if(Objects.isNull(order)) {
            throw new OrderNotFoundException("Order Not found");
        }
        return orderResponseMapper.map(order, orderItemService.getOrderItem(orderId));
    }
}
