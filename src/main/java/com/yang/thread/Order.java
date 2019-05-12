package com.yang.thread;

import java.util.List;

public class Order extends Thread {
    /**Order处理列表*/
    private List<OrderHandler> orderHandlers;
    /**handlers游标*/
    private int index = -1;

    public Order(List<OrderHandler> orderHandlers) {
        this.orderHandlers = orderHandlers;
    }

    /**通过index自增，调用execute实现递归，遍历整个handlers*/
    public void proceed() {
        if (index == orderHandlers.size() - 1) {
            return;
        }
        orderHandlers.get(++index).execute(this);
    }

    @Override
    public void run() {
        this.proceed();
    }
}
