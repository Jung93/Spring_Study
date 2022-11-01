package com.example.ex00.dependency;

import com.example.ex00.qualifier.Outback;
import com.example.ex00.qualifier.Resturant;
import com.example.ex00.qualifier.Vips;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class QualifierTest {

//    @Autowired @Qualifier("desktop")
//    private Computer desktop;
//    @Autowired @Qualifier("laptop")
//    private Computer laptop;
//    @Autowired
//    private Computer computer;
//
//    @Test
//    public void qualifierTest(){
//        log.info(desktop + "");
//        log.info(laptop + "");
//        log.info(computer + "");
//    }

    @Autowired @Qualifier("outback")
    private Outback outback;
    @Autowired @Qualifier("vips")
    private Vips vips;
    @Autowired
    private Resturant resturant;

    @Test
    public void qualifierTest(){
        log.info(outback.useSelfbar() + "");
        log.info(outback + "");
        log.info(vips.useSelfbar() + "");
        log.info(vips + "");
    }
}
