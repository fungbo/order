package com.bfeng.demo.order.application;

import com.bfeng.demo.UT;
import com.bfeng.demo.order.application.dto.OrderDTO;
import com.bfeng.demo.order.domain.Order;
import com.bfeng.demo.order.domain.OrderResource;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

class OrderApplicationServiceTest extends UT {

    @Mock
    private OrderResource orderResource;

    @InjectMocks
    private OrderApplicationService orderApplicationService;

    @Test
    void should_return_orderDTO_when_order_can_be_found_by_id() {
        when(orderResource.getOrderById(anyLong())).thenReturn(Optional.of(Order.builder().id(1L).build()));

        OrderDTO orderDTO = orderApplicationService.getOrderById(1L);

        assertEquals(1, orderDTO.getId().longValue());
    }
}
