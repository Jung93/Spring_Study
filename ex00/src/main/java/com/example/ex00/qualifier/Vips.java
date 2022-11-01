package com.example.ex00.qualifier;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ToString
@Qualifier("vips") @Primary
public class Vips implements Resturant {
    @Override
    public boolean useSelfbar() {
        return false;
    }
//    public int price() {
//        return price - 1_000;
//    }

    private int price =  Resturant.price - 15_000;
}
