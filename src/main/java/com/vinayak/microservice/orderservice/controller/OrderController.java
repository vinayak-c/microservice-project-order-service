package com.vinayak.microservice.orderservice.controller;

import com.vinayak.microservice.orderservice.dto.OrderDto;
import com.vinayak.microservice.orderservice.model.Order;
import com.vinayak.microservice.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/order")
@Slf4j
@RequiredArgsConstructor
public class OrderController {

    private final OrderRepository orderRepository;

    @PostMapping
    public String placeOrder(@RequestBody OrderDto orderDto){
        Order order = new Order();
        order.setOrderLineItems(orderDto.getOrderLineItems());
        order.setOrderNumber(UUID.randomUUID().toString());

        orderRepository.save(order);
        return "Order Placed Successfully";
    }
}
