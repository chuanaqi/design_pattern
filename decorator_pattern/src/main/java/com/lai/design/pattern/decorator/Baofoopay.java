package com.lai.design.pattern.decorator;

/**宝付支付渠道实现类
 * @author: laiweigeng
 * @Date: 2018/9/27 14:23
 */
public class Baofoopay implements IPayment {
    @Override
    public String pay(String request) {
        System.out.println("宝付充值");
        return null;
    }
}
