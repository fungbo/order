package com.bfeng.demo.order.application.mapper;

import com.bfeng.demo.order.application.dto.OrderDTO;
import com.bfeng.demo.order.domain.Order;
import com.bfeng.demo.order.infrastructure.OrderEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    OrderDTO mapToOrderDTO(Order order);

    Order mapToOrder(OrderEntity orderEntity);
}
