package com.lai.design.pattern.func;

import com.lai.design.pattern.payment.IPayment;
import com.lai.design.pattern.payment.WeiXinPcPay;

/**
 * @author: laiweigeng
 * @Date: 2018/9/4 16:44
 * 微信渠道工厂
 */
public class WeixinPcFactory implements Factory {
    @Override
    public IPayment getPayment() {
        return new WeiXinPcPay();
    }
}
