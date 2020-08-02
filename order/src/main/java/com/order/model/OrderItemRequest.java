package com.order.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class OrderItemRequest {
    private String productCode;
    private String productName;
    private Long quantity;
}
