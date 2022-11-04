package com.example.order.task;

import com.example.order.domain.dao.OrderDAO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class OrderTask {
    private final OrderDAO orderDAO;

    @Scheduled(cron = "0 0 0 * * *")
    public void insertSequence(){
            log.info("매일 0시에 자동으로 주문번호 초기화");
            orderDAO.saveOrderSequence();
    }

}
