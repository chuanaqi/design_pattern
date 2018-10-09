package com.lai.design.pattern.template;

/**微信支付
 * @author: laiweigeng
 * @Date: 2018/10/9 17:41
 */
public class WeixinPayment extends AbstractPayment {
    @Override
    public String requestParamProcess(String request) {
        System.out.println(this.getClass().getSimpleName()+"渠道支付请求报文处理");
        return request;
    }

    @Override
    public String responseParamProcess(String response) {
        System.out.println(this.getClass().getSimpleName()+"渠道支付返回报文处理");

        return response;
    }

    @Override
    public String httpClient(String request) {
        System.out.println(this.getClass().getSimpleName()+"渠道支付发送请求");

        return request;
    }
}
