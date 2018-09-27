package com.lai.design.pattern.decorator;

/**支付抽象接口
 * @author: laiweigeng
 * @Date: 2018/9/27 14:19
 */
public interface IPayment {
    /**
     * 支付充值接口
     * @param request 充值请求参数
     * @return 充值返回参数
     */
    String pay(String request);
}
