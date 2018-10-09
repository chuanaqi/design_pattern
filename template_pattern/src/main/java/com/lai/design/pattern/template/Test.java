package com.lai.design.pattern.template;

/**
 * @author: laiweigeng
 * @Date: 2018/10/9 17:45
 */
public class Test {
    public static void main(String[] args){
        BaofooPayment baofooPayment = new BaofooPayment();
        WeixinPayment weixinPayment = new WeixinPayment();

        baofooPayment.execute("");
        weixinPayment.execute("");
    }
}
