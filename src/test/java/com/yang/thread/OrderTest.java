package com.yang.thread;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

@Slf4j
public class OrderTest {
    @Test
    public void Test() {
        List<OrderHandler> orderHandlers = Arrays.asList(new OrderDataHandler(), new OrderNoteHandler(), new OrderRelationshipsHandler());
        Order order = new Order(orderHandlers);
        order.start();
        log.info("Order handler begin");
    }
}
