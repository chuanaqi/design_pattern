package com.lai.design.pattern.payment;

/**
 * @author: laiweigeng
 * @Date: 2018/9/4 14:05
 * 微信PC支付
 */
public class WeiXinPcPay implements IPayment {

    @Override
    public void bindCard() {
        System.out.println(this.getClass().getSimpleName()+"PC绑卡接口");
    }

    @Override
    public void pay() {
        System.out.println(this.getClass().getSimpleName()+"PC充值接口");
    }

    @Override
    public void withdraw() {
        System.out.println(this.getClass().getSimpleName()+"PC提现接口");
    }
}
