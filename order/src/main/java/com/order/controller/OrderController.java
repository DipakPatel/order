package com.order.controller;

import com.order.model.OrderRequest;
import com.order.model.OrderResponse;
import com.order.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/api/order")
public class OrderController {
    private OrderService orderService;

    @PostMapping
    private ResponseEntity<OrderResponse> addOrderItem(@RequestBody OrderRequest orderRequest) {
        orderService.saveOrder(orderRequest);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{orderId}")
    private ResponseEntity<OrderResponse> getOrderItem(@PathVariable Long orderId) {
        return new ResponseEntity<>(orderService.getOrder(orderId), HttpStatus.OK);
    }
}
