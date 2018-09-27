package com.lai.design.pattern.decorator;

/**
 * @author: laiweigeng
 * @Date: 2018/9/27 14:26
 */
public class PaymentDecoratorMessageParseDecorator extends PaymentDecorator {

    public PaymentDecoratorMessageParseDecorator(IPayment payment){
        super(payment);
    }
    @Override
    public String pay(String request) {
        request = parseRequest(request);
        return parseResponse(super.pay(request));
    }

    public String parseRequest(String request){
        System.out.println("请求参数解析");
        return request;
    }
    public String parseResponse(String response){
        System.out.println("返回参数解析");
        return response;
    }

}
