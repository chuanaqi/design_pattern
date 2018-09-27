package com.lai.design.pattern.decorator;

/**易宝支付渠道实现类
 * @author: laiweigeng
 * @Date: 2018/9/27 14:23
 */
public class Yeepay implements IPayment {
    @Override
    public String pay(String request) {
        System.out.println("易宝充值");
        return null;
    }
}
