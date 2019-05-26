package com.bfeng.demo.order.infrastructure;

import com.bfeng.demo.order.application.mapper.OrderMapper;
import com.bfeng.demo.order.domain.Order;
import com.bfeng.demo.order.domain.OrderResource;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class OrderResourceImpl implements OrderResource {

    private final OrderJpaRepository orderJpaRepository;

    public OrderResourceImpl(OrderJpaRepository orderJpaRepository) {
        this.orderJpaRepository = orderJpaRepository;
    }

    @Override
    public Optional<Order> getOrderById(Long id) {
        Optional<OrderEntity> entity = orderJpaRepository.findById(id);

        return entity.map(OrderMapper.INSTANCE::mapToOrder);
    }
}
