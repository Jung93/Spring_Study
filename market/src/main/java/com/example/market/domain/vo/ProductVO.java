package com.example.market.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ProductVO {
    private long productNumber;
    private String productName;
    private String productPrice;
    private String productStock;
}
