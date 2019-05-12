package com.yang.thread;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OrderDataHandler extends OrderHandler {
    @Override
    protected void process() {
        log.info("Order Data Save");
    }
}
