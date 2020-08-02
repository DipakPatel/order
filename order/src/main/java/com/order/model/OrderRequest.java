package com.order.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@Getter
public class OrderRequest {
    private String customerName;
    private LocalDateTime orderDate;
    private String address;
    private List<OrderItemRequest> orderItemRequest;
    private double total;
}
