package com.lai.design.pattern.decorator;

/**
 * @author: laiweigeng
 * @Date: 2018/9/27 14:33
 */
public class PaymentDecorator implements IPayment {
    private IPayment payment;
    public PaymentDecorator(IPayment payment){
        this.payment = payment;
    }
    @Override
    public String pay(String request) {
        return payment.pay(request);
    }
}
