package com.lai.design.pattern.func;

import com.lai.design.pattern.payment.IPayment;

/**
 * @author: laiweigeng
 * @Date: 2018/9/4 13:52
 */
public class Test {

    public static void main(String[] args){
        IPayment paymentPc = new BaofooPcFactory().getPayment();
        IPayment paymentApp = new BaofooAppFactory().getPayment();
        paymentPc.bindCard();
        paymentApp.bindCard();
    }
}
