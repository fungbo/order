package com.bfeng.demo.order.application;

import com.bfeng.demo.order.application.dto.OrderDTO;
import com.bfeng.demo.order.application.exception.OrderNotFoundException;
import com.bfeng.demo.order.application.mapper.OrderMapper;
import com.bfeng.demo.order.domain.Order;
import com.bfeng.demo.order.domain.OrderResource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class OrderApplicationService {

    private final OrderResource orderResource;

    public OrderApplicationService(OrderResource orderResource) {
        this.orderResource = orderResource;
    }

    @Transactional(readOnly = true)
    public OrderDTO getOrderById(Long id) {
        Optional<Order> order = orderResource.getOrderById(id);

        return order.map(OrderMapper.INSTANCE::mapToOrderDTO)
                .orElseThrow(() -> OrderNotFoundException.builder().build());
    }
}
