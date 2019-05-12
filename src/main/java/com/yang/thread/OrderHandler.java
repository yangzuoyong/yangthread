package com.yang.thread;

public abstract class OrderHandler {
    /**同样先执行自己的动作 再调用Order的proceed去遍历下一个Handler*/
    public void execute(Order order) {
        this.process();
        if (null != order) {
            order.proceed();
        }
    }

    protected abstract void process();
}
