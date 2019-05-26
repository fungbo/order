package com.bfeng.demo.order.domain;

import java.util.Optional;

public interface OrderResource {

    Optional<Order> getOrderById(Long id);
}
