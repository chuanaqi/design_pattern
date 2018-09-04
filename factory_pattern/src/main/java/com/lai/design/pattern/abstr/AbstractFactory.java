package com.lai.design.pattern.abstr;

import com.lai.design.pattern.payment.IPayment;

/**
 * @author: laiweigeng
 * @Date: 2018/9/4 17:57
 */
public interface AbstractFactory {
    /**
     * 创建微信支付实例
     * @return
     */
    IPayment getWeixinPay();

    /**
     * 穿件宝付支付实例
     * @return
     */
    IPayment getBaofooPay();

}
