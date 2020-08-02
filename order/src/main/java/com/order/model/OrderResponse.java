package com.order.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@Getter
public class OrderResponse {
    private Long orderId;
    private String customerName;
    private LocalDateTime orderDate;
    private String address;
    private List<OrderItemResponse> orderItemRequest;
    private double total;
}
