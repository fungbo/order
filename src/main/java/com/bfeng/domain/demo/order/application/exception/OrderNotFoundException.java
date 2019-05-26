package com.bfeng.domain.demo.order.application.exception;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class OrderNotFoundException extends RuntimeException {
}
