package com.bfeng.domain.demo.order.application.mapper;

import com.bfeng.domain.Order;
import com.bfeng.domain.demo.order.application.dto.OrderDTO;
import com.bfeng.domain.demo.order.infrastructure.OrderEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    OrderDTO mapToOrderDTO(Order order);

    Order mapToOrder(OrderEntity orderEntity);
}
