package com.example.market.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class OrderVO {
    private long orderNumber;
    private String productNumber;
    private String productName;
    private long orderCount;
    private String orderDate;
    private String orderOrderer;
    private String orderAddress;
}
