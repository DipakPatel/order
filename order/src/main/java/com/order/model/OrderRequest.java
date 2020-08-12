package com.order.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@Getter
public class OrderRequest {
    @NotBlank(message = "Customer name required ")
    private String customerName;
    @NotNull(message = "Order date required ")
    private LocalDateTime orderDate;
    @NotBlank(message = "Customer address required ")
    private String address;
    @NotNull(message = "Order item required ")
    private List<OrderItemRequest> orderItemRequest;
    @NotBlank(message = "Total is required ")
    private Double total;
}
