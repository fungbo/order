package com.bfeng.domain.demo.order.application;

import com.bfeng.domain.Order;
import com.bfeng.domain.OrderResource;
import com.bfeng.domain.demo.order.application.dto.OrderDTO;
import com.bfeng.domain.demo.order.application.exception.OrderNotFoundException;
import com.bfeng.domain.demo.order.application.mapper.OrderMapper;
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
