package com.order.service;

import com.order.client.OrderItemClient;
import com.order.model.OrderItemRequest;
import com.order.model.OrderItemResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class OrderItemService {
    @Autowired
    OrderItemClient orderItemClient;

    public List<OrderItemResponse> getOrderItem(Long orderId) {
        return orderItemClient.getOrderItem(orderId);
    }

    public ResponseEntity addOrderItem(@RequestBody List<OrderItemRequest> orderItemRequest,
                                       @PathVariable Long orderId) {
        return orderItemClient.addOrderItem(orderItemRequest, orderId);
    }
}
