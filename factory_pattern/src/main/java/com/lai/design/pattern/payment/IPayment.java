package com.lai.design.pattern.payment;

/**
 * @author: laiweigeng
 * @Date: 2018/9/4 13:56
 * 支付公用接口
 */
public interface IPayment {

    /**
     * 绑卡接口
     */
    void bindCard();

    /**
     * 充值接口
     */
    void pay();

    /**
     * 提现接口
     */
    void withdraw();
}
