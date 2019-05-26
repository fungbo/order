package com.bfeng.demo.order.infrastructure;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Builder
@Table(name = "order")
@NoArgsConstructor
@AllArgsConstructor
public class OrderEntity {

    private Long id;

    private String serialNo;

    private String merchantId;
}
