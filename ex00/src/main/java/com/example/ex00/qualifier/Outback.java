package com.example.ex00.qualifier;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@ToString
@Qualifier("outback")
public class Outback implements Resturant {
    @Override
    public boolean useSelfbar() {
        return true;
    }
//    public int price() {
//        return price - 3_000;
//    }
    private int price =  Resturant.price - 10_000;


}
