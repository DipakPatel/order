package com.order.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@RequiredArgsConstructor
@Builder
public class Order {
    @Id
    @GeneratedValue
    private Long orderId;
    private final String customerName;
    private final  LocalDateTime orderDate;
    private final  String address;
    private final  double total;
}
