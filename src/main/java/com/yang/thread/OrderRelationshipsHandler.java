package com.yang.thread;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OrderRelationshipsHandler extends OrderHandler {
    @Override
    protected void process() {
        log.info("Generate order list relationships");
    }
}
