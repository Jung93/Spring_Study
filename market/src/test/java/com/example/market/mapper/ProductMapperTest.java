package com.example.market.mapper;

import com.example.market.domain.vo.ProductVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class ProductMapperTest {
    @Autowired
    private ProductMapper productMapper;

    @Test
    public void getListTest(){
        productMapper.getList().stream().map(ProductVO::toString).forEach(log::info);
    }



}
