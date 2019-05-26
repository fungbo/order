package com.bfeng.demo.order.representation;

import com.bfeng.demo.order.application.OrderApplicationService;
import com.bfeng.demo.order.application.dto.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class OrderController {

    private final OrderApplicationService orderApplicationService;

    public OrderController(OrderApplicationService orderApplicationService) {
        this.orderApplicationService = orderApplicationService;
    }

    @GetMapping("/orders/{id}")
    public OrderDTO getOrderById(@PathVariable Long id) {
        return orderApplicationService.getOrderById(id);
    }
}
