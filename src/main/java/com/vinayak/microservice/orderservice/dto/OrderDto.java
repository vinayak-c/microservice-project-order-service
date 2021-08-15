package com.vinayak.microservice.orderservice.dto;

import com.vinayak.microservice.orderservice.model.OrderLineItems;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDto {

    private List<OrderLineItems> orderLineItems;
}
