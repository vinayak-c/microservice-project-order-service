package com.vinayak.microservice.orderservice.dto;

import com.vinayak.microservice.orderservice.model.OrderLineItems;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Builder
public class OrderDto {

    private List<OrderLineItems> orderLineItems;
}
