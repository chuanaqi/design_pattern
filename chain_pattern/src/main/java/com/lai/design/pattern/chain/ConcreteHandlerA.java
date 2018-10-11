package com.lai.design.pattern.chain;

/**
 * 当请求数在0~10之间时有权处理，否则转到下一位
 * @author: laiweigeng
 * @Date: 2018/10/11 15:08
 */
public class ConcreteHandlerA extends AbstractHandler {
    @Override
    public void handleRequest(int request) {
        if (request >= 0 && request < 10) {
            System.out.println(this.getClass() + "  处理请求  " + request);
        }else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
