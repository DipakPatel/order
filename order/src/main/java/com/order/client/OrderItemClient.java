package com.order.client;

import com.order.model.OrderItemRequest;
import com.order.model.OrderItemResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient("OrderItemClient")
public interface OrderItemClient {

    public List<OrderItemResponse> getOrderItem(@PathVariable Long orderId);

    public ResponseEntity addOrderItem(@RequestBody List<OrderItemRequest> orderItemRequest,
                                       @PathVariable Long orderId);
}
