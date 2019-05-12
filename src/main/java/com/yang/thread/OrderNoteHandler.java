package com.yang.thread;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OrderNoteHandler extends OrderHandler {
    @Override
    protected void process() {
        log.info("Generate consignment note");
    }
}
