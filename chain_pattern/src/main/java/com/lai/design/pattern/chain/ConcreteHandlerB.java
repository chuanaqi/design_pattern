package com.lai.design.pattern.chain;

/**
 * 当请求数在10~20之间时有权处理，否则转到下一位
 * @author: laiweigeng
 * @Date: 2018/10/11 15:08
 */
public class ConcreteHandlerB extends AbstractHandler {
    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println(this.getClass() + "  处理请求  " + request);
        }else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
