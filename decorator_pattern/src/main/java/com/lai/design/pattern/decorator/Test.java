package com.lai.design.pattern.decorator;

/**
 * @author: laiweigeng
 * @Date: 2018/9/27 14:37
 */
public class Test {

    public static void main(String[] args){
        Baofoopay baofoopay = new Baofoopay();
        Yeepay yeepay = new Yeepay();
        PaymentDecoratorMessageParseDecorator
                baofooDecorator = new PaymentDecoratorMessageParseDecorator(baofoopay);
        PaymentDecoratorMessageParseDecorator
                yeepyDecorator = new PaymentDecoratorMessageParseDecorator(yeepay);

        String request = "";
        baofooDecorator.pay(request);
        System.out.println("--------------------------------");
        yeepyDecorator.pay(request);

    }
}
