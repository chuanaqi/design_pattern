package com.lai.design.pattern.chain;

/**
 * 当请求数在大于等于20时有权处理，否则转到下一位
 * @author: laiweigeng
 * @Date: 2018/10/11 15:08
 */
public class ConcreteHandlerC extends AbstractHandler {
    @Override
    public void handleRequest(int request) {
        if (request >= 20) {
            System.out.println(this.getClass() + "  处理请求  " + request);
        }else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
