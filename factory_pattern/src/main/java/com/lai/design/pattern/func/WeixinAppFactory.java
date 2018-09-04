package com.lai.design.pattern.func;

import com.lai.design.pattern.payment.IPayment;
import com.lai.design.pattern.payment.WeiXinAppPay;

/**
 * @author: laiweigeng
 * @Date: 2018/9/4 16:44
 * 微信APP端渠道工厂
 */
public class WeixinAppFactory implements Factory {
    @Override
    public IPayment getPayment() {
        return new WeiXinAppPay();
    }
}
