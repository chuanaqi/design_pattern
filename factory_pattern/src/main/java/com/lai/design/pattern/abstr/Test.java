package com.lai.design.pattern.abstr;

import com.lai.design.pattern.payment.IPayment;

/**
 * @author: laiweigeng
 * @Date: 2018/9/4 17:33
 */
public class Test {
    public static void main(String[] args){
        AbstractFactory appFactory = new AppPlatformFactory();
        IPayment appPayment = appFactory.getBaofooPay();
        appPayment.bindCard();
        AbstractFactory pcFactory = new PcPlatformFactory();
        IPayment pcPayment = pcFactory.getBaofooPay();
        pcPayment.bindCard();
    }
}
