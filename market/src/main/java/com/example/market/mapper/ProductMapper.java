package com.example.market.mapper;

import com.example.market.domain.vo.ProductVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    //상품목록
    public List<ProductVO> getList();

}
