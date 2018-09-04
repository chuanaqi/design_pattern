package com.lai.design.pattern.payment;

/**
 * @author: laiweigeng
 * @Date: 2018/9/4 14:01
 * 宝付APP支付
 */
public class BaofooAppPay implements IPayment {

    @Override
    public void bindCard() {
        System.out.println(this.getClass().getSimpleName()+"APP绑卡接口");
    }

    @Override
    public void pay() {
        System.out.println(this.getClass().getSimpleName()+"APP充值接口");
    }

    @Override
    public void withdraw() {
        System.out.println(this.getClass().getSimpleName()+"APP提现接口");
    }
}
